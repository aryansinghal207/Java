// import java.util.*;
// class Practice1{
//     static class pair implements Comparable<pair>{
//         int val;
//         int fre;
//         pair(int val , int fre){
//             this.val = val;
//             this.fre = fre;
//         }
//         public int compareTo(pair a){
//             if(a.fre == this.fre){
//                 return this.val - a.val;
//             }
//             return a.fre - this.fre;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 int fre = map.get(arr[i]);
//                 map.put(arr[i] , fre+1);
//             }
//             else{
//                 map.put(arr[i] , 1);
//             }
//         }
//         PriorityQueue<pair> pq = new PriorityQueue<>();
//         for(int it:map.keySet()){
//             int val = map.get(it);
//             pq.add(new pair(it,val));
//         }
//         int value = pq.peek().val;
//         System.out.print(value);
//     }
// }


import java.util.*;
public class Practice1{
    static String[] arr = {" " , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    public static void solve(String str , int idx , String ans){
        if(idx == str.length()){
            System.out.print(ans + " ");
            return;
        }
        int num = str.charAt(idx) - '0';
        String val = arr[num];
        for(int i=0;i<val.length();i++){
            solve(str, idx+1, ans + val.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solve(str, 0, "");
    }
}


import java.util.*;
public class Practice1{
    static String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> solve(String arr[],int a,int b){
        List<String> ans=new ArrayList<>();
        for(int i=0;i<a;i++){
            int num=arr[i];
            String val=arr[num];
            for(int j=0;j<val.length();j++){
                ans.add(val.charAt(j)+"");
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        solve(arr,n,m);
    }
}