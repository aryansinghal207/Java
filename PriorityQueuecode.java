// import java.util.*;
// public class PriorityQueuecode{
//     public static void main(String[] args){
//         PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
//         pq.offer(5);
//         pq.offer(3);
//         pq.offer(1);
//         pq.offer(6);
//         System.out.println(pq);
//         // System.out.println(pq.poll());
//         // System.out.println(pq.peek());
//         System.out.println(pq.isEmpty());
//         while(!pq.isEmpty()){
//             System.out.print(pq.poll()+",");
//         }
//     }
// }
// // To convert it into maxheap
import java.util.*;
public class PriorityQueuecode{
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
        pq.offer(5);
        pq.offer(3);
        pq.offer(1);
        pq.offer(6);
        System.out.println(pq);
        System.out.println(pq.isEmpty());
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+",");
        }
    }
}