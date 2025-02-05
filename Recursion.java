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


// // Euclid's Algorithum
// import java.util.*;
// public class Recursion{
//     public static int gcd(int x,int y){
//         if(y==0){
//             return x; 
//         }
//         return gcd(y,x%y);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         int ans=gcd(x,y);
//         System.out.print(ans);
//     }
// }


// // WAP to print all the value array recursively.
// import java.util.*;
// public class Recursion{
//     public static void printArray(int[] x,int y){
//         if(y==x.length){
//             return;
//         }
//         System.out.print(x[y]+" ");
//         printArray(x,y+1);
//     }
//     public static void main(String[] args){
//         int [] arr={1,2,3,4,5};
//         printArray(arr,0);
//     }
// }


// // WAP to print the maximum element from array using recursion
// import java.util.*;
// public class Recursion {
//     public static int findMax(int[] x, int y) {
//         if (y == x.length - 1) {
//             return x[y];
//         }
//         int maxInRest = findMax(x, y + 1);
//         return Math.max(x[y], maxInRest);
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int maxElement = findMax(arr, 0);
//         System.out.println("The maximum element is: " + maxElement);
//     }
// }


// // WAP to find sum of all element of an array
// import java.util.*;
// public class Recursion {
//     public static int sum(int[] x, int y) {
//         if (y == x.length) {
//             return 0;
//         }
//         return x[y] + sum(x, y + 1);
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int result=sum(arr, 0);
//         System.out.print(result);
//     }
// }


// import java.util.*;
// class OOPS {
//     public static void steps(int a, int b) {
//       if (a == b) {
//         System.out.println("Reached Mess");
//       } else {
//         System.out.println(a);
//         steps(a + 1, b); 
//         return; 
//       }
//     }
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       steps(a, b);
//     }
//   }


// import java.util.*;
// class Recursion{
//     public static int sum(int a) {
//       if (a==1) {
//         return 1;
//       } 
//     return a+sum(a-1); 
//     }
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int ans=sum(a);
//       System.out.println(ans);
//     }
// }


// // WAP to Print the last occurence of any number 
// import java.util.*;
// public class Recursion{
//     public static int lastOccurrence(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1;
//         }
//         int isFound = lastOccurrence(arr, key, i + 1);
//         if (isFound == -1 && arr[i] == key) {
//             return i;
//         }
//         return isFound;
//     }
//     public static void main(String[] args) {
//         int arr[] = {8, 1, 2, 5, 3, 8};
//         System.out.println(lastOccurrence(arr, 8, 0));
//     }
// }


// // WAP to print the nth power if any number
// import java.util.*;
// public class Recursion{
//     public static int optimzedpower(int a,int n){
//         if (n==0){
//             return 1;
//         }
//         int halfpowersq=optimzedpower(a,n/2)*optimzedpower(a,n/2);
//         if(n%2!=0){
//             halfpowersq=a*halfpowersq;
//         }
//         return halfpowersq;
//     }
//     public static void main(String[] args){
//         System.out.println(optimzedpower(2,10));
//     }
// }


// WAP to Tiling Problem Code
import java.util.*;
public class Recursion{
    public static int tiling(int n){
        if (n==0 || n==1){
            return 1;
        }
        int fnm1=tiling(n-1);
        int fnm2=tiling(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args){
        System.out.println(tiling(5));
    }
}