package Lab;

public class lab04 {
    private String code;
    private char result;

    lab04(String code , char result){
        this.code = code;
        this.result = result;
    }


    public String getCode(){
        return code;
    }

    public char getResult(){
        return result;
    }



    public String displayInfo(){
        return "Course Code: " + code + ", Grade: " + result;
    }




    public static void main(String[] args) {
        
    }
    
}
