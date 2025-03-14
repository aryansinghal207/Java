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


 