package CP.SmartParkingsystem;

public class Truck extends Vehicle {
    
    public Truck(String plateNumber , double checkInTime , double checkOutTime){
        super(plateNumber, checkInTime, checkOutTime);
    }

    public double calculateFee(double checkInTime , double checkOutTime){
        double duration = checkOutTime - checkInTime;
        double fee = duration * 5;
        return fee;
    }


    public void getResult(){
        double totalFee = calculateFee(getCheckInTime(), getCheckOutTime());
        System.out.println("The total fee for " + getPlateNumber() + " is " + totalFee);
    }



}
