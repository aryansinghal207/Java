// // Hashset
// import java.util.*;
// public class setcode{
//     public static void main(String[] args){
//         Set<Integer> set=new HashSet<>();
//         set.add(40);
//         set.add(20);
//         set.add(10);
//         set.add(30);
//         System.out.println(set);
//         System.out.println(set.contains(20));
//     }
// }


// // LinkedHashSet :- The differenec between Hashset nd Linkedhasset is that hashset keeps the element randomly but linkedhashset keeps the element in same order as added. 
// import java.util.*;
// public class setcode{
//     public static void main(String[] args){
//         Set<Integer> set=new LinkedHashSet<>();
//         set.add(40);
//         set.add(20);
//         set.add(10);
//         set.add(30);
//         System.out.println(set);
//         System.out.println(set.contains(20));
//     }
// }


// // Treeset :- The difference between Hashset nd Treeset is that hashset keeps the element randomly but treeset keeps the element in sorted order. 
import java.util.*;
public class setcode{
    public static void main(String[] args){
        Set<Integer> set=new TreeSet<>();
        set.add(40);
        set.add(20);
        set.add(10);
        set.add(30);
        System.out.println(set);
        System.out.println(set.contains(20));
    }
}