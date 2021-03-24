import java.util.Arrays;
import java.util.Scanner;


class ComputeDifference {
    private int[] elements;
    public int maximumDifference;


    //task 1: create class constructor that takes an array of integers as a parameter and saves it to the elements      instance variable
    //HINT: class constructor should have the same name as the class
    ComputeDifference(int[] elementValues) {
        elements = elementValues;
    }

    //task2: create a computeDifference method that finds the maximum absolute difference between any numbers in elements
    // and stores it in the instance variable.
    void computeDifference() {
        Arrays.sort(elements);
        int lastIndex = elements[elements.length - 1];
        int firstIndex = elements[0];
        maximumDifference = lastIndex - firstIndex;
    }
} // End of Difference class

public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        ComputeDifference difference = new ComputeDifference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}




