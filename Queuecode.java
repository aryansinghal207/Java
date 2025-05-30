// // Implementation of queue using array
// public class Queuecode{
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         Queue(int n){
//             arr=new int[n];
//             size=n;
//             rear=-1;
//         }
//         public static boolean isEmpty(){
//             return rear==-1;
//         }
//         public static void add(int data){
//             if(rear==size-1){
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear=rear+1;
//             arr[rear]=data;
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             int front=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear=rear-1;
//             return front;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }  
//     public static void main(String[] args){
//         Queue q=new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// // Circular Queue
// import java.util.*;
// public class Queuecode{
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;
//         Queue(int n){
//             arr=new int[n];
//             size=n;
//             rear=-1;
//             front=-1;
//         }
//         public static boolean isEmpty(){
//             return rear == -1 && front == -1;
//         }
//         public static boolean isFull(){
//             return (rear+1)%size==front;
//         }
//         public static void add(int data){
//             if(isFull()){
//                 System.out.println("Queue is full");
//                 return;
//             }
//             if(front == -1){
//                 front=0;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             int result=arr[front];
//             if(rear==front){
//                 rear=front=-1;
//             }else{
//                 front=(front+1)%size;
//             }
//             return result;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }
//     public static void main(String[] args){
//         Queue q=new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int new_data) {
//         data = new_data;
//         next = null;
//     }
// }
// class Queue{
//     private Node front;
//     private Node rear;
//     public Queue(){
//         front = rear = null;
//     }
//     public boolean isEmpty() {
//         return front == null;
//     }
//     public void enqueue(int new_data) {
//         Node new_node = new Node(new_data);
//         if (isEmpty()) {
//             front = rear = new_node;
//             printQueue();
//             return;
//         }
//         rear.next = new_node;
//         rear = new_node;
//         printQueue();
//     }
//     public void dequeue() {
//         if (isEmpty()) {
//             return;
//         }
//         Node temp = front;
//         front = front.next;
//         if (front == null) rear = null;
//         temp = null;
//         printQueue();
//     }
//     public void printQueue() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return;
//         }
//         Node temp = front;
//         System.out.print("Current Queue: ");
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.enqueue(10);
//         q.enqueue(20);
//         q.dequeue();
//         q.dequeue();
//         q.enqueue(30);
//         q.enqueue(40);
//         q.enqueue(50);
//         q.dequeue();
//     }
// }


// import java.util.*;
// public class Queuecode{
//     int i;
//     int cap;
//     int arr[];
//     Queuecode(int x){
//         i=0;
//         cap=x;
//         arr=new int[cap];
//     }
//     void enque(int val){
//         arr[i]=val;
//         i++;
//     }
//     void deque(){
//         for(int j=0;j<i-1;j++){
//             arr[j]=arr[j+1];
//         }
//         i--;
//     }
//     boolean isFull(){
//         if(i==cap){
//             return true;
//         }
//         return false;
//     }
//     boolean isEmpty(){
//         if(i==0){
//             return true;
//         }
//         return false;
//     }
//     int front(){
//         if(i==0){
//             System.out.println("q is empty");
//             return -1;
//         }
//         return 0;
//     }
//     int rear(){
//         if(i==0){
//             System.out.println("q is empty");
//             return -1;
//         }
//         return i-1;
//     }
//     void print(){
//         for(int j=0;j<i;j++){
//             System.out.print(arr[j]+" ");
//         }System.out.println();
//     }
//     public static void main(String[] args){
//         Queuecode q=new Queuecode(5);
//         q.enque(2);
//         q.enque(4);
//         q.enque(6);
//         q.enque(8);
//         q.print();
//         q.deque();
//         q.deque();
//         q.print();
//         System.out.println(q.front());
//         System.out.println(q.rear());
//         System.out.println(q.isFull());
//         System.out.println(q.isEmpty());
//     }
// }


// import java.util.*;
// public class Queuecode{
//     int i;
//     int cap;
//     int arr[];
//     Queuecode(int x){
//         i=0;
//         cap=x;
//         arr=new int[cap];
//     }
//     void enque(int val){
//         arr[i]=val;
//         i++;
//     }
//     void deque(){
//         for(int j=0;j<i-1;j++){
//             arr[j]=arr[j+1];
//         }
//         i--;
//     }
//     boolean isEmpty(){
//         if(i==0){
//             return true;
//         }
//         return false;
//     }
//     int front(){
//         if(i==0){
//             System.out.println("q is empty");
//             return -1;
//         }
//         return 0;
//     }
//     int rear(){
//         if(i==0){
//             System.out.println("q is empty");
//             return -1;
//         }
//         return i-1;
//     }
//     void print(){
//         for(int j=0;j<i;j++){
//             System.out.print(arr[j]+" ");
//         }System.out.println();
//     }
//     public static void main(String[] args){
//         Queuecode q=new Queuecode(5);
//         q.enque(2);
//         q.enque(4);
//         q.enque(6);
//         q.enque(8);
//         q.print();
//         q.deque();
//         q.deque();
//         q.print();
//         System.out.println(q.front());
//         System.out.println(q.rear());
//         System.out.println(q.isEmpty());
//     }
// }


// import java.util.*;
// public class Queuecode{
//     int i;
//     int cap;
//     int arr[];
//     Queuecode(int x){
//         i=0;
//         cap=x;
//         arr=new int[cap];
//     }
//     void enque(int val){
//         if(isFull)
//     }
//     void deque(){
//         if(isEmpty()) return;
//         int rear=getRear();
//         rear=(rear+1)%cap;
//         arr[rear]=x;
//         size++;
//     }
//     int getRear(){
//         if(isEmpty()){

//         }
//     }
//     boolean isFull(){
//         if(i==cap){
//             return true;
//         }
//         return false;
//     }
//     int front(){
//         if(i==0){
//             System.out.println("q is empty");
//             return -1;
//         }
//         return 0;
//     }
//     int rear(){
//         if(i==0){
//             System.out.println("q is empty");
//             return -1;
//         }
//         return i-1;
//     }
//     void print(){
//         for(int j=0;j<i;j++){
//             System.out.print(arr[j]+" ");
//         }System.out.println();
//     }
//     public static void main(String[] args){
//         Queuecode q=new Queuecode(5);
//         q.enque(2);
//         q.enque(4);
//         q.enque(6);
//         q.enque(8);
//         q.print();
//         q.deque();
//         q.deque();
//         q.print();
//         System.out.println(q.front());
//         System.out.println(q.rear());
//         System.out.println(q.isFull());
//         System.out.println(q.isEmpty());
//     }
// }


// // Queue using Linkedlist
// import java.util.*;
// public class Queuecode{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         } 
//     }
//     static class Queue{
//         static Node head=null;
//         static Node tail=null;
//         public static boolean isEmpty(){
//             return head == null && tail == null;
//         }
//         public static void add(int data){
//             Node newNode=new Node(data);
//             if(head==null){
//                 head=tail=newNode;
//                 return;
//             }
//             tail.next=newNode;
//             tail=newNode;
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             int front=head.data;
//             if(tail == head){
//                 tail=head=null;
//             }else{
//                 head=head.next;
//             }
//             return front;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args){
//         Queue q=new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// // Queue using Java Collection Framework
// import java.util.*;
// public class Queuecode{
//     public static void main(String[] args){
//         // Queue<Integer> q=new LinkedList<>();
//         Queue<Integer> q=new ArrayDeque<>(); 
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// // Queue Using two pointer
// import java.util.*;
// public class Queuecode{
//     static class Queue{
//         static Stack<Integer> s1=new Stack<>();
//         static Stack<Integer> s2=new Stack<>();
//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }
//         public static void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue Empty");
//                 return -1;
//             }
//             return s1.pop();
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue Empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }
//     public static void main(String[] args){
//         Queue q=new Queue(); 
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// // Queue using 2 stack
// import java.util.*;
// public class Queuecode{
//     static class Queue{
//         static Stack<Integer> s1=new Stack<>();
//         static Stack<Integer> s2=new Stack<>();
//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }
//         public static void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         } 
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue Empty");
//                 return -1;
//             }
//             return s1.pop();
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue Empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }
//     public static void main(String []args){
//         Queue q=new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// // Stack Using 2 Queue
// import java.util.*;
// public class Queuecode{
//     static class Stack{
//         static Queue<Integer> q1=new LinkedList<>();
//         static Queue<Integer> q2=new LinkedList<>();
//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }
//         public static void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
//             }else{
//                 q2.add(data);
//             }
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             int top=-1;
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top=q1.remove();
//                     if(q1.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             }else{
//                 while(!q2.isEmpty()){
//                     top=q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             int top=-1;
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top=q1.remove();
//                     q2.add(top);
//                 }
//             }else{
//                 while(!q2.isEmpty()){
//                     top=q2.remove();
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//     }
//     public static void main(String args[]){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// // First Non repeating number
// import java.util.*;
// public class Queuecode{
//     public static void printNonrepeating(String str){
//         int freq[]=new int[26];
//         Queue<Character> q=new LinkedList<>();
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;
//             while(!q.isEmpty() && freq[q.peek()-'a']>1){
//                 q.remove();
//             }
//             if(q.isEmpty()){
//                 System.out.print(-1+" ");
//             }else{
//                 System.out.print(q.peek()+" ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String []args){
//         String str="aabccxb";
//         printNonrepeating(str);
//     }
// }


