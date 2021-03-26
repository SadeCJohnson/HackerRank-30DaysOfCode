import java.util.Scanner;

public class Solution {


    static int calculateLateFee(int day1, int day2, int month1, int month2, int year1, int year2) {

        if ((day1 == day2) && (month1 == month2) && (year1 == year2) ||
                (day1 < day2) && (month1 < month2) && (year1 < year2) ||
                (day1 < day2) && (month1 < month2) && (year1 == year2) ||
                (day1 < day2) && (month1 == month2) && (year1 == year2) ||
                (day1 > day2) && (month1 > month2) && (year1 < year2)) {
            return 0;
        } else if ((day1 > day2) && (month1 == month2) && (year1 == year2)) {
            return 15 * (day1 - day2);
        } else if ((day1 > day2) && (month1 > month2) && (year1 == year2) ||
                (day1 == day2) && (month1 > month2) && (year1 == year2) ||
                (day1 < day2) && (month1 > month2) && (year1 == year2)) {
            return 500 * (month1 - month2);
        } else {
            return 10000;
        }


    }


    public static void main(String[] args) {

        //scan in the input
        Scanner scanner = new Scanner(System.in);
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();

        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();

        System.out.print(calculateLateFee(day1, day2, month1, month2, year1, year2));


    }
}