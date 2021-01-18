package Day15_LinkedList;

import java.util.Scanner;

public class Day_15_LinkedList {
    public static Node insert(Node head, int data) {

        Node current = head;

        if (current == null) {
            head = new Node(data);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
        return head; //the head returns all of the elements
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
