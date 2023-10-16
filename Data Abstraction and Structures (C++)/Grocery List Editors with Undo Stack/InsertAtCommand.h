#ifndef INSERTATCOMMAND_H
#define INSERTATCOMMAND_H

#include <string>
#include <vector>
#include "UndoCommand.h"

class InsertAtCommand : public UndoCommand
{
private:
   // Your member variable declarations here
   std::vector<std::string> *sourceVector;
   int insertIndex;
   std::string item;

public:
   // Your constructor code here
   InsertAtCommand(std::vector<std::string> *vector, int index, const std::string &newItem)
       : sourceVector(vector), insertIndex(index), item(newItem)
   {
   }

   void Execute() override
   {
      // Your code here
      sourceVector->insert(sourceVector->begin() + insertIndex, item);
   }

   void UndoInsert()
   {
      // Remove the inserted item from the vector
      sourceVector->erase(sourceVector->begin() + insertIndex);
   }
};

#endif