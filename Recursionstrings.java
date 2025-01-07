// // WAP to print the array withour a and A.
// import java.util.*;
// public class Recursionstrings{
//     static String remove(String s,int idx){
//         if(idx==s.length()) return "";
//         String smallAns=remove(s,idx+1);
//         char c=s.charAt(idx);
//         if(c!='a'&&c!='A'){
//             return c+smallAns;
//         }
//         else{
//             return smallAns;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         System.out.print(remove(s,0));
//     }
// }
// // Alternate Way
// import java.util.*;
// public class Recursionstrings{
//     static String remove2(String s){
//         if(s.length()==0) return "";
//         String smallAns=remove2(s.substring(1));
//         char c=s.charAt(0);
//         if(c!='a'&&c!='A'){
//             return c+smallAns;
//         }
//         else{
//             return smallAns;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         System.out.print(remove2(s));
//     }
// }


// // WAP to reverse a string using recursion
// import java.util.*;
// public class Recursionstrings{
//     static String reverse(String s,int idx){
//         if(idx==s.length()) return "";
//         String smallAns=reverse(s,idx+1);
//         return smallAns+s.charAt(idx);     
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         System.out.print(reverse(s,0));
//     }
// }


// // WAP to check wether a string is palindrome or not using recursion
// import java.util.*;
// public class Recursionstrings{
//     static String reverse(String s,int idx){
//         if(idx==s.length()) return "";
//         String smallAns=reverse(s,idx+1);
//         return smallAns+s.charAt(idx);     
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         String rev=reverse(s,0);
//         if(rev.equals(s)){
//             System.out.print("Yes this is palindrome");
//         } 
//         else{
//             System.out.print("No this is not a palindrome");
//         }      
//     }
// }
// // or
// import java.util.*;
// public class Recursionstrings {
//     public static boolean isPalindrome(char[] str, int start, int end) {
//         if (start >= end) {
//             return true;
//         }
//         if (str[start] != str[end]) {
//             return false;
//         }
//         return isPalindrome(str, start + 1, end - 1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String input=sc.nextLine();
//         char[] str = input.toCharArray();
//         boolean result = isPalindrome(str, 0, str.length - 1);
//         if (result) {
//             System.out.println("The string \"" + input + "\" is a palindrome.");
//         } else {
//             System.out.println("The string \"" + input + "\" is not a palindrome.");
//         }
//     }
// }


// // WAP to print the substring of a String
// import java.util.*;
// public class Recursionstrings {
//     public static ArrayList<String> getsubstring(String s){
//         ArrayList<String> ans=new ArrayList<>();
//         if(s.length()==0){
//             ans.add("");
//             return ans;
//         }
//         char curr=s.charAt(0);
//         ArrayList<String> smallAns=getsubstring(s.substring(1));
//         for(String ss:smallAns){
//             ans.add(ss);
//             ans.add(curr + ss);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         ArrayList<String> ans=getsubstring("abc");
//         for(String ss: ans){
//             System.out.println(ss);
//         }
//     }
// }


// // WAP to print all subsequence in java using recursion
// import java.util.Scanner;
// public class Recursionstrings{
//     private static void printSubsequences(String str, String current, int index) {
//         if (index == str.length()) {
//             System.out.println(current);
//             return;
//         }
//         printSubsequences(str, current + str.charAt(index), index + 1);
//         printSubsequences(str, current, index + 1);
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = scanner.nextLine();
//         System.out.println("All subsequences are:");
//         printSubsequences(str, "", 0);
//     }
// }

// // WAP to print sum of all subsequence in java using recursion
// import java.util.Scanner;
// public class Recursionstrings{
//     private static void findSubsequenceSum(int[] array, int index, int currentSum, int[] totalSum) {
//         if (index == array.length) {
//             totalSum[0] += currentSum;
//             return;
//         }
//         findSubsequenceSum(array, index + 1, currentSum + array[index], totalSum);
//         findSubsequenceSum(array, index + 1, currentSum, totalSum);
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = scanner.nextInt();
//         int[] array = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             array[i] = scanner.nextInt();
//         }
//         int[] totalSum = {0};
//         findSubsequenceSum(array, 0, 0, totalSum);
//         System.out.println("Sum of all subsequences: " + totalSum[0]);
//     }
// }


// // Frog Jump
// import java.util.Scanner;
// public class Recursionstrings{
//     static int best(int[] h,int n, int idx) {
//         if(idx==n-1) return 0;
//         int op1=best(h,n,idx+1)+Math.abs(h[idx+1]-h[idx]);
//         if(idx==n-2)return op1;
//         int op2=best(h,n,idx+2)+Math.abs(h[idx+2]-h[idx]);
//         return Math.min(op1,op2);
//     }
//     public static void main(String[] args) {
//         int[] h={10,30,40,20};
//         System.out.println(best(h,h.length,0));
//     }
// }