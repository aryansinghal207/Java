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


// // Push at bottom of Stack
// import java.util.*;
// public class Stackcode{
//     public static void pushAtbottom(Stack<Integer> s,int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top=s.pop();
//         pushAtbottom(s,data);
//         s.push(top);
//     }
//     public static void main(String[] args){
//         Stack<Integer> s=new Stack<>();
//         s.push(1);  
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
//         pushAtbottom(s,0);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// // Reverse a string using Stack
// import java.util.*;
// public class Stackcode{
//     public static String reverseString(String str){
//         Stack<Character> s=new Stack<>();
//         int idx=0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         StringBuilder result=new StringBuilder("");
//         while(!s.isEmpty()){
//             char curr=s.pop();
//             result.append(curr);
//         }
//         return result.toString();
//     }
//     public static void main(String[] args){
//         String str="aryan";
//         String result=reverseString(str);
//         System.out.println(result);
//     }
// }


// // Reverse a string using without using extra space
// import java.util.*;
// public class Stackcode{
//     public static void pushAtbottom(Stack<Integer> s,int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top=s.pop();
//         pushAtbottom(s,data);
//         s.push(top);
//     }
//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top=s.pop();
//         reverseStack(s);
//         pushAtbottom(s,top);
//     }
//     public static void printStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String[] args){
//         Stack<Integer> s=new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         reverseStack(s);
//         printStack(s);
//     }
// }


// // Stock Span Problem   
// import java.util.*;
// public class Stackcode{
//     public static void Stockspan(int Stocks[],int span[]){
//         Stack<Integer> s=new Stack<>();
//         span[0]=1;
//         s.push(0);
//         for(int i=1;i<Stocks.length;i++){
//             int currprice=Stocks[i];
//             while(!s.isEmpty() && currprice>Stocks[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i]=i+1;
//             }else{
//                 int prevhigh=s.peek();
//                 span[i]=i-prevhigh;
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String[] args){
//         int Stocks[]={100,80,60,70,60,85,100};
//         int span[]=new int[Stocks.length];
//         Stockspan(Stocks,span);
//         for(int i=0;i<span.length;i++){
//             System.out.println(span[i]+" ");
//         }
//     }
// }


// // Next Greater Element in right
// import java.util.*;
// public class Stackcode{
//     public static void main(String[] args){
//         int arr[]={6,8,0,1,3};
//         Stack<Integer> s=new Stack<>();
//         int nxtgreater[]=new int[arr.length];
//         for(int i=arr.length-1;i>=0;i--){
//             while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nxtgreater[i]=-1;
//             }else{
//                 nxtgreater[i]=arr[s.peek()];
//             }
//             s.push(i);
//         }
//         for(int i=0;i<nxtgreater.length;i++){
//             System.out.print(nxtgreater[i]+" ");
//         }
//         System.out.println();
//     }
// }


// Palindrome Linkedlist
import java.util.*;
public class Stackcode{
    public static void ispalindrome()
    public static void main(String[] args){

    }
}