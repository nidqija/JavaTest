package CP.SmartParkingsystem;


public class Motorcycle extends Vehicle implements parkingLot{

    public Motorcycle(String plateNumber , double checkInTime , double checkOutTime){
        super(plateNumber, checkInTime, checkOutTime);
    };

    public double calculateFee(double checkInTime , double checkOutTime){
        double duration = checkOutTime - checkInTime;
        double fee = duration * 1.5;
        return fee;
        
    }


    public void getResult(){
        double totalFee = calculateFee(getCheckInTime(), getCheckOutTime());
        System.out.println("The fee for " + getPlateNumber() + "is " + totalFee);
    }


}
