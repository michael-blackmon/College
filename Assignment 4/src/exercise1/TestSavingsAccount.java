/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 4 EXERCISE 1 PART 1
DUE 7/29/23
SUBMITTED 7/29/23
 */
/*
                                                    TEST CASE PART 1
Interest Rate: 4.00%
Month: 1 First Saver's Balance: $2,006.67
Month: 1 Second Saver's Balance: $3,010.00
Month: 2 First Saver's Balance: $2,013.36
Month: 2 Second Saver's Balance: $3,020.03
Month: 3 First Saver's Balance: $2,020.07
Month: 3 Second Saver's Balance: $3,030.10
Month: 4 First Saver's Balance: $2,026.80
Month: 4 Second Saver's Balance: $3,040.20
Month: 5 First Saver's Balance: $2,033.56
Month: 5 Second Saver's Balance: $3,050.33
Month: 6 First Saver's Balance: $2,040.33
Month: 6 Second Saver's Balance: $3,060.50
Month: 7 First Saver's Balance: $2,047.14
Month: 7 Second Saver's Balance: $3,070.70
Month: 8 First Saver's Balance: $2,053.96
Month: 8 Second Saver's Balance: $3,080.94
Month: 9 First Saver's Balance: $2,060.81
Month: 9 Second Saver's Balance: $3,091.21
Month: 10 First Saver's Balance: $2,067.68
Month: 10 Second Saver's Balance: $3,101.51
Month: 11 First Saver's Balance: $2,074.57
Month: 11 Second Saver's Balance: $3,111.85
Month: 12 First Saver's Balance: $2,081.48
Month: 12 Second Saver's Balance: $3,122.22
Interest Rate: 5.00%
Month: 13 First Saver's Balance: $2,090.16
Month: 13 Second Saver's Balance: $3,135.23
Month: 14 First Saver's Balance: $2,098.86
Month: 14 Second Saver's Balance: $3,148.30
Month: 15 First Saver's Balance: $2,107.61
Month: 15 Second Saver's Balance: $3,161.42
Month: 16 First Saver's Balance: $2,116.39
Month: 16 Second Saver's Balance: $3,174.59
Month: 17 First Saver's Balance: $2,125.21
Month: 17 Second Saver's Balance: $3,187.82
Month: 18 First Saver's Balance: $2,134.07
Month: 18 Second Saver's Balance: $3,201.10
Month: 19 First Saver's Balance: $2,142.96
Month: 19 Second Saver's Balance: $3,214.44
Month: 20 First Saver's Balance: $2,151.89
Month: 20 Second Saver's Balance: $3,227.83
Month: 21 First Saver's Balance: $2,160.85
Month: 21 Second Saver's Balance: $3,241.28
Month: 22 First Saver's Balance: $2,169.86
Month: 22 Second Saver's Balance: $3,254.78
Month: 23 First Saver's Balance: $2,178.90
Month: 23 Second Saver's Balance: $3,268.35
Month: 24 First Saver's Balance: $2,187.98
Month: 24 Second Saver's Balance: $3,281.96
Process finished with exit code 0

 */
package exercise1;

public class TestSavingsAccount {
    public static void main(String[] args) {
        //Instantiating two saver objects with $2k & $3k balances
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        //setting interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);
        System.out.printf("\n%s%,.2f%s","Interest Rate: ",SavingsAccount.getAnnualInterestRate() * 100,"%");

        //calculate monthly interest for each saver - need loop
        for(int i=1; i<=12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("\n%s%d%s%,.2f","Month: ",i," First Saver's Balance: $",saver1.getSavingsBalance());
            System.out.printf("\n%s%d%s%,.2f","Month: ",i," Second Saver's Balance: $",saver2.getSavingsBalance());
        }

        //setting interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);
        System.out.printf("\n%s%,.2f%s","Interest Rate: ",SavingsAccount.getAnnualInterestRate() * 100,"%");

        //calculate NEW monthly interest for each saver - need loop
        for(int i=13; i<=24; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("\n%s%d%s%,.2f","Month: ",i," First Saver's Balance: $",saver1.getSavingsBalance());
            System.out.printf("\n%s%d%s%,.2f","Month: ",i," Second Saver's Balance: $",saver2.getSavingsBalance());
        }
    }
}
