
import java.util.LinkedList;
import java.util.Scanner;

/*TODO:
*  1. Optimize code w/out a Linked List - it's apparently not needed for this solution and just takes up memory
*  unnecessarily.
*       a. start the for loop at 2 and don't allow it to iterate to the actual numbInput
*       b. If any number is divisible by the numInput passed in, then  we need to print "Not prime" and break out of the loop
*       since this will automatically defy the primality rule
*       c. otherwise if no numbers are divisible, print Prime
*  2. (More Advanced Optimization): Memoize the function invocation by storing previously calculated values in a hashmap and then
*  checking to see if the value is present before performing the calculation (use putIfAbsent --from Java 8 HashMap API documentation) */
public class Day_25_Runtime_Complexity {
    static void primeOrNotPrime(int numInput) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= numInput; i++) {
            if (numInput % i == 0) {
                list.add(i);
            }
        }
        String finalVal = list.size() == 2 ? "Prime" : "Not prime";
        System.out.println(finalVal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int numVal;

        while (T-- > 0) {
            numVal = input.nextInt();
            primeOrNotPrime(numVal);
        }
        input.close();
    }
}
