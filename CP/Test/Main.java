package CP.Test;

public class Main {  
    public static void main(String[] args){
       
        String object = "hello this is raziq";
        String objectUpperCase = object.toUpperCase();
        char[] words = objectUpperCase.toCharArray();


        for ( int i = 0 ; i < words.length ;i++){
            System.out.print(words[i]);
        }
    }
}
