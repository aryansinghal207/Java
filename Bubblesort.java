// WAP to print sum of all subsequence in java using recursion
import java.util.Scanner;
public class Bubblesort{
    private static void findSubsequenceSum(int[] array, int index, int currentSum, int[] totalSum) {
        if (index == array.length) {
            totalSum[0] += currentSum;
            return;
        }
        findSubsequenceSum(array, index + 1, currentSum + array[index], totalSum);
        findSubsequenceSum(array, index + 1, currentSum, totalSum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] totalSum = {0};
        findSubsequenceSum(array, 0, 0, totalSum);
        System.out.println("Sum of all subsequences: " + totalSum[0]);
    }
}