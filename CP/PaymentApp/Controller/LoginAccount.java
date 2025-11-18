package CP.PaymentApp.Controller;

public class LoginAccount {
    private String fullName;
    private int accountNumber;


    public LoginAccount(String fullName , int accountNumber ){
        this.fullName = fullName;
        this.accountNumber = accountNumber;
    }


    public void setFullName(String fullName){
        this.fullName = fullName;
    }


    public void setAccountNumber( int accountNumber){
        this.accountNumber = accountNumber;
    }


    public String getFullName(){
        return fullName;
    }

    public int getAccountNum(){
        return accountNumber;
    }

    public void validateLogin(LoginAccount account){
       
        


    }





}
