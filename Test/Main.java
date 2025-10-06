package Test;
import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        // create an instance of account
         Account acc = new Account();
         

        // create a scanner object for user input
         Scanner scanner = new Scanner(System.in);

        // initialize account details
         acc.acc_number = 12345;
         acc.name = "John Doe";
         acc.balance = 1000.0;

         System.out.println("Enter your name: ");
         String name = scanner.nextLine();
        

         System.out.println("Enter your account number: ");
         int acc_number = scanner.nextInt();

         System.out.println("Enter initial balance: ");
         double balance = scanner.nextDouble();
         scanner.close();


         

         // perform overloading operations

         acc.setAccountDetails(name, acc_number, balance);
         acc.printBalance();


     }
}




