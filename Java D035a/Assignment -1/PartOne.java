/*
    MICHAEL BLACKMON
    CIS D035A 16Z
    ASSIGNMENT -1 PART ONE
    DUE 7/7/23
    DATE SUBMITTED 7/7/23
 */



//***********************************************************************************************************************
/*                                                         DESIGN
VARIABLES:  (int)    -  numTV, numVCR, numRemote, numCD, numRecorder -
                        Need ints to track quantity of each item
            (double) -  priceTV, priceVCR, priceRemote, priceCD, priceRecorder, salesTax, totalTV, totalVCR, totalRemote,
                        totalCD, totalRecorder, subTotal, tax, total - Need doubles to hold values for price, tax, totals & subtotals

INPUT:      Used Scanner to take input from user for quantity of each item purchased / sold
   EX:      System.out.printf("%s","Please enter a positive quantity, or zero\n");
            numTV = input.nextInt();

PROCESSING: Used conditionals to check if user entered only positive quantities or zero, calculated the tax, subtotal, and total cost.
        EX: double subTotal = (numTV * priceTV) + (numVCR * priceVCR) + (numRemote * priceRemote) + (numCD * priceCD)
                + (numRecorder * priceRecorder);

             double tax = subTotal * salesTax;

             double total = subTotal + tax;

PRINTING:   Used printf() to organize output to user, as well as prompting user to take input
      EX:   System.out.printf("%3s\t%25s\t\t%10s\t%10s\n",qty,desc,unitPrice,totalPrice);
            System.out.printf("%3d\t%25s\t\t%10.2f\t%11.2f\n",numTV,desc1,priceTV,totalTV);
 */

//***********************************************************************************************************************
/*                                                  TEST OUTPUT
                        TEST CASE 1:
How many TV's were sold?
-1
Please enter a positive quantity, or zero
1
How many VCR's were sold?
2
How many Remote Controllers were sold?
3
How many CD Players were sold?
4
How many Tape Recorders were sold?
5
QTY	              DESCRIPTION		UNIT PRICE	TOTAL PRICE
  1	                       TV		    400.00	     400.00
  2	                      VCR		    220.00	     440.00
  3	        Remote Controller		     35.20	     105.60
  4	                       CD		    300.00	    1200.00
  5	            Tape Recorder		    150.00	     750.00

									SubTotal: 2895.60
									Tax: 238.89
									Total cost: 3134.49

Process finished with exit code 0

                        TEST CASE 2:
How many TV's were sold?
0
How many VCR's were sold?
3
How many Remote Controllers were sold?
-5
Please enter a positive quantity, or zero
5
How many CD Players were sold?
6
How many Tape Recorders were sold?
10
QTY	              DESCRIPTION		UNIT PRICE	TOTAL PRICE
  0	                       TV		    400.00	       0.00
  3	                      VCR		    220.00	     660.00
  5	        Remote Controller		     35.20	     176.00
  6	                       CD		    300.00	    1800.00
 10	            Tape Recorder		    150.00	    1500.00

									SubTotal: 4136.00
									Tax: 341.22
									Total cost: 4477.22

Process finished with exit code 0

                        TEST CASE 3:
How many TV's were sold?
10
How many VCR's were sold?
24
How many Remote Controllers were sold?
30
How many CD Players were sold?
0
How many Tape Recorders were sold?
0
QTY	              DESCRIPTION		UNIT PRICE	TOTAL PRICE
 10	                       TV		    400.00	    4000.00
 24	                      VCR		    220.00	    5280.00
 30	        Remote Controller		     35.20	    1056.00
  0	                       CD		    300.00	       0.00
  0	            Tape Recorder		    150.00	       0.00

									SubTotal: 10336.00
									Tax: 852.72
									Total cost: 11188.72

Process finished with exit code 0

 */


//***********************************************************************************************************************
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        // declare variables
        int numTV, numVCR, numRemote, numCD, numRecorder;
        double priceTV = 400.00, priceVCR = 220.00, priceRemote = 35.20, priceCD = 300.00, priceRecorder = 150.00, salesTax = 0.0825;

        String qty = "QTY", desc = "DESCRIPTION", desc1 = "TV", desc2 = "VCR", desc3 = "Remote Controller", desc4 = "CD", desc5 = "Tape Recorder", unitPrice = "UNIT PRICE", totalPrice = "TOTAL PRICE";
        // declare scanner
        Scanner input = new Scanner(System.in);


        // prompt user for input
        System.out.printf("%s","How many TV's were sold? \n");
        numTV = input.nextInt();
        //check to make sure user input a positive or zero quantity
        while(numTV < 0){
            System.out.printf("%s","Please enter a positive quantity, or zero\n");
            numTV = input.nextInt();
        }
        System.out.printf("%s","How many VCR's were sold? \n");
        numVCR = input.nextInt();
        while(numVCR < 0){
            System.out.printf("%s","Please enter a positive quantity, or zero\n");
            numVCR = input.nextInt();
        }
        System.out.printf("%s","How many Remote Controllers were sold? \n");
        numRemote = input.nextInt();
        while(numRemote < 0){
            System.out.printf("%s","Please enter a positive quantity, or zero\n");
            numRemote = input.nextInt();
        }
        System.out.printf("%s","How many CD Players were sold? \n");
        numCD = input.nextInt();
        while(numCD < 0){
            System.out.printf("%s","Please enter a positive quantity, or zero\n");
            numCD = input.nextInt();
        }
        System.out.printf("%s","How many Tape Recorders were sold? \n");
        numRecorder = input.nextInt();
        while(numRecorder < 0){
            System.out.printf("%s","Please enter a positive quantity, or zero\n");
            numRecorder = input.nextInt();
        }


        // calculate subtotal, tax, and total
        double totalTV = numTV * priceTV;
        double totalVCR = numVCR * priceVCR;
        double totalRemote = numRemote * priceRemote;
        double totalCD = numCD * priceCD;
        double totalRecorder = numRecorder * priceRecorder;

        double subTotal = (numTV * priceTV) + (numVCR * priceVCR) + (numRemote * priceRemote) + (numCD * priceCD)
                + (numRecorder * priceRecorder);

        double tax = subTotal * salesTax;

        double total = subTotal + tax;

        // display output
        System.out.printf("%3s\t%25s\t\t%10s\t%10s\n",qty,desc,unitPrice,totalPrice);
        System.out.printf("%3d\t%25s\t\t%10.2f\t%11.2f\n",numTV,desc1,priceTV,totalTV);
        System.out.printf("%3d\t%25s\t\t%10.2f\t%11.2f\n",numVCR,desc2,priceVCR,totalVCR);
        System.out.printf("%3d\t%25s\t\t%10.2f\t%11.2f\n",numRemote,desc3,priceRemote,totalRemote);
        System.out.printf("%3d\t%25s\t\t%10.2f\t%11.2f\n",numCD,desc4,priceCD,totalCD);
        System.out.printf("%3d\t%25s\t\t%10.2f\t%11.2f\n\n",numRecorder,desc5,priceRecorder,totalRecorder);
        System.out.printf("\t\t\t\t\t\t\t\t\tSubTotal: %1.2f\n", subTotal);
        System.out.printf("\t\t\t\t\t\t\t\t\tTax: %1.2f\n", tax);
        System.out.printf("\t\t\t\t\t\t\t\t\tTotal cost: %1.2f\n", total);
        input.close();
    }

}
