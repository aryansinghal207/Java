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

