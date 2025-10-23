package CP.SmartParkingsystem.Test;



class Callingname {
    double balance = 200;
    String acc_number = "131";
    String name = "John";



    public void printBalance(){
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Callingname ACC1234  = new Callingname();
        System.out.println(ACC1234.name);
        ACC1234.printBalance();
    }


}