// // Interleave 2 halves of a queue
// import java.util.*;
// public class Queuecode{
//     public static void Interleave(Queue<Integer> q){
//         Queue<Integer> firsthalf=new LinkedList<>();
//         int size=q.size();
//         for(int i=0;i<size/2;i++){
//             firsthalf.add(q.remove());
//         }
//         while(!firsthalf.isEmpty()){
//             q.add(firsthalf.remove());
//             q.add(q.remove());
//         }
//     }
//     public static void main(String[] args){
//         Queue<Integer> q=new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);
//         Interleave(q);
//         while(!q.isEmpty()){
//             System.out.print(q.remove()+" ");
//         }
//         System.out.print("");
//     }
// }


// // Queue Reversal
// import java.util.*;
// public class Queuecode{
//     public static void reverse(Queue<Integer> q){
//         Stack<Integer> s=new Stack<>();
//         int size=q.size();
//         while(!q.isEmpty()){
//             s.add(q.remove());
//         }
//         while(!s.isEmpty()){
//             q.add(s.pop());
//         }
//     }
//     public static void main(String[] args){
//         Queue<Integer> q=new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);
//         reverse(q);
//         while(!q.isEmpty()){
//             System.out.print(q.remove()+" ");
//         }
//         System.out.print("");
//     }
// }


// Deque : Double Ended queue (It is used to operate things from starting as well as ending.)
// // Implementation of Stack using Deque
// import java.util.*;
// public class Queuecode{
//     public static class Stack{
//         Deque<Integer> deque=new LinkedList<>();
//         public void push(int data){
//             deque.addLast(data);
//         }
//         public int pop(){
//             return deque.removeLast();
//         }
//         public int peek(){
//             return deque.getLast();
//         }
//     }
//     public static void main(String[] args){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println(s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//     }
// }


// Implementation of Queue using Deque
import java.util.*;
public class Queuecode{
    public static class Queue{
        Deque<Integer> deque=new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int getFirst(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args){
        Queue s=new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.getFirst());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}