import java.util.Scanner;
   public class  IT24103137Lab3Q1B {
     public static void main(String[] args){
        double pricePerkg , quanity , totalAmount , discountTotal , finalAmount , discountAmount;
        double discount = 0.10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of 1kg rice: ");
        pricePerkg = input.nextDouble();
        System.out.print("Enter the numbere of kg you want to buy: ");
        quanity = input.nextDouble();
        totalAmount = pricePerkg * quanity;
        discountTotal = totalAmount * discount;
        finalAmount = totalAmount - discountTotal;
        System.out.print("finalAmount of rice: " + finalAmount );
        }
}