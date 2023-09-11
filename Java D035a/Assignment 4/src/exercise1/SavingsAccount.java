/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 4 EXERCISE 1 PART 1
DUE 7/29/23
SUBMITTED 7/29/23
 */
package exercise1;

public class SavingsAccount {
    //Declare variables savingsBalance & annualInterestRate
    private static double annualInterestRate;
    private double savingsBalance;


    public void SavingsAccount(){
        //default constructor
    }

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    //calculate method for monthly interest
    public void calculateMonthlyInterest(){
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    //setters
    //static modifyInterestRate method
    public static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    //getters
    public double getSavingsBalance(){
        return savingsBalance;
    }

    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
}