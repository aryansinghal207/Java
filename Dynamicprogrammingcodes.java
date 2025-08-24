// // Climbing Stairs (Recursion)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int countways(int n){
//         if(n==0) return 1;
//         if(n<0) return 0;
//         return countways(n-1)+countways(n-2);
//     }
//     public static void main(String[] args){
//         int n=5;
//         System.out.println(countways(n));
//     }
// }

// // Climbing Stairs (Memoization) (0(n))
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int countways(int n,int arr[]){
//         if(n==0) return 1;
//         if(n<0) return 0;
//         if(arr[n]!=-1){
//             return arr[n];
//         }
//         arr[n] = countways(n-1,arr)+countways(n-2,arr);
//         return arr[n];
//     }
//     public static void main(String[] args){
//         int n=5;
//         int ways[]=new int[n+1];
//         Arrays.fill(ways,-1);
//         System.out.println(countways(n,ways));
//     }
// }

// Climbing Stairs (Variation)
import java.util.*;
public class Dynamicprogrammingcodes{
    public static int countways(int n,int arr[]){
        if(n==0) return 1;
        if(n<0) return 0;
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n] = countways(n-1,arr)+countways(n-2,arr)+countways(n-3,arr);
        return arr[n];
    }
    public static void main(String[] args){
        int n=5;
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countways(n,ways));
    }
}