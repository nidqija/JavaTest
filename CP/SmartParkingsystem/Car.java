package CP.SmartParkingsystem;



public class Car extends Vehicle implements parkingLot{

   public double fee;
   public double duration;
   
   public Car(String plateNumber , double checkInTime , double checkOutTime){
      super(plateNumber , checkInTime , checkOutTime);
   }


   public double calculateFee(double checkInTime , double checkOutTime){
        duration = checkOutTime - checkInTime;
        fee = duration * 2.0;
        return fee;
   }

  
   public void getResult(){
      double totalFee = calculateFee(getCheckInTime(), getCheckOutTime());
      System.out.println("Parking fee for car " + getPlateNumber() + ": $" + totalFee);
   }

};







