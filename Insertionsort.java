// In this algo we check the previous element it is greater then we swap
// Best Case TimeComplexity is O(n).
// Average Case TimeComplexity is O(n^2).
// Worst Case TimeComplexity is O(n^2).
// Space complexity is O(1).
// It is in-place
// It is Stable also.
// Yeah cards ki tarah hota ha like hmm aapne cards ko sorted order m set karke rakhna cahte ha in the same way hm ek index se check karenge ke usse pechle wala element usee chota to nhi ha or aagar ha to swap karte rehte ha.

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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }        
    }
}
