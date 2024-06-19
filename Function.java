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
import java.util.*;
public class Function{
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        int result = sumOfOddNumbers(n);
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + result);
    }
}