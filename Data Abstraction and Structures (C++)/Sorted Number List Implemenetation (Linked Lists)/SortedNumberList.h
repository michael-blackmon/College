#ifndef SORTEDNUMBERLIST_H
#define SORTEDNUMBERLIST_H
#include "Node.h"

class SortedNumberList
{
private:
   // Optional: Add any desired private functions here

public:
   Node *head;
   Node *tail;

   SortedNumberList()
   {
      head = nullptr;
      tail = nullptr;
   }

   // Inserts the number into the list in the correct position such that the
   // list remains sorted in ascending order.
   void Insert(double number)
   {
      // Your code here
      Node *newNode = new Node(number);

      if (head == nullptr)
      {
         // If the list is empty, the new node becomes the head and tail
         head = newNode;
         tail = newNode;
      }
      else if (number <= head->GetData())
      {
         // If the number is smaller than or equal to the head, insert at the beginning
         newNode->SetNext(head);
         head->SetPrevious(newNode);
         head = newNode;
      }
      else if (number >= tail->GetData())
      {
         // If the number is greater than or equal to the tail, insert at the end
         tail->SetNext(newNode);
         newNode->SetPrevious(tail);
         tail = newNode;
      }
      else
      {
         // Insert the node in the proper sorted position
         Node *current = head;
         while (current->GetNext() != nullptr && current->GetNext()->GetData() < number)
         {
            current = current->GetNext();
         }
         newNode->SetNext(current->GetNext());
         newNode->SetPrevious(current);
         current->SetNext(newNode);
         newNode->GetNext()->SetPrevious(newNode);
      }
   }

   // Removes the node with the specified number value from the list. Returns
   // true if the node is found and removed, false otherwise.
   bool Remove(double number)
   {
      // Your code here (remove placeholder line below)
      if (head == nullptr)
      {
         return false;
      }

      // If the number to remove is at the head of the list
      if (head->GetData() == number)
      {
         Node *temp = head;
         head = head->GetNext();
         if (head)
         {
            head->SetPrevious(nullptr);
         }
         else
         {
            tail = nullptr;
         }
         delete temp;
         return true;
      }

      // Search for the number to remove
      Node *current = head;
      while (current->GetNext() != nullptr && current->GetNext()->GetData() != number)
      {
         current = current->GetNext();
      }

      // If the number is found, remove it from the list
      if (current->GetNext() != nullptr)
      {
         Node *temp = current->GetNext();
         current->SetNext(temp->GetNext());
         if (temp->GetNext() != nullptr)
         {
            temp->GetNext()->SetPrevious(current);
         }
         else
         {
            tail = current;
         }
         delete temp;
         return true;
      }

      // Number not found in the list
      return false;
   }
};

#endif
