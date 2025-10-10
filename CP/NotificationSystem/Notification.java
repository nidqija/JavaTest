/*
    ===========================================
          SOLID PRINCIPLES CODING QUESTION
          Topic: Notification Delivery System
    ===========================================

    SCENARIO:
    You are building a Notification System that can send messages 
    to users through different channels (Email, SMS, and WhatsApp).

    Currently, the company only supports Email notifications, 
    but they want to easily add other channels in the future 
    without modifying the existing codebase.

    -------------------------------------------
    REQUIREMENTS:

    1. Create an interface named "Notifier" with a method:
           void send(String message);

    2. Implement the following classes that follow this interface:
           - EmailNotifier
           - SMSNotifier
           - WhatsAppNotifier

    3. Create a NotificationService class that:
           - Depends only on the Notifier interface (NOT concrete classes)
           - Contains a method:
                void notifyUser(String message)
             which calls the send() method of the Notifier

    4. Demonstrate the Dependency Inversion Principle (DIP)
       by injecting a Notifier object into the NotificationService 
       via its constructor.

    5. In your Main class:
           - Ask the user which channel to use (Email, SMS, or WhatsApp)
           - Ask for the message
           - Send the notification

    -------------------------------------------
    EXPECTED OUTPUT EXAMPLE:

        Select notification channel:
        1. Email
        2. SMS
        3. WhatsApp
        > 2
        Enter your message:
        > "Your OTP code is 123456"
        Sent SMS: Your OTP code is 123456

    -------------------------------------------
    BONUS TASK (Optional):
        - Add a new channel (e.g. TelegramNotifier)
          WITHOUT modifying NotificationService.
        - Create a Logger class that logs each sent notification 
          to the console or file (SRP demonstration).

    -------------------------------------------
    CONCEPTS TESTED:
        - Single Responsibility Principle (SRP)
        - Open/Closed Principle (OCP)
        - Liskov Substitution Principle (LSP)
        - Interface Segregation Principle (ISP)
        - Dependency Inversion Principle (DIP)
*/




package CP.NotificationSystem;
import java.util.Scanner;

// interface to be implemented by classes
interface Notifier{
    void send(String message);
}


class EmailNotifier implements Notifier{
    @Override
    public void send(String message){
        System.out.println("Send Email: " + message);
    }
}


class SMSNotifier implements Notifier{
    @Override
    public void send(String message){
        System.out.println("Send SMS: " + message);
    }
}

class WhatsAppNotifier implements Notifier{
    @Override
    public void send(String message){
        System.out.println("Send WhatsApp: " + message);
    }
}


class NotificationService{
    private Notifier notifier;

    public NotificationService(Notifier notifier){
        this.notifier = notifier;
    }

    public void notifyUser(String message){
        notifier.send(message);
    }
}


class NotificationTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select notification channel:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. WhatsApp");

        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter your message: ");
                String emailMessage = scanner.next();
                Notifier emailNotifier = new EmailNotifier();
                emailNotifier.send(emailMessage);
                break;

            case 2:
                System.out.println("Enter your message: ");
                String smsMessage = scanner.next();
                Notifier smsNotifier = new SMSNotifier();
                smsNotifier.send(smsMessage);
                break;

            case 3:
                System.out.println("Enter your message: ");
                String whatsappMessage = scanner.next();
                Notifier whatsappNotifier = new WhatsAppNotifier();
                whatsappNotifier.send(whatsappMessage);
                break;

            default:
                System.out.println("Invalid choice , please select a valid option.");
                break;
        }
         
    }
}






