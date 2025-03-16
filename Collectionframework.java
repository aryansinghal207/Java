// import java.util.LinkedList;
// public class Collectionframework{
//     public static void main(String[] args){
//         LinkedList<Integer> ll=new LinkedList<>();
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addFirst(0);
//         System.out.println(ll);
//     }
// }


// import java.util.LinkedList;
// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Collectionframework {
//     private static Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     private static Node merge(Node head1, Node head2) {
//         Node mergedll = new Node(-1);
//         Node temp = mergedll;
//         while (head1 != null && head2 != null) {
//             if (head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//             }
//             temp = temp.next;
//         }
//         while (head1 != null) {
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }
//         while (head2 != null) {
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }
//         return mergedll.next;
//     }
//     public static Node mergesort(Node head) {
//         if (head == null || head.next == null) { // Fixed null check
//             return head;
//         }
//         Node mid = getMid(head);
//         Node righthead = mid.next;
//         mid.next = null;
//         Node newleft = mergesort(head);
//         Node newright = mergesort(righthead);
//         return merge(newleft, newright);
//     }
//     public static void printList(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         Node head = new Node(5);
//         head.next = new Node(4);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(2);
//         head.next.next.next.next = new Node(1);
//         System.out.println("Original List:");
//         printList(head);
//         head = mergesort(head);
//         System.out.println("Sorted List:");
//         printList(head);
//     }
// }


import java.util.*;
public class Collectionframework {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addlast(int data) { 
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print() { 
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void zigzag() {
        if (head == null || head.next == null) return; 
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
        Collectionframework l1 = new Collectionframework();
        l1.addlast(1); 
        l1.addlast(2);
        l1.addlast(3);
        l1.addlast(4);
        l1.addlast(5);
        l1.print(); 
        l1.zigzag();
        l1.print();
    }
}
