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

// // 0-1 Knapsack (Memoization)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int knapsack(int[] val,int[] wt,int w,int n,int dp[][]){
//         if(w==0 || n==0) return 0;
//         if(dp[n][w]!=-1){
//             return dp[n][w];
//         }
//         if(wt[n-1]<=w){
//             int ans1=val[n-1]+knapsack(val,wt,w-wt[n-1],n-1,dp);
//             int ans2=knapsack(val,wt,w,n-1,dp);
//             dp[n][w]=Math.max(ans1,ans2);
//             return dp[n][w];
//         }else{
//             dp[n][w]=knapsack(val,wt,w,n-1,dp);
//             return dp[n][w];
//         }
//     }
//     public static void main(String[] args){
//         int val[]={15,14,10,45,30};
//         int wt[]={2,5,1,3,4};
//         int w=7;
//         int dp[][]=new int[val.length+1][w+1];
//         for(int i=0;i<dp.length;i++){
//             for(int j=0;j<dp[0].length;j++){
//                 dp[i][j]=-1;
//             }
//         }
//         System.out.println(knapsack(val,wt,w,val.length,dp));
//     }
// }

// // 0-1 Knapsack (Tabulation)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int knapsack(int[] val,int[] wt,int w){
//         int n=val.length;
//         int dp[][]=new int[n+1][w+1];
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=w;j++){
//                 if(wt[i-1]<=j){
//                     int ans1=val[i-1]+dp[i-1][j-wt[i-1]];
//                     int ans2=dp[i-1][j];
//                     dp[i][j]=Math.max(ans1,ans2);
//                 }else{
//                     dp[i][j]=dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][w];
//     }
//     public static void main(String[] args){
//         int val[]={15,14,10,45,30};
//         int wt[]={2,5,1,3,4};
//         int w=7;
//         System.out.println(knapsack(val,wt,w));
//     }
// }

// // Target Sum Subset (Tabulation)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static boolean subsetSum(int arr[],int sum){
//         int n=arr.length;
//         boolean dp[][]=new boolean[n+1][sum+1];
//         for(int i=0;i<=n;i++){
//             dp[i][0]=true;
//         }
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=sum;j++){
//                 int v=arr[i-1];
//                 if(v<=j){
//                     dp[i][j]=dp[i-1][j-v] || dp[i-1][j];
//                 }else{
//                     dp[i][j]=dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
//     public static void main(String[] args){
//         int arr[]={2,3,5,6,8,10};
//         int sum=10;
//         System.out.println(subsetSum(arr,sum));
//     }
// }

// // Unbounded Knapsack (Tabulation)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int knapsack(int[] val,int[] wt,int w){
//         int n=val.length;
//         int dp[][]=new int[n+1][w+1];
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=w;j++){
//                 if(wt[i-1]<=j){
//                     int ans1=val[i-1]+dp[i][j-wt[i-1]];
//                     int ans2=dp[i-1][j];
//                     dp[i][j]=Math.max(ans1,ans2);
//                 }else{
//                     dp[i][j]=dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][w];
//     }
//     public static void main(String[] args){
//         int val[]={15,14,10,45,30};
//         int wt[]={2,5,1,3,4};
//         int w=7;
//         System.out.println(knapsack(val,wt,w));
//     }
// }

// // Coin Change (Tabulation)
// import java.util.*;
// public class Dynamicprogrammingcodes {
//     public static int coinchange(int coins[], int sum) {
//         int n = coins.length;
//         int dp[][] = new int[n + 1][sum + 1];
//         for (int i = 0; i <= n; i++) {
//             dp[i][0] = 1;
//         }
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= sum; j++) {
//                 if (coins[i - 1] <= j) {
//                     dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
//                 } else {
//                     dp[i][j] = dp[i - 1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
//     public static void main(String[] args) {
//         int coins[] = {1, 2, 3};
//         int sum = 4;
//         System.out.println(coinchange(coins, sum));
//     }
// }

// // Frog Jump(Memoization)
// import java.util.*;
// public class Dynamicprogrammingcodes{
//     public static int frogjump(int n,int[] arr,int[] dp){
//         if(n==0) return 0;
//         if(dp[n]!=-1) return dp[n];
//         int left=frogjump(n-1,arr,dp)+Math.abs(arr[n]-arr[n-1]);
//         int rigth=Integer.MAX_VALUE;
//         if(n>1){
//             rigth=frogjump(n-2,arr,dp)+Math.abs(arr[n]-arr[n-2]);
//         }
//         return dp[n]=Math.min(left,rigth);
//     }
//     public static void main(String[] args){
//         int n=5;
//         int[] arr={1,5,4,2,1};
//         int[] dp=new int[n];
//         Arrays.fill(dp,-1);
//         System.out.println(frogjump(n-1,arr,dp));
//     }
// }

// Frog Jump (Tabulation)
import java.util.*;
public class Dynamicprogrammingcodes{
    public static int frogjump(int n,int[] arr){
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int left=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int rigth=Integer.MAX_VALUE;
            if(i>1){
                rigth=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            }
            dp[i]=Math.min(left,rigth);
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        int n=5;
        int[] arr={1,5,4,2,1};
        System.out.println(frogjump(n,arr));
    }
}