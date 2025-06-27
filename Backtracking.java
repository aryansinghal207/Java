// import java.util.*;
// public class Backtracking{
//     public static void changearr(int[] arr,int i,int val){
//         if(i==arr.length){
//             printArr(arr);
//             return;
//         }
//         arr[i]=val;
//         changearr(arr,i+1,val+1);
//         arr[i]=arr[i]-2;
//     }
//     public static void printArr(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]=new int[10];
//         changearr(arr,0,1);
//         printArr(arr); 
//     }
// }


// // WAP to find subset of a string
// import java.util.*;
// public class Backtracking{
//     public static void findsubs(String str,String ans,int i){
//         if(i==str.length()){
//             if(ans.length()==0){
//                 System.out.println("null");
//             }else{
//                 System.out.println(ans);
//             }
//             return;
//         }
//         findsubs(str,ans+str.charAt(i),i+1);
//         findsubs(str,ans,i+1);
//     }
//     public static void main(String[] args){
//         String str="abc";
//         findsubs(str,"",0);
//     }
// }


// // WAP to print the permutation of a string
// import java.util.*;
// public class Backtracking{
//     public static void permutation(String str,String ans){
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char curr=str.charAt(i);
//             String newstr=str.substring(0,i)+str.substring(i+1);
//             permutation(newstr,ans+curr);
//         }
//     }
//     public static void main(String[] args){
//         String str="abc";
//         permutation(str,"");
//     }
// }



// WAP to find subset of a string
import java.util.*;
public class Backtracking {
    public static void generateSubsets(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        generateSubsets(str, index + 1, current + str.charAt(index));
        generateSubsets(str, index + 1, current);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Subsets of the string are:");
        generateSubsets(input, 0, "");
    }
}
