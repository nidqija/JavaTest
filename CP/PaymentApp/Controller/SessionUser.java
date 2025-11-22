package CP.PaymentApp.Controller;

public class SessionUser {
    private String fullName;
    private int accountNumber;
    private double amount;
    private static SessionUser instance;
    private boolean loggedIn = false;
    
    

    public SessionUser(String fullName , int accountNumber , double amount){
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.loggedIn = true;
    }

    public String getFullName(){
        return fullName;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAmount(){
        return amount;
    }

    public static SessionUser getInstance(String fullName , int accountNumber , double amount){
        if(instance == null){
            instance = new SessionUser(fullName, accountNumber, amount);
        } 

        return instance;
    }

    public static SessionUser getExistingInstance(){
        return instance;
    }


    public boolean isLoggedIn(){
         return loggedIn;
    }

    public static void loggedOut(){
        instance = null;
    }


}
