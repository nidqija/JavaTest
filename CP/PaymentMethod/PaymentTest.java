package CP.PaymentMethod;



// demo of interface and polymorphism //

interface Payment {
    void pay (double amount);
}


class CreditCard implements Payment{
    public void pay( double amount){
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PaypalPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class CashPayment implements Payment{
     public void pay(double amount){
        System.out.println("Paid " + amount + " using Cash.");
     }
}

public class PaymentTest{
    public static void main(String[] args ){
       Payment payment = new CreditCard();
       payment.pay(100);
    }
}
