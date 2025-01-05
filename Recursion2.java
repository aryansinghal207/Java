// // WAP to print weather x exist in an array or not using true or false.
// import java.util.Scanner;
// public class Recursion2 {
//     static boolean findnum(int[] arr, int target, int size, int index) {
//         if (index >= size) {
//             return false;
//         }
//         if (arr[index] == target) {
//             return true;
//         }
//         return findnum(arr, target, size, index + 1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         if (findnum(arr, target, size, 0)) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }
// }


// // WAP to print weather a element exist in an array or not if it exist the return index of that otherwise return -1.
// import java.util.Scanner;
// public class Recursion2 {
//     static int findnum(int[] arr, int target, int size, int index) {
//         if (index >= size) {
//             return -1;
//         }
//         if (arr[index] == target) {
//             return index;
//         }
//         return findnum(arr, target, size, index + 1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         int result=findnum(arr, target, size, 0);
//         System.out.print(result);
//     }
// }


// // WAP to print weather x exist in an array if yes the return all index of that otherwise return -1.
// import java.util.Scanner;
// public class Recursion2 {
//     static void printallindexes(int[] arr, int target, int size, int index) {
//         if (index >= size) {
//             return ;
//         }
//         if (arr[index] == target) {
//             System.out.print(index+" ");
//         }
//         printallindexes(arr, target, size, index + 1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         printallindexes(arr, target, size, 0);
//     }
// }


// // WAP to print weather x exist in an array if yes the return all index of that otherwise return -1 in Array Form.
// import java.util.*;
// public class Recursion2 {
//     static ArrayList<Integer> printallindexes(int[] arr, int target, int size, int index) {
//         ArrayList<Integer> ans=new ArrayList<Integer>();
//         if (index >= size) {
//             return ans;
//         }
//         if (arr[index] == target) {
//             ans.add(index);
//         }
//         ArrayList<Integer> SmallAns=printallindexes(arr, target, size, index + 1);
//         ans.addAll(SmallAns);
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         ArrayList<Integer> ans=printallindexes(arr, target, size, 0);
//         if (ans.isEmpty()) {
//             System.out.println("[-1]");
//         } else {
//             System.out.println(ans);
//         }
//     }
// }


// WAP to check weather a given array is sorted or not
import java.util.Scanner;
public class Recursion2 {
    static boolean issorted(int[] arr,int size, int index) {
        if (index == size-1) {
            return true;
        }
        if (arr[index] > arr[index+1]) {
            return false;
        }
        return issorted(arr, size, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if (issorted(arr, size, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}