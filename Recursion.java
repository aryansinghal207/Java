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


// // WAP to print factorail of any number.
// import java.util.*;
// public class Recursion{
//     static int fact(int n){
//         if(n<0){
//             return -1;
//         }
//         else if(n==0){
//             return 1;
//         }
//         int result=n*fact(n-1);
//         return result;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int answer=fact(n);
//         System.out.println(answer);
//     }
// }


// // WAP to print fibonacci number at a position.
// import java.util.*;
// public class Recursion{
//     static int sumofdigits(int n){
//         if(n>=0 && n<=9){
//             return n;
//         }
//         return sumofdigits(n/10)+n%10;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int answer=sumofdigits(n);
//         System.out.println(answer);
//     }
// }


// // WAP to find the value of p^q using recursion.
// import java.util.*;
// public class Recursion{
//     static int result(int p,int q){
//         if(q==0){
//             return 1;
//         }
//         return result(p,q-1)*p;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int answer=result(n,m);
//         System.out.println(answer);
//     }
// }
// //or
// import java.util.*;
// public class Recursion{
//     static int result(int p,int q){
//         if(q==0){
//             return 1;
//         }
//         if(q%2==0){
//             int small=result(p,q/2);
//             return small*small;
//         }
//         else{
//             int small=result(p,q/2);
//             return p*small*small;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int answer=result(n,m);
//         System.out.println(answer);
//     }
// }


// // Print the k times multiple value of n number
// import java.util.*;
// public class Recursion{
//     static void result(int p,int q){
//         if(q==0){
//             return;
//         }
//         result(p,q-1);
//         System.out.print(p*q+" ");        
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         result(n,m);
//     }
// }


// // WAP to print the sum of numbers with alternate sign
// import java.util.*;
// public class Recursion{
//     static int result(int n){
//         if(n==0){
//             return n;
//         }
//         if(n%2==0){
//             return result(n-1)-n; 
//         }
//         else{
//             return result(n-1)+n;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int ans=result(n);
//         System.out.print(ans);
//     }
// }


//Find GCD 
// Better then Brute Force Approach
// import java.util.*;
// public class Recursion{
//     public static int gcd(int x,int y){
//         while(x%y!=0){
//             int rem=x%y;
//             x=y;
//             y=rem;
//         }
//         return y;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         int ans=gcd(x,y);
//         System.out.print(ans);
//     }
// }

// Euclid's Algorithum
import java.util.*;
public class Recursion{
    public static int gcd(int x,int y){
        if(y==0){
            return x; 
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=gcd(x,y);
        System.out.print(ans);
    }
}