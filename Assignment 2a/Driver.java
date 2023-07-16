/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 2a
DUE 7/15/23
SUBMITTED 7/15/23
 */
/*
                                                        DESIGN
VARIABLES: (String) - name, address, phoneNumber - Needed to store user inputted values
           (int) - age - Stores user inputted value for age

INPUT:      Uses Scanner class to take input from user to hold values in declared variables above

PROCESSING: The Person class includes a constructor with getter/setter methods for each variable above

PRINTING:  Person class includes a print() method to display the inputted valuables back to user
 */
/*
                                                        TEST CASES
                        TEST CASE #1
Enter the new person's name: name1
Enter their address: address1
Enter their age (numerical values only): 1
Enter their phone number: 123456789
Enter the new person's name: name2
Enter their address: address2
Enter their age (numerical values only): 2
Enter their phone number: 987654321
Enter the new person's name: name3
Enter their address: address3
Enter their age (numerical values only): 3
Enter their phone number: 192837465
Name: name1
Address: address1
Age: 1
Phone Number: 123456789
Name: name2
Address: address2
Age: 2
Phone Number: 987654321
Name: name3
Address: address3
Age: 3
Phone Number: 192837465

Process finished with exit code 0

                        TEST CASE #2
Enter the new person's name: stacy
Enter their address: 123 this place
Enter their age (numerical values only): 72
Enter their phone number: 7975979
Enter the new person's name: Robert
Enter their address: 867 that place
Enter their age (numerical values only): 09
Enter their phone number: 985547568
Enter the new person's name: Django
Enter their address: 5301 house ct.
Enter their age (numerical values only): 35
Enter their phone number: 975984729
Name: stacy
Address: 123 this place
Age: 72
Phone Number: 7975979
Name: Robert
Address: 867 that place
Age: 9
Phone Number: 985547568
Name: Django
Address: 5301 house ct.
Age: 35
Phone Number: 975984729

Process finished with exit code 0

                        TEST CASE #3
Enter the new person's name: newPerson
Enter their address: newAddress
Enter their age (numerical values only): 6
Enter their phone number: 957492379
Enter the new person's name: Jimothy
Enter their address: 123 old country rd.
Enter their age (numerical values only): 99
Enter their phone number: 759342679
Enter the new person's name: Samuel L. Jackson
Enter their address: 6845 SomewhereInLAMaybe Dr.
Enter their age (numerical values only): 74
Enter their phone number: surprisinglyold
Name: newPerson
Address: newAddress
Age: 6
Phone Number: 957492379
Name: Jimothy
Address: 123 old country rd.
Age: 99
Phone Number: 759342679
Name: Samuel L. Jackson
Address: 6845 SomewhereInLAMaybe Dr.
Age: 74
Phone Number: surprisinglyold

Process finished with exit code 0
 */

import java.util.Scanner;

public class Driver {
    private static Scanner input = new Scanner(System.in);

    //program starts, creates new Driver method and calls Person class
    public static void main(String[] args) {
        Driver driver = new Driver();
        Person person1 = driver.readValue();
        Person person2 = driver.readValue();
        Person person3 = driver.readValue();
        person1.print();
        person2.print();
        person3.print();
    }

    //readValue method to prompt user to take input of values for variables in Person class
    public Person readValue() {
        System.out.printf("%s","Enter the new person's name: ");
        String name = input.nextLine();
        System.out.printf("%s","Enter their address: ");
        String address = input.nextLine();
        System.out.printf("%s","Enter their age (numerical values only): ");
        int age = input.nextInt();
        input.nextLine(); // Consumes the newline character, or else program gets stuck
        System.out.print("Enter their phone number: ");
        String phoneNumber = input.nextLine();

        return new Person(name, address, age, phoneNumber);
    }
}
