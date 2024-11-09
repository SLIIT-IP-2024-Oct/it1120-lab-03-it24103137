import java.util.Scanner;
   public class IT24103137Lab3Q2 {
     public static void main(String[] args){
         double monthlySalary , numberOfOtHours , otHourRate , totalSalary , otAmount;
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the monthly salary: ");
         monthlySalary = input.nextDouble();
         System.out.print("Enter the Ot hours: ");
         numberOfOtHours = input.nextDouble();
         System.out.print("Enter the Ot hourly rate: ");
         otHourRate = input.nextDouble();
         otAmount = numberOfOtHours * otHourRate;
         totalSalary = monthlySalary + otAmount;
      System.out.println("the totalSalary incluiding Ot is: " + totalSalary );
      }
}