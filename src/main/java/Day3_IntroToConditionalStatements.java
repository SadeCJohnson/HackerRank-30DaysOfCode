import java.util.Scanner;

public class Day3_IntroToConditionalStatements {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This Program will inform you whether or not your input is weird based on special logic." +
                "\nPlease enter a Number between 1 and 100, inclusive.\n ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 == 1 || (N % 2 == 0 && N >= 6 && N <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
