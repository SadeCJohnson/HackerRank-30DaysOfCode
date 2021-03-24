package ExtraPractice;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzLeet {


    public static List<String> fizzBuzz(int n) {
        List<String> stringList = new LinkedList<>();
        for (int index = 1; index <= n; index++) {
            if (index % 15 == 0) {
                stringList.add("FizzBuzz");
            } else if (index % 3 == 0) {
                stringList.add("Fizz");
            } else if (index % 5 == 0) {
                stringList.add("Buzz");
            } else {
                stringList.add(String.valueOf(index));
            }
        }
        return stringList;
    }

    public static void main(String[] arg) {
        //List<String> testList = fizzBuzz(3);
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(15));
    }
}
