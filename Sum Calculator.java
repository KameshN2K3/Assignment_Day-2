import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter five integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        
        System.out.println("The sum of the numbers is: " + sum);
        
        scanner.close();
    }
}
