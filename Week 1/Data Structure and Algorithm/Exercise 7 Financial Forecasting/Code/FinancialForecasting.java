import java.util.Scanner;

public class FinancialForecasting {

    
    public static double calculateFutureValue(double presentValue, double rate, int periods) {
        // Base case
        if (periods == 0) {
            return presentValue;
        } else {
            
            return calculateFutureValue(presentValue * (1 + rate), rate, periods - 1);
        }
    }
    /*Recursive function takes O(n) time complexity
    and O(n) space complexity due to the call stack.
    the better approach is to use a loop/iteration
    which takes O(n) time complexity and O(1) space complexity.
     */

    public static void main(String[] args) {
        double presentValue;
        double rate;
        int periods;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the present value: ");
        presentValue = scanner.nextDouble();
        System.out.print("Enter the interest rate (as a percentage): ");
        rate = scanner.nextDouble();
        rate = rate / 100; // Convert percentage to decimal
        System.out.print("Enter the number of periods (years): ");
        periods = scanner.nextInt();

        // Calculate future value
        double futureValue = calculateFutureValue(presentValue, rate, periods);
        
        System.out.println("The future value after " + periods + " years is: $" + futureValue);
    }
}
