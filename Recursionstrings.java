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


// WAP to print the substring of a String
import java.util.*;
public class Recursionstrings {
    public static ArrayList<String> getsubstring(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String> smallAns=getsubstring(s.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans=getsubstring("abc");
        for(String ss: ans){
            System.out.println(ss);
        }
    }
}