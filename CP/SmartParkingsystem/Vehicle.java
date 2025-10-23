package CP.SmartParkingsystem;

class Vehicle{
    private String plateNumber;
    private double checkInTime;
    private double checkOutTime;


    public Vehicle(String plateNumber , double checkInTime , double checkOutTime){
        this.plateNumber = plateNumber;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public String getPlateNumber(){
        return plateNumber;
    }

    public double getCheckInTime(){
        return checkInTime;
    }


    public double getCheckOutTime(){
        return checkOutTime;
    }

    public double getParkedDuration(){
        return checkOutTime - checkInTime;
    }

};
