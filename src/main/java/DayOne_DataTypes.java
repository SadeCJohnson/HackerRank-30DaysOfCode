import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOne_DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int integer;
        double doubleNum;
        String var;
        String var2;

        /* Read and save an integer, double, and String to your variables.*/
        integer = scan.nextInt();
        doubleNum = scan.nextDouble();
        var = scan.next();
        var2 = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + integer);
        System.out.println(d + doubleNum);
        System.out.println(s + var + var2);


        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}