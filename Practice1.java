// // import java.util.*;
// // class Practice1{
// //     static class pair implements Comparable<pair>{
// //         int val;
// //         int fre;
// //         pair(int val , int fre){
// //             this.val = val;
// //             this.fre = fre;
// //         }
// //         public int compareTo(pair a){
// //             if(a.fre == this.fre){
// //                 return this.val - a.val;
// //             }
// //             return a.fre - this.fre;
// //         }
// //     }
// //     public static void main(String[] args) {
// //         int[] arr = {1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
// //         Map<Integer,Integer> map = new HashMap<>();
// //         for(int i=0;i<arr.length;i++){
// //             if(map.containsKey(arr[i])){
// //                 int fre = map.get(arr[i]);
// //                 map.put(arr[i] , fre+1);
// //             }
// //             else{
// //                 map.put(arr[i] , 1);
// //             }
// //         }
// //         PriorityQueue<pair> pq = new PriorityQueue<>();
// //         for(int it:map.keySet()){
// //             int val = map.get(it);
// //             pq.add(new pair(it,val));
// //         }
// //         int value = pq.peek().val;
// //         System.out.print(value);
// //     }
// // }


// import java.util.*;
// public class Practice1{
//     static String[] arr = {" " , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
//     public static void solve(String str , int idx , String ans){
//         if(idx == str.length()){
//             System.out.print(ans + " ");
//             return;
//         }
//         int num = str.charAt(idx) - '0';
//         String val = arr[num];
//         for(int i=0;i<val.length();i++){
//             solve(str, idx+1, ans + val.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         solve(str, 0, "");
//     }
// }


// import java.util.*;
// public class Practice1{
//     static String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//     public static List<String> solve(String arr[],int a,int b){
//         List<String> ans=new ArrayList<>();
//         for(int i=0;i<a;i++){
//             int num=arr[i];
//             String val=arr[num];
//             for(int j=0;j<val.length();j++){
//                 ans.add(val.charAt(j)+"");
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         solve(arr,n,m);
//     }
// }

// // Second Largest in an array
// import java.util.*;
// public class Practice1{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Arrays.sort(arr);
//         System.out.print(arr[n-2]);
//     }
// }

// // First Repeating Character in a String
// import java.util.*;
// public class Practice1{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         String st=s.toLowerCase();
//         HashMap<Character,Integer> map=new HashMap<>();
//         char[] str=st.toCharArray();
//         for(int i=0;i<str.length;i++){
//             if(map.containsKey(str[i])){
//                 System.out.print(str[i]);
//                 return;
//             }
//             map.put(str[i],1);
//         }
//         System.out.println("No repeating character");
//     }
// }

// // Remove node with n as value from a linkedlist 
// import java.util.*;
// class Node{
//     Node next;
//     int data;
//     public Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// public class Practice1{
//     public static Node remove(int n,Node head){
//         Node dummy=new Node(0);
//         dummy.next=head;
//         Node curr=dummy;
//         while(curr!=null && curr.next!=null){
//             if(curr.next.data==n) curr.next=curr.next.next;
//             else curr=curr.next;
//         }
//         return dummy.next;
//     }
//     public static void print(Node head){
//         while(head!=null){
//             System.out.print(head.data+" ");
//             head=head.next;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(4);
//         head.next.next.next.next.next = new Node(4);
//         head.next.next.next.next.next.next = new Node(6);
//         head=remove(n,head);
//         print(head);
//     }
// }

// // DP fibonacci Code using memoization
// import java.util.*;
// public class Practice1{
//     private static int fibo(int n,int[] dp){
//         if(n==0) return 0;
//         if(n==1 || n==2) return 1;
//         if(dp[n]!=0) return dp[n];
//         dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
//         return dp[n];
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int dp[]=new int[n+1];
//         int ans=fibo(n,dp);
//         System.out.print(ans);
//     }
// }

// Frog 1
import java.util.*;
public class Practice1{
    public static int cost(int n,int[] arr,int[] dp){
        if(n==0 || n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=cost(n-1,arr,dp)+Math.abs(arr[n]-arr[n-1]);
        int right=0;
        if(n>1) right=cost(n-2,arr,dp)+Math.abs(arr[n]-arr[n-2]);
        dp[n]=Math.min(left,right);
        return dp[n];    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int[] dp=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.fill(dp,-1);
        System.out.print(cost(n-1,arr,dp));
    }
}