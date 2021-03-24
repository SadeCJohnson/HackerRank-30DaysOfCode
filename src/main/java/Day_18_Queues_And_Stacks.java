
import java.io.*;
import java.util.*;
public class Day_18_Queues_And_Stacks {
    //task 1
    //Stack stack;
    Stack stack = new Stack<>();
    LinkedList queue = new LinkedList<>();

    //task 2
    void pushCharacter(char ch){
        stack.push(ch);
    }

    //task 3
    void enqueueCharacter(char ch){
        queue.addLast(ch);
    }

    //task 4
    char popCharacter(){
        return (char) stack.pop();
    }

    //task 5
    char dequeueCharacter(){
        return (char) queue.remove(0);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day_18_Queues_And_Stacks p = new Day_18_Queues_And_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}