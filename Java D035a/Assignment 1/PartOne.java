/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 1 PART ONE
DUE 7/12/23
SUBMITTED 7/12/23
 */
/*
                                                    PSEUDO
1) Call loanAmortization function
2) Greet user, ask them to enter loan amount, number of years, and interest rate;
3) Verify user entered positive values only
4) Call calculations functions to calculate monthlyInterest
5) Display formatted loan amortization schedule through call function
************************************************************************************************************************
 */

/*
                                                    DESIGN
VARIABLES: (double) - loanAmount, principal, balance, monthlyInterestRate, annualInterestRate, num,monthlyPayment, totalPayment
           (int)    - numYears, month

 INPUT:     Uses Scanner to take input from user for loanAmount, numYears, and annualInterestRate
 EX:        double loanAmount = input.nextDouble();

 PROCESSING: Function for verifying positive value is entered, function for calculating the amortization schedule, function for
                printing amortization schedule to display to user.
 EX1:       public static boolean checkPositive(double num)
    {
        return (num >= 0);
    }

 EX2:       public static double calculateMonthly(double loanAmount, double monthlyInterestRate, int numYears)
    {

        double i = monthlyInterestRate;
        int n = numYears * 12;
        return (loanAmount * i * Math.pow(i+1, n)) / (Math.pow(i+1, n)-1);
    }

 PRINTING:  Uses separate function to print the amortization schedule to user, going through a loop until each month per year is accounted for
 EX:        for(int month = 1; month <= paymentNum; month++)
        {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance -= principal;

            System.out.printf("%d \t\t\t%,.2f \t\t%,.2f \t\t%,.2f\n",month,interest,principal,balance);
        }

************************************************************************************************************************
 */

/*
                                                    TEST CASES
                        TEST CASE #1
Welcome to loan amortization schedule! Please start by entering the loan amount:
-10000
Please enter only a positive number
10000
Please enter number of years:
1
Please enter the interest rate on the loan:
7
*******************************************
Monthly Payment:  865.27
Total Payment:  10,383.21

Payment#	Interest	Principal	Balance
*******************************************
1 			58.33 		806.93 		9,193.07
2 			53.63 		811.64 		8,381.42
3 			48.89 		816.38 		7,565.05
4 			44.13 		821.14 		6,743.91
5 			39.34 		825.93 		5,917.98
6 			34.52 		830.75 		5,087.24
7 			29.68 		835.59 		4,251.65
8 			24.80 		840.47 		3,411.18
9 			19.90 		845.37 		2,565.81
10 			14.97 		850.30 		1,715.51
11 			10.01 		855.26 		860.25
12 			5.02 		860.25 		0.00

Process finished with exit code 0

                        TEST CASE #2
Welcome to loan amortization schedule! Please start by entering the loan amount:
5000
Please enter number of years:
2
Please enter the interest rate on the loan:
3
*******************************************
Monthly Payment:  214.91
Total Payment:  5,157.75

Payment#	Interest	Principal	Balance
*******************************************
1 			12.50 		202.41 		4,797.59
2 			11.99 		202.91 		4,594.68
3 			11.49 		203.42 		4,391.26
4 			10.98 		203.93 		4,187.33
5 			10.47 		204.44 		3,982.90
6 			9.96 		204.95 		3,777.95
7 			9.44 		205.46 		3,572.49
8 			8.93 		205.97 		3,366.51
9 			8.42 		206.49 		3,160.02
10 			7.90 		207.01 		2,953.02
11 			7.38 		207.52 		2,745.49
12 			6.86 		208.04 		2,537.45
13 			6.34 		208.56 		2,328.89
14 			5.82 		209.08 		2,119.80
15 			5.30 		209.61 		1,910.20
16 			4.78 		210.13 		1,700.07
17 			4.25 		210.66 		1,489.41
18 			3.72 		211.18 		1,278.23
19 			3.20 		211.71 		1,066.52
20 			2.67 		212.24 		854.28
21 			2.14 		212.77 		641.51
22 			1.60 		213.30 		428.21
23 			1.07 		213.84 		214.37
24 			0.54 		214.37 		-0.00

Process finished with exit code 0

                        TEST CASE #3
Welcome to loan amortization schedule! Please start by entering the loan amount:
-2
Please enter only a positive number
-20000
Please enter only a positive number
30000
Please enter number of years:
1
Please enter the interest rate on the loan:
20
*******************************************
Monthly Payment:  2,779.04
Total Payment:  33,348.42

Payment#	Interest	Principal	Balance
*******************************************
1 			500.00 		2,279.04 		27,720.96
2 			462.02 		2,317.02 		25,403.95
3 			423.40 		2,355.64 		23,048.31
4 			384.14 		2,394.90 		20,653.41
5 			344.22 		2,434.81 		18,218.60
6 			303.64 		2,475.39 		15,743.21
7 			262.39 		2,516.65 		13,226.56
8 			220.44 		2,558.59 		10,667.97
9 			177.80 		2,601.24 		8,066.73
10 			134.45 		2,644.59 		5,422.14
11 			90.37 		2,688.67 		2,733.48
12 			45.56 		2,733.48 		-0.00

Process finished with exit code 0
************************************************************************************************************************
 */
