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


// // All Operations in HashMap
// import java.util.*;
// public class Hashingcode{
//     public static void main(String args[]){
//         // Create
//         HashMap<String,Integer> hm=new HashMap<>();
//         // Insert - O(1)
//         hm.put("India",100);
//         hm.put("China",90);
//         hm.put("US",60);
//         hm.put("Nepal",20);
//         System.out.println(hm);
//         // Get - O(1)
//         int pop=hm.get("India");
//         System.out.println(pop);
//         //containsKey - O(1)
//         System.out.println(hm.containsKey("India"));
//         System.out.println(hm.containsKey("Indonesia"));
//         // remove - O(1)
//         System.out.println(hm.remove("India"));
//         System.out.println(hm);
//         // size
//         System.out.println(hm.size());
//         // Is Empty
//         System.out.println(hm.isEmpty());
//         hm.clear();
//         System.out.println(hm.isEmpty());
//     }
// }


// // Iteration on HashMaps
// import java.util.*;
// public class Hashingcode{
//     public static void main(String args[]){
//         HashMap<String,Integer> hm=new HashMap<>();
//         hm.put("India",100);
//         hm.put("China",90);
//         hm.put("US",60);
//         hm.put("Nepal",20);
//         Set<String> keys=hm.keySet();
//         System.out.println(keys);
//         for(String k : keys){
//             System.out.println("Key = "+k+" , Values = "+hm.get(k));
//         }
//     }
// }


// // Implementation LinkedHashMap
// import java.util.*;
// public class Hashingcode{
//     public static void main(String args[]){
//         LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
//         lhm.put("India",100);
//         lhm.put("China",200);
//         lhm.put("Nepal",50);
//         System.out.println(lhm);
//     }
// }


// // Implementing TreeMap
// import java.util.*;
// public class Hashingcode{
//     public static void main(String args[]){
//         TreeMap<String,Integer> tm=new TreeMap<>();
//         tm.put("India",100);
//         tm.put("China",200);
//         tm.put("Nepal",50);
//         System.out.println(tm);
//     }
// }


// Majority Element in HashMap
import java.util.*;
public class Hashingcode{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,1,1,2,1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int val=hm.get(arr[i]);
                hm.put(arr[i],val+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        Set<Integer> keys=hm.keySet();
        for(Integer k : keys){
            if(hm.get(k) > arr.length/3){
                System.out.println("Majority Element is: " + k);
                return;
            }
        }
        System.out.println("No Majority Element found");
    }
}