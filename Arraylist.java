// // Wrapper class : A class whose object contains or wrap a primitive datatype.
// // Object of a wrapper class contain a field which stores primitive datatype.
// import java.util.*;
// public class Arraylist{
//     public static void main(String[] args){
//         // Integer in=Integer.valueOf(4);
//         // System.out.println(in);
//         // Float f=Float.valueOf(3.3f);
//         // System.out.println(f);
//         ArrayList<Integer> l1=new ArrayList<>();
//         // Arraylist<Boolean> l2=new Arraylist<>();
//         l1.add(5);
//         l1.add(6);
//         l1.add(7);
//         l1.add(8);
//         // System.out.println(l1.get(1));
//         // for(int i=0;i<l1.size();i++){
//         //     System.out.print(l1.get(i)+" ");
//         // }
//         // System.out.println();
//         System.out.println(l1);
//         l1.add(1,100);
//         System.out.println(l1);
//         l1.remove(1);   // To remove any index value from arraylist
//         System.out.println(l1);
//         System.out.println(l1.remove(Integer.valueOf(6)));   // To remove any value from arraylist and print use kara ha check karne ka liye ki element exist bhi karta ha ki nhu
//         System.out.println(l1);
//         System.out.println(l1.remove(Integer.valueOf(6))); 
//         Boolean ans=l1.contains(Integer.valueOf(7));
//         System.out.println(ans);
//     }
// }

// // WAP to reverse a Arraylist
// import java.util.ArrayList;
// import java.util.Collections;
// public class Arraylist{
//     // static void reverselist(ArrayList<Integer> list){
//     //     int i=0,j=list.size()-1;
//     //     while(i<j){
//     //         Integer temp=Integer.valueOf(list.get(i));
//     //         list.set(i,list.get(j));
//     //         list.set(j,temp);
//     //         i++;
//     //         j--;
//     //     }
//     // }
//     public static void main(String[] args){
//         ArrayList<Integer> l1=new ArrayList<>();
//         l1.add(5);
//         l1.add(6);
//         l1.add(7);
//         l1.add(8);
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         l1.add(4);
//         System.out.println("Original List : "+l1);
//         // reverselist(l1);
//         // We could use predefines library of collection in which we have predefined reverse function
//         Collections.reverse(l1);
//         System.out.println("Reversed List : "+l1);
//         Collections.sort(l1);
//         System.out.println("Reversed List : "+l1);
//         Collections.sort(l1,Collections.reverseOrder());
//         System.out.println("Reversed List : "+l1);
//     }
// }


// WAP to reverse a Arraylist
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist{
    public static void main(String[] args){
        ArrayList<String> l1=new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("Original Order : "+l1);
        Collections.sort(l1);
        System.out.println("Reversed Order : "+l1);
    }
}