// import java.util.*;
// public class MyMyLinkedlist{
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
//         MyLinkedlistlist = new MyLinkedlist;
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.display();
//     }
// }


// import java.util.*;
// public class MyLinkedlist {
//     public static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addFirst(int data) { 
//         Node newnode = new Node(data);
//         if (head == null) {
//             head = tail = newnode;
//             return;
//         }
//         newnode.next = head;
//         head = newnode;
//     }
//     public void add(int idx, int data) {
//         if (idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newnode = new Node(data);
//         Node temp = head;
//         int i = 0;
//         while (i < idx - 1 && temp != null) {
//             temp = temp.next;
//             i++;
//         }
//         if (temp == null) {
//             System.out.println("Index out of bounds");
//             return;
//         }
//         newnode.next = temp.next;
//         temp.next = newnode;
//     }
//     public void print() { 
//         if (head == null) {
//             System.out.println("Linked List is Empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         MyLinkedlist l1 = new MyLinkedlist();
//         l1.addFirst(2); 
//         l1.addFirst(1);
//         l1.add(2, 9);
//         l1.print(); 
//     }
// }


// import java.util.*;
// public class MyLinkedlist{
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
//     public void addFirst(int data){
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
//             System.out.println("MyLinkedlistis empty");
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
//         MyLinkedlistl1=new MyLinkedlist;
//         l1.addFirst(2);
//         l1.addFirst(1);
//         l1.addlast(3);
//         l1.addlast(4);
//         l1.print();
//     }
// }


// import java.util.*;
// public class MyLinkedlist{
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
//     public void addFirst(int data){
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
//             addFirst(data);
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
//             System.out.print("MyLinkedlistis empty");
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
//             System.out.print("MyLinkedlistis empty");
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
//         MyLinkedlistl1=new MyLinkedlist;
//         l1.addFirst(2);
//         l1.addFirst(1);
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
// public class MyLinkedlist{
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
//     public void addFirst(int data){
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
//         MyLinkedlistl1=new MyLinkedlist;
//         l1.addFirst(2);
//         l1.addFirst(1);
//         l1.addlast(3);
//         l1.addlast(4);
//         System.out.println(l1.itrsearch(3));
//         System.out.println(l1.itrsearch(10));
//     }
// }


import java.util.*;
public class MyLinkedlist {
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
    public void addFirst(int data) { 
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void last_delete(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }  
        if(head.next==null){
            head=null;
            return;
        }
        Node cur=head;
        while(cur.next.next != null){
            cur=cur.next;
        }
        cur.next=null;
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
    public static void main(String[] args) {
        MyLinkedlist l1 = new MyLinkedlist();
        l1.addFirst(2); 
        l1.addFirst(1);
        l1.print(); 
        l1.last_delete();
        l1.print(); 
    }
}
