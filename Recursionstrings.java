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


// WAP to check wether a string is palindrome or not using recursion
import java.util.*;
public class Recursionstrings{
    static String reverse(String s,int idx){
        if(idx==s.length()) return "";
        String smallAns=reverse(s,idx+1);
        return smallAns+s.charAt(idx);     
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev=reverse(s,0);
        if(rev.equals(s)){
            System.out.print("Yes this is palindrome");
        } 
        else{
            System.out.print("No this is not a palindrome");
        }      
    }
}