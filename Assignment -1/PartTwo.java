/*
    MICHAEL BLACKMON
    CIS D035A 16Z
    ASSIGNMENT -1 PART TWO
    DUE 7/7/23
    DATE SUBMITTED 7/7/23
 */

/*
*****************************************************************************************************************************
                                                        DESIGN
VARIABLES:  (double) - temp, convTemp - need doubles to hold user inputted temperature value, and converted temperature value
            (String) - type, confirm - need strings to read whether user wants to convert from Celsius or Fahrenheit, and also
                                      if user wants to convert more or exit program

INPUT:      Uses scanner to take input for unit type and temperature value
   EX:      System.out.printf("\n%s", "Now enter your temperature: \n");
            double temp = input.nextDouble();

PROCESSING: Use functions & if/else statements & while loops to process user input, determine which calculations to run,
            and which outputs to display to user.

PRINTING:   Use printf() to display calculated temperature conversions to user, with precision 2
      EX:   System.out.printf("\n%.2f %s %.2f %s", temp, "°C converted temperature in Fahrenheit is: ", convTemp, "°F");

 */

/*
*****************************************************************************************************************************
                                                        TEST CASES
                        TEST CASE 1:
Welcome to Temperature Converter! Please enter 'C' if you are converting from Celsius, or 'F' if you are converting from Fahrenheit:
fa

Please enter a valid input: 'C', 'F', 'Celsius', or 'Fahrenheit', thank you.
f

Now enter your temperature:
65

65.00 °F converted temperature in Celsius is:  18.33 °C
Would you like to convert another temperature? (Y/N):
y

Welcome to Temperature Converter! Please enter 'C' if you are converting from Celsius, or 'F' if you are converting from Fahrenheit:
CELSIUS

Now enter your temperature:
-12

-12.00 °C converted temperature in Fahrenheit is:  10.40 °F
Would you like to convert another temperature? (Y/N):
n
Have a nice day!
Process finished with exit code 0

                        TEST CASE 2:
 Welcome to Temperature Converter! Please enter 'C' if you are converting from Celsius, or 'F' if you are converting from Fahrenheit:
c

Now enter your temperature:
20

20.00 °C converted temperature in Fahrenheit is:  68.00 °F
Would you like to convert another temperature? (Y/N):
y

Welcome to Temperature Converter! Please enter 'C' if you are converting from Celsius, or 'F' if you are converting from Fahrenheit:
f

Now enter your temperature:
68

68.00 °F converted temperature in Celsius is:  20.00 °C
Would you like to convert another temperature? (Y/N):
n
Have a nice day!
Process finished with exit code 0

                        TEST CASE 3:
Welcome to Temperature Converter! Please enter 'C' if you are converting from Celsius, or 'F' if you are converting from Fahrenheit:
c

Now enter your temperature:
0

0.00 °C converted temperature in Fahrenheit is:  32.00 °F
Would you like to convert another temperature? (Y/N):
y

Welcome to Temperature Converter! Please enter 'C' if you are converting from Celsius, or 'F' if you are converting from Fahrenheit:
f

Now enter your temperature:
32

32.00 °F converted temperature in Celsius is:  0.00 °C
Would you like to convert another temperature? (Y/N):
n
Have a nice day!
Process finished with exit code 0

                        TEST CASE 4:
Welcome to Temperature Converter! Please enter 'C' if you are converting from Celsius, or 'F' if you are converting from Fahrenheit:
f

Now enter your temperature:
-10

-10.00 °F converted temperature in Celsius is:  -23.33 °C
Would you like to convert another temperature? (Y/N):
n
Have a nice day!
Process finished with exit code 0

 */





//*****************************************************************************************************************************
import java.util.Scanner;

public class PartTwo {

    //declare function to convert temperature, takes string and double, returns converted temperature as double
    public static double tempConverter(String type, double temp){
        //declare variable inside function to store converted temperature
        double convTemp = 0;
        //using equalsIgnoreCase function to compare user-inputted string to determine correct calculation for conversion
        if(type.equalsIgnoreCase("celsius") || type.equalsIgnoreCase("c")){
            convTemp = (temp * 9.0/5) + 32;
        } else if(type.equalsIgnoreCase("fahrenheit") || type.equalsIgnoreCase("f")){
            convTemp = (temp - 32) * (5.0/9);
        }
        //returns converted temperature value
        return convTemp;
    }


    //    function to begin the temperature converter program. This function asks user which temperature unit they would like to convert from, then asks
//    for the temperature value, then calls to the function above which calculates and returns the converted temperature, then asks user if they would
//    like to convert another temperature, which will loop again or exit program.
    static void convertTemp(){
        Scanner input = new Scanner(System.in);
        double convTemp;

        System.out.printf("\n%s", "Welcome to Temperature Converter! Please enter 'C' if you are converting from Celsius, or 'F' if you are converting from Fahrenheit:\n");
        String type = input.nextLine();
        //while user-inputted
        while (!(type.equalsIgnoreCase("fahrenheit") || type.equalsIgnoreCase("celsius") || type.equalsIgnoreCase("c") || type.equalsIgnoreCase("f"))) {
            System.out.printf("\n%s", "Please enter a valid input: 'C', 'F', 'Celsius', or 'Fahrenheit', thank you.\n");
            type = input.nextLine();
        }
        System.out.printf("\n%s", "Now enter your temperature: \n");
        double temp = input.nextDouble();

        input.nextLine(); //Consumes remaining newline character

        //display converted temperature:
        convTemp = tempConverter(type, temp);
        if (type.equalsIgnoreCase("celsius") || type.equalsIgnoreCase("c")) {
            System.out.printf("\n%.2f %s %.2f %s", temp, "°C converted temperature in Fahrenheit is: ", convTemp, "°F");
        } else {
            System.out.printf("\n%.2f %s %.2f %s", temp, "°F converted temperature in Celsius is: ", convTemp, "°C");
        }

        System.out.printf("\n%s", "Would you like to convert another temperature? (Y/N): \n");
        String confirm = input.nextLine();//waits for user to re-run or exit program
        while(confirm.equalsIgnoreCase("Y") || confirm.equalsIgnoreCase("yes")){
            confirm = "N"; //Resets user input before running function again to avoid infinite recursion
            convertTemp();
        }
    }

    public static void main(String[] args) {
        //Run the initial function as program begins
        convertTemp();
        //Says goodbye to user before program exits
        System.out.printf("%s","Have a nice day!");

    }
}