#ifndef SWAPCOMMAND_H
#define SWAPCOMMAND_H

#include <string>
#include <vector>
#include "UndoCommand.h"

class SwapCommand : public UndoCommand
{
private:
   // Your member variable declarations here
   std::vector<std::string> *sourceVector;
   int index1;
   int index2;
   std::string item1;
   std::string item2;

public:
   // Your constructor code here
   SwapCommand(std::vector<std::string> *vector, int n1, int n2)
       : sourceVector(vector), index1(n1), index2(n2)
   {
      item1 = (*sourceVector)[index1];
      item2 = (*sourceVector)[index2];
   }

   void Execute() override
   {
      // Your code here
      std::swap((*sourceVector)[index1], (*sourceVector)[index2]);
   }

   void UndoSwap()
   {
      std::swap((*sourceVector)[index1], (*sourceVector)[index2]);
   }
};

#endif