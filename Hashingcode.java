// import java.util.*;
// public class Hashingcode{
//     public static void main(String args[]){
//         HashMap<String,Integer> hm=new HashMap<>();
//         hm.put("India",100);
//         hm.put("India",101);
//         hm.put("India",102);
//         hm.put("India",103);   // HashMap does allow duplicate value and pick the last declared value of one
//         System.out.println(hm);
//     }
// }


// // HashMap and HashSet are unordered
// import java.util.*;
// public class Hashingcode{
//     public static void main(String args[]){
//         HashMap<String,Integer> hm=new HashMap<>();
//         hm.put("India",100);
//         hm.put("China",90);
//         hm.put("US",60);
//         hm.put("Nepal",20);
//         System.out.println(hm);
//     }
// }


// All Operations in HashMap
import java.util.*;
public class Hashingcode{
    public static void main(String args[]){
        // Create
        HashMap<String,Integer> hm=new HashMap<>();
        // Insert - O(1)
        hm.put("India",100);
        hm.put("China",90);
        hm.put("US",60);
        hm.put("Nepal",20);
        System.out.println(hm);
        // Get - O(1)
        int pop=hm.get("India");
        System.out.println(pop);
        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        // remove - O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);
        // size
        System.out.println(hm.size());
        // Is Empty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}