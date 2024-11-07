import java.util.Scanner;
   public class  IT24103137Lab3Q1 {
     public static void main(String[] args){
        double pricePerkg , quanity , totalAmount;  
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the pricePerkg; ");   
        pricePerkg = input.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy; ");
        quanity = input.nextDouble();
        totalAmount = pricePerkg * quanity;
        System.out.println("the total amount is: " + totalAmount);
        }
}