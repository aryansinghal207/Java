// import java.util.Scanner;
// public class Bitwise{
//     public static void main(String[] args){
//     int p = 9, q = 10;
//     System.out.println(p | q); // 11
//     System.out.println(p & q); // 8
//     System.out.println(p ^ q); //3
//     System.out.println(p << 1); //18
//     System.out.println(p << 2); //36
//     System.out.println(q >> 1); // 5
//     System.out.println(q >> 2); // 2
//     }
// }

// // Calculate even and odd using bitwise operator
// import java.util.Scanner;
// public class Bitwise{
//     public static void main(String[] args){
//     int p = 9;
//     if((p&1)==0){
//         System.out.println("Even");
//     }
//     else{
//         System.out.println("Odd");
//     }
//     }
// }

// // WAP to swap 2 number without using 3rd variable and using bitwise operator
// public class Bitwise{
//     public static void main(String[] args){
//         int a=10;
//         int b=9;
//         a=a^b;
//         b=a^b;
//         a=a^b;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// // Toggle a specific bit of a operator using bitwise
// import java.util.Scanner;
// public class Bitwise{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int k=sc.nextInt();
//         a = a ^ (1 << k);
//         System.out.println(a);
//     }
// }

// // Calcule set of bit in a number using bitwise operator
// import java.util.Scanner;
// public class Bitwise{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int count=0;
//         while(n>0){
//             count+=n&1;
//             n>>=1;
//         }
//         System.out.println(count);
//     }
// }

// Check if the entered is power of 2 or not using bitwise operator
import java.util.Scanner;
public class Bitwise{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is NOT a power of 2.");
        }
        System.out.println();
    }
}