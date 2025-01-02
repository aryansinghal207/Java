// A Function calling itself
// // WAP to print from 1 to n.
// import java.util.*;
// public class Recursion{
//     static void print(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         print(n-1);
//         System.out.println(n);
    
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         print(n);
//     }
// }


// // WAP to print from n to 1.
// import java.util.*;
// public class Recursion{
//     static void print(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n);
//         print(n-1);    
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         print(n);
//     }
// }


// WAP to print factorail of any number.
import java.util.*;
public class Recursion{
    static int fact(int n){
        if(n<0){
            return 0;
        }
        else if(n==0 || n==1){
            return 1;
        }
        int result=n*fact(n-1);
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int answer=fact(n);
        System.out.println(answer);
    }
}