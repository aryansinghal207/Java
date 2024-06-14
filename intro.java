// public class intro{
//     public static void main(String[] args){
//         int a=10;
//         int b=20;
//         int c=a+b;
//         int d=a*b;
//         System.out.println(c);
//         System.out.println(d);  
//     }
// }


// #Taking input from user
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name= sc.nextLine();
//         System.out.println(name); 
//     }
// }


// #Calculating radius of circle by taking radius input from user
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(3.14*a*a); 
//     }
// }


// #Using Switch in conditional statement
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         switch(a){
//             case 1: System.out.println("Hello");
//             break;
//             case 2: System.out.println("Namaste");
//             break;
//             case 3: System.out.println("Bonjour");
//             break;
//             default : System.out.println("Invalid Button");
//         }
//     }
// }


// Print the table of number entered by user using loop
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(a*i);
//         }
//     }
// }


// #Rectangle Pattern
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=a+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// #Hollow Rectangle Pattern
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=a+1;j++){
//                 if(i==1||j==1||i==a||j==a+1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// #Half Pyramid 
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// #inverted Half Pyramid 
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=a;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// #Inverted Half Pyramid
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=a-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }  
//     }
// }


// #half Pyramid With Numbers
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// #Inverted Half Pyramid With Numbers
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=a;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// #Floyd's Triangle
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int num=1;
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }


// # 0-1 triangle
import java.util.*;
public class intro{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}