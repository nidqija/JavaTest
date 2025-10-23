package CP.SmartParkingsystem;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car( "424111", 10.00, 12.00);
        c1.getResult();


        Motorcycle m1 = new Motorcycle("Motorcycle123",11.00 , 13.00);
        m1.getResult();

        Truck t1 = new Truck("TRS123", 13.00, 16.00);
        t1.getResult();
        
    }
}
