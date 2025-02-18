// In this algo we choose first element as min and check is further element is smaller then we swap
// Space Complexity of this is O(1)
// Time Complexity of this is O(n^2)
// This is not stable sort
// This is in-place
// In this algo we consider first element as minimum and check upto last and if element is smaller than min then we swap and increment the min value to next index.
import java.util.Scanner;
public class Selectionsort{
    static void sort(int[] a,int n) {
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
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