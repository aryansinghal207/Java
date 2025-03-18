import java.util.*;
public class Priorityqueuecode{
    public static void main(String[] args){
        // PriorityQueue<Integer> pq=new PriorityQueue<>();   // To print in ascending order
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