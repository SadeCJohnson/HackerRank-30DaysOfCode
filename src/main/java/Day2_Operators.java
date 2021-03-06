import java.util.Scanner;

public class Day2_Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double totalTip, totalTax;
        totalTip = meal_cost * tip_percent / 100;
        //  System.out.println("Total Tip: "+ totalTip);
        totalTax = meal_cost * tax_percent / 100;
        //  System.out.println("Total Tax: "+ totalTax);
        double totalCost = meal_cost + totalTip + totalTax;
        // System.out.println("Total Cost: " + (int)totalCost);
        System.out.println(Math.round(totalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
