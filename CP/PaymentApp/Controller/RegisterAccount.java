package CP.PaymentApp.Controller;

public class RegisterAccount {
    
    private String fullName;
    private int accountNumber;
    private double amount;

    public RegisterAccount(String fullName , int accountNumber ){
        this.fullName = fullName;
        this.accountNumber = accountNumber;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName( String fullname){
        fullName = fullname;
    }

    public int getAccountNum(){
        return accountNumber;
    }

    public double getAmount(){
        return amount;
    }

    public void displayInfo(){
        System.out.println("Your name : " + getFullName());
        System.out.println("Your account bank : " + getAccountNum());
        System.out.println("Your amount : " + getAmount());

    }

    
}
