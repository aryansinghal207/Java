import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class Binarysearchtree {
    static Scanner sc = new Scanner(System.in);
    static Node tree() {
        int data = sc.nextInt();
        if (data < 0) return null;
        Node root = new Node(data);
        System.out.println(data + "\n");
        root.left = tree();
        System.out.println(data + "\n");
        root.right = tree();
        return root;
    }
    static boolean search(Node root, int x){
        if(root == null) return false;
        if(root.data == x) return true;
        if(root.data < x) return search(root.right,x);
        return search(root.left,x);
    }
    static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);// 2 3 null
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.poll();//1 , null
            if (temp == null) {
                System.out.println();
                if (!q.isEmpty()) q.add(null);
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("target: ");
        int x = sc.nextInt();
        Node root = tree();
        System.out.println();
        System.out.println(search(root,x));
        levelOrder(root);
    }
}