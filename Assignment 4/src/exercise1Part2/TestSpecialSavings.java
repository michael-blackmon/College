/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 4 EXERCISE 1 PART 2
DUE 7/29/23
SUBMITTED 7/29/23
 */
/*
                                                    TEST CASE PART 2
Initial Balance for First Saver: $2,000.00
Initial Balance for Second Saver: $2,000.00
Remaining balance after deposit for First Saver: $3,000.00
Remaining balance after deposit for Second Saver: $3,750.00
Remaining balance after withdrawal for First Saver: $1,500.00
Remaining balance after withdrawal for Second Saver: $3,250.00
Month: 1 First Saver's Balance: $1,505.00
Month: 1 Second Saver's Balance: $3,260.83
Month: 2 First Saver's Balance: $1,510.02
Month: 2 Second Saver's Balance: $3,271.70
Month: 3 First Saver's Balance: $1,515.05
Month: 3 Second Saver's Balance: $3,282.61
Month: 4 First Saver's Balance: $1,520.10
Month: 4 Second Saver's Balance: $3,293.55
Month: 5 First Saver's Balance: $1,525.17
Month: 5 Second Saver's Balance: $3,304.53
Month: 6 First Saver's Balance: $1,530.25
Month: 6 Second Saver's Balance: $3,315.54
Month: 7 First Saver's Balance: $1,535.35
Month: 7 Second Saver's Balance: $3,326.60
Month: 8 First Saver's Balance: $1,540.47
Month: 8 Second Saver's Balance: $3,337.68
Month: 9 First Saver's Balance: $1,545.60
Month: 9 Second Saver's Balance: $3,348.81
Month: 10 First Saver's Balance: $1,550.76
Month: 10 Second Saver's Balance: $3,359.97
Month: 11 First Saver's Balance: $1,555.93
Month: 11 Second Saver's Balance: $3,371.17
Month: 12 First Saver's Balance: $1,561.11
Month: 12 Second Saver's Balance: $3,382.41
Process finished with exit code 0
 */
package exercise1Part2;
import exercise1.SavingsAccount;

public class TestSpecialSavings {
    public static void main(String[] args){
        //instantiate saver1 and saver2 objects in SpecialSavings class
        SpecialSavings saver1 = new SpecialSavings(2000.00);
        SpecialSavings saver2 = new SpecialSavings(3000.00);

        //print initial balance for each saver account
        System.out.printf("\n%s%,.2f","Initial Balance for First Saver: $",saver1.getSavingsBalance());
        System.out.printf("\n%s%,.2f","Initial Balance for Second Saver: $",saver1.getSavingsBalance());

        //deposit $1k & $750 into saver accounts respectively
        saver1.deposit(1000.00);
        saver2.deposit(750.00);

        //print remaining balance after deposit for each saver account
        System.out.printf("\n%s%,.2f","Remaining balance after deposit for First Saver: $",saver1.getSavingsBalance());
        System.out.printf("\n%s%,.2f","Remaining balance after deposit for Second Saver: $",saver2.getSavingsBalance());

        //withdraw $1500 & $500 from saver accounts respectively
        saver1.withdraw(1500.00);
        saver2.withdraw(500.00);

        //print remaining balance after withdrawal from each saver account
        System.out.printf("\n%s%,.2f","Remaining balance after withdrawal for First Saver: $",saver1.getSavingsBalance());
        System.out.printf("\n%s%,.2f","Remaining balance after withdrawal for Second Saver: $",saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);

        for(int i=1; i<=12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("\n%s%d%s%,.2f","Month: ",i," First Saver's Balance: $",saver1.getSavingsBalance());
            System.out.printf("\n%s%d%s%,.2f","Month: ",i," Second Saver's Balance: $",saver2.getSavingsBalance());
        }
    }
}
