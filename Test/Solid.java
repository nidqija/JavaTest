/*
    ===========================================
          SOLID PRINCIPLES CODING QUESTION
          Topic: Payment Processing System
    ===========================================

    SCENARIO:
    You are asked to design a simple payment processing system 
    for an e-commerce application.

    The app currently supports only Credit Card payments, 
    but it will need to support other payment methods 
    (like PayPal or Bank Transfer) in the future.

    Your task is to design your code using the SOLID principles
    so that the system is easy to extend without modifying 
    existing classes.

    -------------------------------------------
    REQUIREMENTS:
    1. Create an interface named PaymentMethod with a method:
           void pay(double amount);

    2. Implement two classes that follow this interface:
           - CreditCardPayment
           - PayPalPayment

    3. Create a PaymentProcessor class that:
           - Depends only on the PaymentMethod interface 
             (NOT on specific implementations)
           - Contains a method:
                void processPayment(double amount)
             which calls the pay() method of the PaymentMethod

    4. Demonstrate the Dependency Inversion Principle (DIP)
       by injecting a PaymentMethod object into the PaymentProcessor 
       through its constructor.

    5. In your Main class:
           - Ask the user which payment type they want to use 
             (Credit Card or PayPal)
           - Ask for an amount
           - Process the payment

    -------------------------------------------
    EXPECTED OUTPUT EXAMPLE:

        Select payment type: 
        1. Credit Card
        2. PayPal
        > 2
        Enter amount:
        > 150.00
        Paid RM150.00 using PayPal.

    -------------------------------------------
    BONUS TASK (Optional):
        - Add a new payment type, e.g. BankTransferPayment,
          WITHOUT modifying PaymentProcessor.
        - Create a separate PaymentLogger class to log transactions,
          following the Single Responsibility Principle (SRP).

    -------------------------------------------
    CONCEPTS TESTED:
        - Single Responsibility Principle (SRP)
        - Open/Closed Principle (OCP)
        - Liskov Substitution Principle (LSP)
        - Interface Segregation Principle (ISP)
        - Dependency Inversion Principle (DIP)
*/





package Test;
import java.util.Scanner;


// this is an interface for payment method
// meant to be overriden by other classes
interface PaymentMethod{
    public void pay( double amount);
}

// class to implement credit card payment method
class CreditCardPayment implements PaymentMethod{

    // overriding the pay method
    @Override
    public void pay(double amount){
        System.out.println("Paid RM" + amount + " using Credit Card.") ;
    }
}

// class to implement paypal payment method
class PaypalPayment implements PaymentMethod{

    // overriding the pay method
    @Override
    public void pay(double amount){
        System.out.println("Paid RM" + amount + " using PayPal.");
    }
}

// class to process payment
class PaymentProcessor{

    // dependency on the paymentmethod interface
    private PaymentMethod method;

   
    // constructor to inject the payment method
    public PaymentProcessor (PaymentMethod method){
        this.method = method;
    }

    // method to process payment based on payment method
    public void processPayment(double amount){
        method.pay(amount);
    }

 

}


class PaymentTest{
    public static void main(String[] args) {

        // defining scanner 
        Scanner scanner = new Scanner(System.in);
        // defining payment method
        PaymentMethod method;

    while (true) { 
        System.out.println("Select payment type: ");
        System.out.println("1. Credit Card");
        System.out.println("2. Paypal");

        // choose payment method type
        int choice = scanner.nextInt();
        
        switch(choice){
            case 1:
                // credit card payment method object
                method = new CreditCardPayment();
                break;

            case 2:
                // paypal payment method object
                method = new PaypalPayment();
                break;

            default:
                // error handling
                System.out.println("Invalid choice. Please try again.");
                continue;
              
        }
        
        // ask for amount
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        // process payment based on payment method
        PaymentProcessor processor = new PaymentProcessor(method);
        // call process payment method
        processor.processPayment(amount);
        break;

       

        


    }

}
}



