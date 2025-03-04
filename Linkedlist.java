// import java.util.*;
// public class Linkedlist {
//     Node head;
//     static class Node {
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public void insert(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }
//     public void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         Linkedlist list = new Linkedlist();
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.display();
//     }
// }


// import java.util.*;
// public class Linkedlist{
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addfirst(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public void print(){
//         if(head==null){
//             System.out.println("LinkedList is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp != null){
//             System.out.println(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Linkedlist l1=new Linkedlist();
//         l1.addfirst(2);
//         l1.addfirst(1);
//         l1.addlast(3);
//         l1.addlast(4);
//         l1.print();
//     }
// }


// import java.util.*;
// public class Linkedlist{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addfirst(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public void print(){
//         if(head==null){
//             System.out.print("Linked list is empty");
//         }
//         Node temp=head;   // We have used temp for that we could iterate on every step without changing head and tail bcz head and tail position are fixed and only changes when change in linked list.
//         while(temp != null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public void add(int idx,int data){
//         if(idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp=head;
//         int i=0;
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removefirst(){
//         if(size==0){
//             System.out.print("Linkedlist is empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             int val=head.data;
//             head=tail=null;
//             return val;
//         }
//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }
//     public int removelast(){
//         if(size==0){
//             System.out.print("Linkedlist is empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }
//         Node prev=head;
//         for(int i=0;i<size-2;i++){
//             prev=prev.next; 
//         }
//         int val=prev.next.data;
//         prev.next=null;
//         tail=prev;
//         size--;
//         return val;
//     }
//     public static void main(String args[]){
//         Linkedlist l1=new Linkedlist();
//         l1.addfirst(2);
//         l1.addfirst(1);
//         l1.addlast(3);
//         l1.addlast(4);
//         l1.add(2,9);
//         l1.print();
//         System.out.println(Linkedlist.size);
//         l1.removefirst();
//         l1.print();
//         System.out.println(Linkedlist.size);
//         l1.removelast();
//         l1.print();
//         System.out.println(Linkedlist.size);
//     }
// }


// import java.util.*;
// public class Linkedlist{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addfirst(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public int itrsearch(int key){
//         Node temp=head;
//         int i=0;
//         while(temp!=null){
//             if(temp.data==key){
//                 return i;
//             }
//             temp=temp.next;
//             i++;
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         Linkedlist l1=new Linkedlist();
//         l1.addfirst(2);
//         l1.addfirst(1);
//         l1.addlast(3);
//         l1.addlast(4);
//         System.out.println(l1.itrsearch(3));
//         System.out.println(l1.itrsearch(10));
//     }
// }


