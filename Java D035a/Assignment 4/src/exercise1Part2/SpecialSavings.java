/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 4 EXERCISE 1 PART 2
DUE 7/29/23
SUBMITTED 7/29/23
 */
package exercise1Part2;
import exercise1.SavingsAccount; //imports the SavingsAccount class from package exercise1

public class SpecialSavings extends SavingsAccount {

    public SpecialSavings(double balance){
        super(balance);
    }

    @Override
    public void calculateMonthlyInterest(){
        //check if balance exceeds $10k & set monthlyInterest to 10%; else call normal calculateMonthlyInterest
        if(getSavingsBalance() > 10000){
            double monthlyInterest = (getSavingsBalance()*0.10)/12;
            //setSavingsBalance allows us to access the savingsBalance private variable from SavingsAccount class
            setSavingsBalance(getSavingsBalance() + monthlyInterest);
        } else{
            super.calculateMonthlyInterest();
        }
    }

    //deposit method
    public void deposit(double amount){
        setSavingsBalance(getSavingsBalance() + amount);
    }
    //withdraw method
    public void withdraw(double amount){
        if(amount <= getSavingsBalance()){
            setSavingsBalance(getSavingsBalance() - amount);
        } else{
            System.out.printf("%sInsufficient Balance!");
        }
    }
}
