import java.util.*;
public class Linkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.print("Linked list is empty");
        }
        Node temp=head;   // We have used temp for that we could iterate on every step without changing head and tail bcz head and tail position are fixed and only changes when change in linked list.
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void add(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String args[]){
        Linkedlist l1=new Linkedlist();
        l1.addfirst(2);
        l1.addfirst(1);
        l1.addlast(3);
        l1.addlast(4);
        l1.add(2,9);
        l1.print();
    }
}