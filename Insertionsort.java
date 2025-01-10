// In this algo we check the previous element it is greater then we swap
// Best Case TimeComplexity is O(n).
// Average Case TimeComplexity is O(n^2).
// Worst Case TimeComplexity is O(n^2).
// Space complexity is O(1).
// It is in-place
// It is Stable also.

import java.util.Scanner;
public class Insertionsort{
    static void sort(int[] a,int n) {
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr,size);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
