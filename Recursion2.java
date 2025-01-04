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


// WAP to print weather x exist in an array if yes the return index of that otherwise return -1.
import java.util.Scanner;
public class Recursion2 {
    static int findnum(int[] arr, int target, int size, int index) {
        if (index >= size) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findnum(arr, target, size, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result=findnum(arr, target, size, 0);
        System.out.print(result);
    }
}
