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

// // Climbing Stairs (Variation)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int countways(int n,int arr[]){
//         if(n==0) return 1;
//         if(n<0) return 0;
//         if(arr[n]!=-1){
//             return arr[n];
//         }
//         arr[n] = countways(n-1,arr)+countways(n-2,arr)+countways(n-3,arr);
//         return arr[n];
//     }
//     public static void main(String[] args){
//         int n=5;
//         int ways[]=new int[n+1];
//         Arrays.fill(ways,-1);
//         System.out.println(countways(n,ways));
//     }
// }

// // Climbing Stairs (Tabulation)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int countways(int n){
//         int dp[]=new int[n+1];
//         dp[0]=1;
//         for(int i=1;i<=n;i++){
//             if(i==1){
//                 dp[i]=dp[i-1];
//             }else{
//                 dp[i]=dp[i-1]+dp[i-2];  
//             }
//         }
//         return dp[n];
//     }
//     public static void main(String[] args){
//         int n=5;
//         System.out.println(countways(n));
//     }
// }


// // 0-1 Knapsack (Recursion)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int knapsack(int[] val,int[] wt,int w,int n){
//         if(w==0 || n==0) return 0;
//         if(wt[n-1]<=w){
//             int ans1=val[n-1]+knapsack(val,wt,w-wt[n-1],n-1);
//             int ans2=knapsack(val,wt,w,n-1);
//             return Math.max(ans1,ans2);
//         }else{
//             return knapsack(val,wt,w,n-1);
//         }
//     }
//     public static void main(String[] args){
//         int val[]={15,14,10,45,30};
//         int wt[]={2,5,1,3,4};
//         int w=7;
//         System.out.println(knapsack(val,wt,w,val.length));
//     }
// }


// 0-1 Knapsack (Memoization)
