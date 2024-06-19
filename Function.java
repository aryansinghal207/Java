// import java.util.*;

// public class Function{
//     public static void printMyName(String name){
//         System.out.print(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.next();

//         printMyName(name);
//     }
// }


// #Add 2 number using functions
// import java.util.*;
// public class Function{
//     public static void factorail(int a){
//         if(a<0){
//             System.out.println("Invalid Number");
//             return;
//         }
//         int fact=1;
//         for(int i=a;i>=1;i--){
//             fact=fact*i;
//         }
//         System.out.print(fact);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         factorail(a);
//     }
// }


// #To print the sum of odd number from 1 to n
// import java.util.*;
// public class Function{
//     public static int sumOfOddNumbers(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 sum += i;
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a positive integer n: ");
//         int n = scanner.nextInt();
//         int result = sumOfOddNumbers(n);
//         System.out.println("The sum of odd numbers from 1 to " + n + " is: " + result);
//     }
// }


// #Write a function which takes in 2 numbers and returns the greater of those two.
// import java.util.*;
// public class Function{
//     public static int findGreater(int a, int b) {
//         if (a > b) {
//             return a;
//         } else {
//             return b;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();
//         int greater = findGreater(num1, num2);
//         System.out.println("The greater number between " + num1 + " and " + num2 + " is: " + greater);
//     }
// }


// #Write a function that takes in the radius as input and returns the circumference of a circle.
// import java.util.*;
// public class Function{
//     public static double circumference(double n) {
//         return 2*3.14*n;
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the radius of circle : ");
//         double n = scanner.nextDouble();
//         double c = circumference(n);
//         System.out.println("The circumference of a circle with radius " + n + " is: " + c);
//     }
// }


// #Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;
public class Function {
    public static boolean Vote(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        boolean eligible = Vote(age);
        if (eligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
