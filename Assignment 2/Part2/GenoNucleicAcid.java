/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 2 PART 2
DUE 7/20/23
SUBMITTED 7/20/23
 */
/*
                                                 DESIGN
VARIABLES: (String) - name, chemicalFormula - Store user inputted value for nucleic acid name and formula
           (float) - molarMass, density - Stores user inputted value for molar mass and density of given nucleic acid

INPUT:      Uses Scanner class to take input from user to hold values in declared variables above

PROCESSING: The NucleicAcid class includes a constructor with getter/setter methods for each variable above

PRINTING:  NucleicAcid class includes a print() method to display the inputted valuables back to user
 */
/*
                                                TEST CASES
                        TEST CASE #1:
Enter details for the Nucleic Acid:
Enter Name: Cytosine
Enter Chemical Formula: C4H5N30
Enter Molar Mass: 111.10
Enter Density: 1.55
Enter details for the Nucleic Acid:
Enter Name: Adenine
Enter Chemical Formula: C5H5N5
Enter Molar Mass: 135.13
Enter Density: 1.6
Enter details for the Nucleic Acid:
Enter Name: Guanine
Enter Chemical Formula: C5H5N50
Enter Molar Mass: 151.
Enter Density: 2.2
Enter details for the Nucleic Acid:
Enter Name: Thymine
Enter Chemical Formula: C5H6N202
Enter Molar Mass: 126.115
Enter Density: 1.223
Enter details for the Nucleic Acid:
Enter Name: Uracil
Enter Chemical Formula: C4H4N202
Enter Molar Mass: 112.08676
Enter Density: 1.32

Details of the Nucleic Acid:
Name: Cytosine
Chemical Formula: C4H5N30
Molar Mass: 111.10 g/mol
Density: 1.550 g/cm³

Details of the Nucleic Acid:
Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13 g/mol
Density: 1.600 g/cm³

Details of the Nucleic Acid:
Name: Guanine
Chemical Formula: C5H5N50
Molar Mass: 151.00 g/mol
Density: 2.200 g/cm³

Details of the Nucleic Acid:
Name: Thymine
Chemical Formula: C5H6N202
Molar Mass: 126.11 g/mol
Density: 1.223 g/cm³

Details of the Nucleic Acid:
Name: Uracil
Chemical Formula: C4H4N202
Molar Mass: 112.09 g/mol
Density: 1.320 g/cm³

Process finished with exit code 0
 */
import java.util.Scanner;

public class GenoNucleicAcid {
    public static NucleicAcid input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Chemical Formula: ");
        String chemicalFormula = input.nextLine();

        System.out.print("Enter Molar Mass: ");
        float molarMass = input.nextFloat();
        input.nextLine(); // Consume the newline character or program pauses

        System.out.print("Enter Density: ");
        float density = input.nextFloat();
        input.nextLine(); // Consume the newline character or program pauses

        return new NucleicAcid(name, chemicalFormula, molarMass, density);
    }

    public static void main(String[] args) {
        // Instantiate NucleicAcid objects with user inputted values
        System.out.println("Enter details for the Nucleic Acid:");
        NucleicAcid cytosine = input();

        System.out.println("Enter details for the Nucleic Acid:");
        NucleicAcid adenine = input();

        System.out.println("Enter details for the Nucleic Acid:");
        NucleicAcid guanine = input();

        System.out.println("Enter details for the Nucleic Acid:");
        NucleicAcid thymine = input();

        System.out.println("Enter details for the Nucleic Acid:");
        NucleicAcid uracil = input();

        // Print the details of each Nucleic Acid object using the created print() method
        System.out.println("\nDetails of the Nucleic Acid:");
        cytosine.print();

        System.out.println("\nDetails of the Nucleic Acid:");
        adenine.print();

        System.out.println("\nDetails of the Nucleic Acid:");
        guanine.print();

        System.out.println("\nDetails of the Nucleic Acid:");
        thymine.print();

        System.out.println("\nDetails of the Nucleic Acid:");
        uracil.print();
    }
}
