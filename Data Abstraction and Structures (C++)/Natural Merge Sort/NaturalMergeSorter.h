#ifndef NATURALMERGESORTER_H
#define NATURALMERGESORTER_H

class NaturalMergeSorter
{
public:
   virtual int GetSortedRunLength(int *array, int arrayLength, int startIndex)
   {
      // Your code here
      if (startIndex < 0 || startIndex >= arrayLength)
      {
         return 0;
      }

      int sortedRunLength = 1;
      int currentIndex = startIndex;
      while (currentIndex < arrayLength - 1 && array[currentIndex] <= array[currentIndex + 1])
      {
         currentIndex++;
         sortedRunLength++;
      }
      return sortedRunLength;
   }

   virtual void NaturalMergeSort(int *array, int arrayLength)
   {
      // Your code here
      int i = 0;

      while (true)
      {
         int firstRunLength = GetSortedRunLength(array, arrayLength, i);

         if (firstRunLength == arrayLength)
         {
            return;
         }

         if (i + firstRunLength == arrayLength)
         {
            i = 0;
            continue;
         }

         int secondRunLength = GetSortedRunLength(array, arrayLength, i + firstRunLength);

         Merge(array, i, i + firstRunLength - 1, i + firstRunLength + secondRunLength - 1);

         i = i + firstRunLength + secondRunLength;
      }
   }

   virtual void Merge(int *numbers, int leftFirst, int leftLast,
                      int rightLast)
   {
      int mergedSize = rightLast - leftFirst + 1;
      int *mergedNumbers = new int[mergedSize];
      int mergePos = 0;
      int leftPos = leftFirst;
      int rightPos = leftLast + 1;

      // Add smallest element from left or right partition to merged numbers
      while (leftPos <= leftLast && rightPos <= rightLast)
      {
         if (numbers[leftPos] <= numbers[rightPos])
         {
            mergedNumbers[mergePos] = numbers[leftPos];
            leftPos++;
         }
         else
         {
            mergedNumbers[mergePos] = numbers[rightPos];
            rightPos++;
         }
         mergePos++;
      }

      // If left partition isn't empty, add remaining elements to mergedNumbers
      while (leftPos <= leftLast)
      {
         mergedNumbers[mergePos] = numbers[leftPos];
         leftPos++;
         mergePos++;
      }

      // If right partition isn't empty, add remaining elements to mergedNumbers
      while (rightPos <= rightLast)
      {
         mergedNumbers[mergePos] = numbers[rightPos];
         rightPos++;
         mergePos++;
      }

      // Copy merged numbers back to numbers
      for (mergePos = 0; mergePos < mergedSize; mergePos++)
      {
         numbers[leftFirst + mergePos] = mergedNumbers[mergePos];
      }

      // Free temporary array
      delete[] mergedNumbers;
   }
};

#endif