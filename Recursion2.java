// WAP to print weather x exist in an array or not.
import java.util.Scanner;
public class Recursion2 {
    static boolean findnum(int[] arr, int target, int size, int index) {
        if (index >= size) {
            return false;
        }
        if (arr[index] == target) {
            return true;
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
        if (findnum(arr, target, size, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
