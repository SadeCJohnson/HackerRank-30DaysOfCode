import java.util.Scanner;

class Node2 {
    Node2 left, right;
    int data;

    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution20 {

    public static int getHeight(Node2 root) {
        int leftHeight = 0;
        int rightHeight = 0;
        if (root.left != null) {
            leftHeight = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            rightHeight = getHeight(root.right) + 1;
        }

        //ternary operator

        return (Math.max(leftHeight, rightHeight));
    }

    public static Node2 insert(Node2 root, int data) {
        if (root == null) {
            return new Node2(data);
        } else {
            Node2 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node2 root = null;
        while (T-- > 0) { //todo: figure out why this line works when T = 0 when 0 !> 0
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}