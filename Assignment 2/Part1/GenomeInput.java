/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 2 PART 1
DUE 7/20/23
SUBMITTED 7/20/23
 */
/*
                                            DESIGN
VARIABLES: (String) - genomeName - Store user inputted value for genome name
           (int) - numGenes, numChromosomes - Stores user inputted value for number of genes and chromosomes
           (long) - numCells - stores user inputted value for number of cells

INPUT:      Uses Scanner class to take input from user to hold values in declared variables above

PROCESSING: The HumanGenome class includes a constructor with getter/setter methods for each variable above

PRINTING:  HumanGenome class includes a print() method to display the inputted valuables back to user
 */
/*
                                           TEST CASES
                        TEST CASE #1:
Enter Genome Name: Mike
Enter Number of Genes: 20000
Enter Number of Chromosomes: 46
Enter Number of Cells (in trillions): 80
Enter Genome Name: Mary
Enter Number of Genes: 20000
Enter Number of Chromosomes: 46
Enter Number of Cells (in trillions): 90
Enter Genome Name: Guy
Enter Number of Genes: 20000
Enter Number of Chromosomes: 46
Enter Number of Cells (in trillions): 120

Details of Genome 1:
Genome Name: Mike
Number of Genes: 20000
Number of Cells: 80
Number of Chromosomes (in trillions): 46

Details of Genome 2:
Genome Name: Mary
Number of Genes: 20000
Number of Cells: 90
Number of Chromosomes (in trillions): 46

Details of Genome 3:
Genome Name: Guy
Number of Genes: 20000
Number of Cells: 120
Number of Chromosomes (in trillions): 46

Process finished with exit code 0

                        TEST CASE #2:
Enter Genome Name: John
Enter Number of Genes: 20000
Enter Number of Chromosomes: 46
Enter Number of Cells (in trillions): 115
Enter Genome Name: Peter
Enter Number of Genes: 20000
Enter Number of Chromosomes: 46
Enter Number of Cells (in trillions): 75
Enter Genome Name: Ptolemy
Enter Number of Genes: 20000
Enter Number of Chromosomes: 46
Enter Number of Cells (in trillions): 80

Details of Genome 1:
Genome Name: John
Number of Genes: 20000
Number of Cells: 115
Number of Chromosomes (in trillions): 46

Details of Genome 2:
Genome Name: Peter
Number of Genes: 20000
Number of Cells: 75
Number of Chromosomes (in trillions): 46

Details of Genome 3:
Genome Name: Ptolemy
Number of Genes: 20000
Number of Cells: 80
Number of Chromosomes (in trillions): 46

Process finished with exit code 0
 */

import java.util.Scanner;

public class GenomeInput {
    public static HumanGenome input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Genome Name: ");
        String genomeName = input.nextLine();

        System.out.print("Enter Number of Genes: ");
        int numGenes = input.nextInt();

        System.out.print("Enter Number of Chromosomes: ");
        int numChromosomes = input.nextInt();

        System.out.print("Enter Number of Cells (in trillions): ");
        long numCells = input.nextLong();

        return new HumanGenome(genomeName, numGenes, numChromosomes, numCells);
    }

    public static void main(String[] args) {
        // Create three instances of HumanGenome using input method
        HumanGenome simba = input();
        HumanGenome scar = input();
        HumanGenome mufasa = input();

        // Print the information for each instance
        System.out.printf("%s\n","\nDetails of Genome 1:");
        simba.print();

        System.out.printf("%s\n","\nDetails of Genome 2:");
        scar.print();

        System.out.printf("%s\n","\nDetails of Genome 3:");
        mufasa.print();
    }
}
