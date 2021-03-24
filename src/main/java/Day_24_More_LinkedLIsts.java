import java.util.Scanner;


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

class Day_24_More_LinkedLIsts {

    public static Node removeDuplicates(Node head) {
        //this sets the current pointer
        Node cursor = head;

      /*while the next element or next reference is not null,
      1. check the value in the current node and compare it to the value of the next reference / next Node
        a. if the values are NOT the same, set the cursor to the next reference and repeat the process
        b. if the values ARE the same, remove the reference to the duplicate node and make the current cursor's next be set to the next next node      */
        while (cursor.next != null) {
            if (cursor.data != cursor.next.data) {
                cursor = cursor.next;
            } else {
                cursor.next = cursor.next.next;
            }
        }

        return head;

    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}