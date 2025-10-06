package CP;

public class Grade {

 // private member variables
   private String studentName;
   private int scienceMarks;
   private int mathsMarks;
   private int englishMarks;
   private int average;

// getter methods
   public String getStudentName(){
    return studentName;
   }

   public int getScienceMarks(){
    return scienceMarks;
   }

   public int getMathMarks(){
    return mathsMarks;
   }

   public int getEnglishMarks(){
    return englishMarks;
   }



// mutator methods
   public void setStudentDetails(String studentName, int scienceMarks , int mathsMarks, int englishMarks ){
     this.studentName = studentName;
     this.englishMarks = englishMarks;
     this.mathsMarks = mathsMarks;
     this.scienceMarks = scienceMarks;

   }

// calculate average of the grades 
  public int calculateAverage(){
    average = (scienceMarks + mathsMarks + englishMarks) / 3;
    return average;
   }

  
// calculate the grade based on average
   public void calculateGrade(){
     int average = calculateAverage();
     if (average >= 90){
        System.out.println("Grade A");
     } else if (average >= 75){
        System.out.println("Grade B");
     } else if (average >= 50){
        System.out.println("Grade C");
     } else {
        System.out.println("Grade F");
     }


   }

// print student details
   public void printDetails(){
    System.out.println("Student Name : " + studentName);
    System.out.println("Science Marks : " + scienceMarks);
    System.out.println("Maths Marks : " + mathsMarks);
    System.out.println("English Marks: " + englishMarks);
    System.out.println("Average Marks : " + calculateAverage());
    calculateGrade();
   }

   

}
