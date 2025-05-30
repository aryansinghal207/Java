// import java.util.*;
// public class Doublelinkedlist{
//     public class Node{
//         int data;
//         Node next;
//         Node prev;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//             this.prev=null;
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
//         head.prev=newNode;
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
//         newNode.prev = tail;
//         tail=newNode;
//     }
//     public int removefirst(){
//         if(head == null){
//             System.out.println("DLL is empty");
//             return Integer.MIN_VALUE;
//         }
//         if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size--;
//             return val;
//         }
//         int val=head.data;
//         head=head.next;
//         head.prev=null;
//         size--;
//         return val;
//     }
//     public int removelast(){
//         if(head == null){
//             System.out.println("DLL is empty");
//             return Integer.MIN_VALUE;
//         }
//         if(size==1){
//             head=tail=null;
//             size--;
//         }
//         int val=tail.data;
//         tail=tail.prev;
//         tail.next=null;
//         size--;
//         return val;
//     }
//     public void print(){
//         Node temp=head;
//         while(temp != null){
//             if(temp==null){
//                 System.out.print("Linkedlist is empty");
//             }
//             System.out.print(temp.data+"<->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args){
//         Doublelinkedlist dll=new Doublelinkedlist();
//         dll.addFirst(4);
//         dll.addFirst(3);
//         dll.addFirst(2);
//         dll.addFirst(1);
//         dll.addlast(5);
//         dll.print();
//         System.out.println(dll.size);
//         dll.removefirst();
//         dll.removelast();
//         dll.print();
//         System.out.print(dll.size);
//     }
// }


// Reverse a Doublylinkedlist
import java.util.*;
public class Doublelinkedlist{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev = tail;
        tail=newNode;
    }
    public int removefirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public int removelast(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            head=tail=null;
            size--;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    public void print(){
        Node temp=head;
        while(temp != null){
            if(temp==null){
                System.out.print("Linkedlist is empty");
            }
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args){
        Doublelinkedlist dll=new Doublelinkedlist();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addlast(5);
        dll.print();
        dll.reverse();
        dll.print();
    }
}

    