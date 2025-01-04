// WAP to print weather x exist in an array or not.
import java.util.Scanner;
public class Recursion2 {
    static boolean findnum(int[] arr, int x, int n, int index) {
        if (index >= n) {
            return false;
        }
        if (arr[index] == x) {
            return true;
        }
        return findnum(arr, x, n, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        if (findnum(arr, x, n, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
