import java.util.Scanner;

public class IT24103137Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();
  
        System.out.printf("%d %d %d %d %d",
            (number / 10000) % 10,
            (number / 1000) % 10,
            (number / 100) % 10,
            (number / 10) % 10,
            number % 10
        );
    }
}