import java.util.Scanner;

public class PartOne {

    //CHECKS IF INPUTTED INTEGERS ARE POSITIVE, RETURNS T/F
    public static boolean checkPositive(double num)
    {
        return (num >= 0);
    }

    //CALCULATES & RETURNS MONTHLY PAYMENT AS DOUBLE
    public static double calculateMonthly(double loanAmount, double monthlyInterestRate, int numYears)
    {

        double i = monthlyInterestRate;
        int n = numYears * 12;
        return (loanAmount * i * Math.pow(i+1, n)) / (Math.pow(i+1, n)-1);
    }

    //DISPLAYS THE FINAL AMORTIZATION SCHEDULE
    public static void displayAmortizationSchedule(double loanAmount, int numYears, double annualInterestRate)
    {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double monthlyPayment = calculateMonthly(loanAmount,monthlyInterestRate,numYears);
        int paymentNum = numYears * 12;
        double totalPayment = monthlyPayment * paymentNum;

        System.out.printf("%s", "*******************************************\n");
        System.out.printf("%s %,.2f\n","Monthly Payment: ", monthlyPayment);
        System.out.printf("%s %,.2f\n","Total Payment: ",totalPayment);
        System.out.printf("\n%s\t%s\t%s\t%s\n","Payment#","Interest","Principal","Balance");
        System.out.printf("%s", "*******************************************\n");

        double balance = loanAmount;
        for(int month = 1; month <= paymentNum; month++)
        {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance -= principal;

            System.out.printf("%d \t\t\t%,.2f \t\t%,.2f \t\t%,.2f\n",month,interest,principal,balance);
        }


    }

    //PROMPTS USER TO INPUT loanAmount, numYears, annualInterestRate, RUNS & PASSES ARGS TO displayAmortizationSchedule
    public static void loanAmortization()
    {   //DECLARE SCANNER OBJECT 'input' FOR USER INPUT
        Scanner input = new Scanner(System.in);
        System.out.printf("%s","Welcome to loan amortization schedule! Please start by entering the loan amount:\n");
        double loanAmount = input.nextDouble();
        while(!checkPositive(loanAmount)){ //runs checkPositive function to verify input is positive, if not then prompts user again
            System.out.printf("%s","Please enter only a positive number\n");
            loanAmount = input.nextDouble();
        }
        System.out.printf("%s\n","Please enter number of years:");
        int numYears = input.nextInt();
        while(!checkPositive(numYears)){
            System.out.printf("%s","Please enter only a positive number\n");
            numYears = input.nextInt();
        }
        System.out.printf("%s\n","Please enter the interest rate on the loan: ");
        double annualInterestRate = input.nextDouble();
        while(!checkPositive(annualInterestRate)){
            System.out.printf("%s","Please enter only a positive number\n");
            annualInterestRate = input.nextDouble();
        }
        //RUNS DISPLAY FUNCTION
        displayAmortizationSchedule(loanAmount, numYears, annualInterestRate);
    }


    public static void main(String[] args)
    {
        loanAmortization();
    }




}
