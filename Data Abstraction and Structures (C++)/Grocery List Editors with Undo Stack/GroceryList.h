#ifndef GROCERYLIST_H
#define GROCERYLIST_H

#include <iostream>
#include <stack>
#include "UndoCommand.h"
#include "RemoveLastCommand.h"
#include "InsertAtCommand.h"
#include "SwapCommand.h"

class GroceryList
{
protected:
   std::vector<std::string> listItems;
   std::stack<UndoCommand *> undoStack;

public:
   virtual void AddWithUndo(std::string newItemName)
   {
      // Add the new list item
      listItems.push_back(newItemName);

      // Make an undo command that removes the last item and push onto stack
      undoStack.push(new RemoveLastCommand(&listItems));
   }

   virtual void RemoveAtWithUndo(int removalIndex)
   {
      // Your code here
      // Ensure the index is valid
      if (removalIndex >= 0 && removalIndex < GetListSize())
      {
         // Store the removed item for undo
         std::string removedItem = listItems[removalIndex];

         // Remove the item from the list
         listItems.erase(listItems.begin() + removalIndex);

         // Create a new InsertAtCommand object and push onto stack for undo
         undoStack.push(new InsertAtCommand(&listItems, removalIndex, removedItem));
      }
      else
      {
         std::cout << "Invalid index for removal operation." << std::endl;
      }
   }

   virtual void SwapWithUndo(int index1, int index2)
   {
      // Your code here
      if (index1 >= 0 && index1 < GetListSize() && index2 >= 0 && index2 < GetListSize())
      {
         // Swap items in the list
         std::swap(listItems[index1], listItems[index2]);

         // Create a new SwapCommand object and push onto stack for undo
         undoStack.push(new SwapCommand(&listItems, index1, index2));
      }
      else
      {
         std::cout << "Invalid indices for swap operation." << std::endl;
      }
   }

   // Pops and executes the undo command at the top of the undo stack. Then
   // deletes the executed command.
   virtual void ExecuteUndo()
   {
      // Your code here
      if (!undoStack.empty())
      {
         // Pop the top UndoCommand from the stack
         UndoCommand *undoCommand = undoStack.top();
         undoStack.pop();

         // Execute the undo command
         undoCommand->Execute();

         // Delete the executed undo command to prevent memory leaks
         delete undoCommand;
      }
      else
      {
         // Print a message if the undo stack is empty
         std::cout << "Cannot execute undo because undo stack is empty" << std::endl;
      }
   }

   virtual int GetListSize() const
   {
      return (int)listItems.size();
   }

   virtual int GetUndoStackSize() const
   {
      return (int)undoStack.size();
   }

   virtual std::vector<std::string> GetVectorCopy() const
   {
      return listItems;
   }

   virtual void Print(std::ostream &outputStream)
   {
      for (size_t i = 0; i < listItems.size(); i++)
      {
         outputStream << i << ". " << listItems[i] << std::endl;
      }
   }
};

#endif