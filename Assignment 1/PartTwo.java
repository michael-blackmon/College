/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 1 PART TWO
DUE 7/12/23
SUBMITTED 7/12/23
 */

/*
                                                         DESIGN
VARIABLES: (long) - n, used to hold user inputted value
           (double) - result, used to hold value of resulting sqrt

INPUT:  Uses Scanner to take user input for variable n
EX:     System.out.printf("%s\n","Please enter a number to find it's square root: ");
            long n = input.nextLong();

PROCESSING: function for calculating the sqrt and function for verifying positive input has been entered
EX:         public static boolean checkPositive(double num)
    {
        return (num >= 0);
    }

PRINTING:   Using printf() to format display to user. Prints the sqrt of given value.
 */

/*
                                                        TEST CASES
                        TEST CASE #1
Please enter a number to find it's square root:
-1
Please enter only a positive number
-9
Please enter only a positive number
9
Square root of  9  is:  3.00
Process finished with exit code 0

                        TEST CASE #2
Please enter a number to find it's square root:
12
Square root of  12  is:  3.46
Process finished with exit code 0

                        TEST CASE #3
Please enter a number to find it's square root:
-5
Please enter only a positive number
5
Square root of  5  is:  2.24
Process finished with exit code 0
 */

import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //open Scanner to take input from user
        System.out.printf("%s\n","Please enter a number to find it's square root: "); //prompt user to enter positive number
        long n = input.nextLong(); //declare variable n to hold value of user input
        while(!checkPositive(n)){ //runs checkPositive function to verify input is positive, if not then prompts user again
            System.out.printf("%s","Please enter only a positive number\n");
            n = input.nextLong();//re-prompt user to enter positive value if value entered was negative
        }

        double result = sqrt(n);
        System.out.printf("%s %d %s %.2f","Square root of ",n," is: ",result);
    }

    //CHECKS IF USER INPUTTED VALUE IS POSITIVE, RETURNS T/F
    public static boolean checkPositive(double num)
    {
        return (num >= 0);
    }

    //CALCULATES THE SQUARE ROOT OF THE GIVEN POSITIVE VALUE USING BABYLONIAN METHOD
    public static double sqrt(long n)
    {
        double lastGuess = 1.0;
        double nextGuess = (lastGuess + n / lastGuess) / 2.0;

        while (Math.abs(nextGuess - lastGuess) >= 0.0001){ //using Math.abs to find absolute value of difference, or else calculation can be off.
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
        }
        return nextGuess;
    }

}
