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
// import java.util.*;
// public class PriorityQueuecode{
//     public static void main(String[] args){
//         PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
//         pq.offer(5);
//         pq.offer(3);
//         pq.offer(1);
//         pq.offer(6);
//         System.out.println(pq);
//         System.out.println(pq.isEmpty());
//         while(!pq.isEmpty()){
//             System.out.print(pq.poll()+",");
//         }
//     }
// }

// // PQ for Object
// import java.util.*;
// public class PriorityQueuecode{
//     static class Student implements Comparable<Student>{
//         String name;
//         int rank;
//         public Student(String name,int rank){
//             this.name=name;
//             this.rank=rank;
//         }
//         @Override
//         public int compareTo(Student s2){
//             return this.rank-s2.rank;
//         }
//     }
//     public static void main(String args[]){
//         PriorityQueue<Student> pq=new PriorityQueue<>();
//         pq.add(new Student("A",4));
//         pq.add(new Student("B",5));
//         pq.add(new Student("C",2));
//         pq.add(new Student("D",12));
//         while(!pq.isEmpty()){
//             System.out.println(pq.peek().name+"-> "+pq.peek().rank);
//             pq.remove();
//         }
//     }
// }

// PQ for Object
import java.util.*;
public class PriorityQueuecode{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"-> "+pq.peek().rank);
            pq.remove();
        }
    }
}