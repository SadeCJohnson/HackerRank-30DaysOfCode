package ExtraPractice;

public class    FizzBuzz {
    /*Instructions
     * Write a program which returns "Fizz" if the number is a multiple of 3
     * return buzz if the number is a multiple of 5
     * return fizzbuzz if the number is a multiple of 3 and 5
     * return the number if it's neither divisible by 3 or 5
     *
     * */
    public static final int THREE = 3;
    public static final int FIVE = 5;

    public static void main(String[] args) {
        int testNum = 3; //divisible by 3
        int testNum2 = 5; //divisible by 5
        int testNum3 = 15; //divisible by 3 and 5
        int testNum4 = 4; //not divisible by 3 or 5

        System.out.println(fizzBuzz(testNum));
        System.out.println(fizzBuzz(testNum2));
        System.out.println(fizzBuzz(testNum3));
        System.out.println(fizzBuzz(testNum4));
        System.out.println(fizzBuzz(25));
        System.out.println(fizzBuzz(10));
        System.out.println(fizzBuzz(24));


    }

    private static String fizzBuzz(int num) {
        if(num%THREE ==0 && num%FIVE==0){
            return "FizzBuzz";
        }else if(num%THREE==0){
            return "Fizz";
        }else if(num%FIVE==0){
            return "Buzz";
        }else{
            return String.valueOf(num);
        }
    }

}
