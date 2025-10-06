package CP.GradingSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // create a grade object
        Grade student1 = new Grade();

        while (true){

// ================ name input =================== //

         System.out.println("Enter Student Name: ");
         String name = scanner.nextLine();


// ================= name input validation =================== //

         if(name.isEmpty()){
            System.out.println("Name cannot be empty. Please enter a valid name.");
            continue;
         } else if (name.matches(".*\\d.*")){
            System.out.println("Name cannot contain numbers. Please enter a valid name.");
            continue;
         }
       
// ================ marks input =================== //

        System.out.println("Enter Science Marks: ");
        int science = scanner.nextInt();

// ================= science marks input validation =================== //

        if (science < 0){
            System.out.println("Marks cannot be negative. Please enter a valid mark.");
            continue;
        } else if (science > 100){
            System.out.println("Marks cannot be greater than 100. Please enter a valid mark.");
            continue;
        }

        System.out.println("Enter Maths Marks: ");
        int maths = scanner.nextInt();

// ================= maths marks input validation =================== //

          if (maths < 0){
            System.out.println("Marks cannot be negative. Please enter a valid mark.");
            continue;
        } else if (maths> 100){
            System.out.println("Marks cannot be greater than 100. Please enter a valid mark.");
            continue;
        }

        System.out.println("Enter English Marks: ");
        int english = scanner.nextInt();

// ================= english marks input validation =================== //

            if (english < 0){
            System.out.println("Marks cannot be negative. Please enter a valid mark.");
            continue;
        } else if (english > 100){
            System.out.println("Marks cannot be greater than 100. Please enter a valid mark.");
            continue;
        }


        
        student1.setStudentDetails(name, science, maths, english);
        student1.printDetails();
        scanner.close();
        break;
        }

        

     

    }
}
