// // Implementing Stack in the form of ArrayList
// import java.util.*;
// public class Stackcode{
//     static class Stack{
//         static ArrayList<Integer> list=new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size()==0;
//         }
//         public static void push(int data){
//             list.add(data);   
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String[] args){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// // Implementing Stack in the form of LinkedList
// import java.util.*;
// public class Stackcode{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class Stack{
//         static Node head=null;  
//         public static boolean isEmpty(){
//             return head==null;
//         }
//         public static void push(int data){
//             Node newNode=new Node(data);
//             if(isEmpty()){
//                 head=newNode;
//                 return;
//             }
//             newNode.next=head;
//             head=newNode;
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=head.data;
//             head=head.next;
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// // Same code as above using JCF
// import java.util.*;
// public class Stackcode{
//     public static void main(String[] args){
//         Stack<Integer> s=new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// Push at bottom of Stack
import java.util.*;
public class Stackcode{
    public static void pushAtbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        pushAtbottom(s,0);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}