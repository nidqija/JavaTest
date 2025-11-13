package CP.PaymentApp.Controller;
import CP.PaymentApp.Models.WriteCSV;

public class LoginAccount {
    private String fullName;
    private int accountNumber;
    private double amount;


    public LoginAccount(String fullName , int accountNumber , double amount){
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }


    public void setFullName(String fullName){
        this.fullName = fullName;
    }


    public void setAccountNumber( int accountNumber){
        this.accountNumber = accountNumber;
    }


    public void setAmount(double amount){
        this.amount = amount;
    }


    public String getFullName(){
        return fullName;
    }

    public int getAccountNum(){
        return accountNumber;
    }


    public double getAmount(){
        return amount;
    }


   


}
