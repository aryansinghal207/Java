// // In this the value overrides
// import java.util.*;
// public class Mapcode{
//     public static void main(String[] args){
//         Map<String,Integer> numbers=new HashMap<>();
//         numbers.put("One",1);
//         numbers.put("Two",2);
//         numbers.put("Three",3);
//         numbers.put("Four",4);

//         // // To remove that override issue we have two ways
//         // if(!numbers.containsKey("Two")){
//         //     numbers.put("Two",22); 
//         // }
//         // //or
//         numbers.putIfAbsent("Two",22);
//         System.out.println(numbers);

//         for(Map.Entry<String,Integer> e: numbers.entrySet()){
//             // System.out.println(e);
//             System.out.print(e.getKey()+" ");
//             System.out.println(e.getValue());
//         }
//     }
// }


// In this the value overrides
import java.util.*;
public class Mapcode{
    public static void main(String[] args){
        Map<String,Integer> numbers=new TreeMap<>();    // It arrange according to alphabetical order
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.putIfAbsent("Two",22);
        System.out.println(numbers);
        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            // System.out.println(e);
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
    }
}