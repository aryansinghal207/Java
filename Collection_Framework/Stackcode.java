// import java.util.*;
// public class Stackcode{
    
//     public static void main(String[] args){
//         Stack<String> animals=new Stack<>();
//         animals.push("Lion");
//         animals.push("Dog");
//         animals.push("Horse");
//         animals.push("cat");
//         System.out.println("Stack"+animals);
//         System.out.println(animals.peek());
//         System.out.println("Stack"+animals);
//         animals.pop();
//         System.out.println("Stack"+animals);
//     }
// }


import java.util.*;
public class Stackcode{
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();   // To print in ascending order
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());    // To print in descending order
        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}