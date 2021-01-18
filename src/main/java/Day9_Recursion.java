import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Day9_Recursion {
    // Complete the factorial function below.
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int numArray = 3;
        int numArray3 = 5;
        int numArray4 = 10;
        int result = factorial(numArray);
        int result3 = factorial(numArray3);
        int result4 = factorial(numArray4);
        System.out.println(result);
        System.out.println(result3);
        System.out.println(result4);
        scanner.close();
    }
}

