import java.io.*;
import java.util.*;

public class Day6_Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //repeat this process for the amount of times that the user specifies
        for (int i = 0; i < num; i++) {
            //take user input in the form of a string
            String string = scanner.next();
            //convert the string to a character array so the indices can be iterated thru
            char[] charArray = string.toCharArray();
            //create 2 output variables, 1 for even indices and 1 for odd indices
            String finalString1 = ""; //even indices
            String finalString2 = ""; //odd indices
            //iterate thru the length of the string to hit each index
            for (int index = 0; index < string.length(); index++) {
                /*TODO: Write more efficient string concatenation to resolve the following warning messages:
                Warning:(22, 34) String concatenation '+=' in loop
                Warning:(24, 34) String concatenation '+=' in loop  */
                if (index % 2 == 0) {
                    finalString1 += charArray[index];
                } else {
                    finalString2 += charArray[index];
                }
            }
            System.out.print(finalString1 + " " + finalString2);
            System.out.print("\n");
        }
    }
}
