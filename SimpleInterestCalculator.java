import java.util.Scanner;

public class SimpleInterestCalculator{
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The simple interest for the given values is: " + simpleInterest);
    }
}
