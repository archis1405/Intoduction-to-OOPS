// import java.util.*;

public class BankAccount {
    private String name;
    // to store the name of the account holder
    private double balance;
   // to store the account balance

   //Constructor to initialize the variables
   public BankAccount(String name , double balance) {

    // This is basically over-riding the default values of the variables
       this.name = name;
       this.balance = balance;
   }

   //Setter method to set the Name
   public void setName(String name){
        this.name = name;
   }
   //Getter method to get the Name
   public String getName(){
        return name;
   }

   //For some scenarios we do not need to write the setter method 
   //for balance, as it is not supposed to be changed directly so we will only use a getter method
   public double getBalance(){
       return balance;
   }

   //Method to deposit money into the account
    public void addMoney(double amount) {
        if(amount > 0){
            balance = balance + amount;
        }
        else{
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    //Method to withdraw money from the account
    public boolean withdrawMoney(double amount){
        if(amount > 0 && amount <= balance) {
            balance = balance-amount;
            return true; // Withdrawal successful
        }
        return false;   // Withdrawal failed, either due to insufficient funds or invalid amount
    }

}


