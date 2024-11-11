import java.util.Scanner;
   public class IT24103137Lab3Q3 {
       public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter The Amount :");
			int amount = input.nextInt();
		if(amount>0)
		{
			int countfivethousand = amount/5000;
			amount = amount%5000;
			int countthousand = amount/1000;
			amount = amount%1000;
			int countfivehundred = amount/500;
			amount = amount%500;
			int counttwohundred = amount/200;
			amount = amount%200;
			int counthundred = amount/100;
			amount = amount%100;
			int countfifty = amount/50;
			amount = amount%50;
			int counttwenty = amount/20;
			amount = amount%20;
			int countten = amount/10;
			amount = amount%10;
			int countfive = amount/5;
			amount = amount%5;
			int counttwo = amount/2;
			amount = amount%2;
			int countone = amount/1;
			
			System.out.println("5000 Notes - " +countfivethousand);
			System.out.println("1000 Notes - " +countthousand);
			System.out.println("500 Notes - " +countfivehundred);
			System.out.println("200 Notes - " +counttwohundred);
			System.out.println("100 Notes - " +counthundred);
			System.out.println("50 Notes - " +countfifty);
			System.out.println("20 Notes - " +counttwenty);
			System.out.println("10 Coins - " +countten);
			System.out.println("05 Coins - " +countfive);
			System.out.println("02 Coins - " +counttwo);
			System.out.println("01 Coins - " +countone);
		}
			
	}
}