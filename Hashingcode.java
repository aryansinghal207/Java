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


// // Majority Element in HashMap
// import java.util.*;
// public class Hashingcode{
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5,1,1,2,1};
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             hm.put(arr[i],hm.getOrDefault(arr[i], 0) + 1);
//         }
//         for(Integer k : hm.keySet()){
//             if(hm.get(k) > arr.length/3){
//                 System.out.println("Majority Element is: " + k);
//                 return;
//             }
//         }
//         System.out.println("No Majority Element found");
//     }
// }


// // Valid Anagram using HashMap
// import java.util.*;
// public class Hashingcode{
//     public static boolean isAnagram(String s,String t){
//         if(s.length() != t.length()){
//             return false;
//         }
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//         }
//         for(int i=0;i<t.length();i++){
//             if(map.containsKey(t.charAt(i))){
//                 if(map.get(t.charAt(i))==1){
//                     map.remove(t.charAt(i));
//                 }else{
//                     map.put(t.charAt(i),map.get(t.charAt(i))-1);
//                 }
//             }
//         }
//         return map.isEmpty();
//     }
//     public static void main(String[] args){
//         String s="race";
//         String t="care";
//         System.out.println(isAnagram(s,t));
//     }
// }


// // HashSet : no duplicate values, unordered, unique elements, Null is allowed
// import java.util.*;
// public class Hashingcode{
//     public static void main(String[] args){
//         HashSet<Integer> set=new HashSet<>();
//         set.add(1);
//         set.add(2);
//         set.add(4);
//         set.add(1);
//         set.add(2);
//         System.out.println(set);
//         if(set.contains(2)){
//             System.out.println("set contains 2");
//         }
//         if(set.contains(3)){
//             System.out.println("set contains 3");
//         }
//     }
// }


// // LinkedHashSet
// import java.util.*;
// public class Hashingcode{
//     public static void main(String[] args){
//         LinkedHashSet<String> set=new LinkedHashSet<>();
//         set.add("Delhi");
//         set.add("Pune");
//         set.add("Mumbai");
//         set.add("Odisha");
//         set.add("Banglore");
//         System.out.println(set);
//     }
// }


// // TreeSet
// import java.util.*;
// public class Hashingcode{
//     public static void main(String[] args){
//         TreeSet<String> set=new TreeSet<>();
//         set.add("Delhi");
//         set.add("Pune");
//         set.add("Mumbai");
//         set.add("Odisha");
//         set.add("Banglore");
//         System.out.println(set);
//     }
// }


// // Count Distinct Element
// import java.util.*;
// public class Hashingcode{
//     public static void main(String[] args){
//         int num[]={4,3,4,6,6,2,4,6,1,2,5,7,8};
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<num.length;i++){
//             set.add(num[i]);
//         }
//         System.out.println("ans = "+set.size());
//     }
// }


