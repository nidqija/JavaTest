package CP.OrderType;
import java.util.Scanner;

interface OrderType {
    public void processOrder(String orderDetails);
}


// dine in order 

class DineInOrder implements OrderType{
    @Override
    public void processOrder(String orderDetails){
        System.out.println("Processing dine-in order: " + orderDetails);
    }
}

// takeaway order

class TakeawayOrder implements OrderType{
    @Override
    public void processOrder(String orderDetails){
        System.out.println("Processing takeaway order: " + orderDetails);
    }
}

// online order

class OnlineOrder implements OrderType{
    @Override

    public void processOrder(String orderDetails){
        System.out.println("Processing online order: " + orderDetails);
    }
}


// order class that access order type to get types of order
class OrderClass{

    private OrderType orderType;

    public OrderClass(OrderType orderType){
        this.orderType = orderType;
    }

    public void executeOrder(String orderDetails){
        orderType.processOrder(orderDetails);
    }

}


class OrderTypeDemo{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter order type: ");
        System.out.println("1. Dine In ");
        System.out.println("2. Takeaway");
        System.out.println("3. Delivery order");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice){
            case 1:
                System.out.println("Enter order details for Dine In: ");
                String dineInDetails = scanner.nextLine();
                DineInOrder dineInOrder = new DineInOrder();
                OrderClass orderclass = new OrderClass(dineInOrder);
                orderclass.executeOrder(dineInDetails);
                break;


            case 2: 
                System.out.println("Enter order details for Takeaway: ");
                String takeawayDetails = scanner.nextLine();
                TakeawayOrder takeawayOrder = new TakeawayOrder();
                OrderClass orderclass2 = new OrderClass(takeawayOrder);
                orderclass2.executeOrder(takeawayDetails);
                break;


            case 3:
                System.out.println("Enter order details for Delivery: ");
                String deliveryDetails = scanner.nextLine();
                OnlineOrder onlineOrder = new OnlineOrder();
                OrderClass orderclass3 = new OrderClass(onlineOrder);
                orderclass3.executeOrder(deliveryDetails);
                break;

            default:
                System.out.println("Invalid Choice , please enter a valid choice");
                break;


        }

        scanner.close();
        





    }
}


