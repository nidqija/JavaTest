package Test;
public class Account {
    double balance;
    int acc_number;
    String name;

    void creditAmount(double amount){
        balance = balance+amount;
    }

    void withdrawAmount(double amount){
        balance = balance-amount;
    }

    void printBalance(){
        System.out.println("\n");
        System.out.println("============Account Details============");
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + acc_number);
        System.out.println("Balance: " + balance);
    }

    void setAccountDetails(String name , int acc_number, double balance ){
        this.name = name;
        this.acc_number = acc_number;
        this.balance = balance;
    }


}
