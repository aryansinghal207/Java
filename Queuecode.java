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


// import java.util.*;
// class Node {
//     int data;
//     Node next;
//     Node(int new_data) {
//         data = new_data;
//         next = null;
//     }
// }
// class Queue {
//     private Node front;
//     private Node rear;
//     public Queue() {
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


