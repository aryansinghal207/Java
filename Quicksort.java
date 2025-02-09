// import java.util.Scanner;
// public class Quicksort { 
//     static void swap(int[] arr, int x, int y) {
//         int temp = arr[x];
//         arr[x] = arr[y];
//         arr[y] = temp;
//     }
//     static int partition(int[] arr, int st, int end) {
//         int pivot = arr[st];
//         int cnt = 0;
//         for (int i = st + 1; i <= end; i++) {
//             if (arr[i] < pivot) cnt++;
//         }
//         int pivotidx = st + cnt;
//         swap(arr, st, pivotidx);
//         int i = st, j = end;
//         while (i < pivotidx && j > pivotidx) {
//             while (arr[i] <= pivot && i < pivotidx) i++;
//             while (arr[j] > pivot && j > pivotidx) j--;
//             if (i < pivotidx && j > pivotidx) {
//                 swap(arr, i, j);
//                 i++;
//                 j--;
//             }
//         }
//         return pivotidx;
//     }
//     static void Quicksort(int[] arr, int st, int end) {
//         if (st >= end) return; 
//         int pi = partition(arr, st, end); 
//         Quicksort(arr, st, pi - 1); 
//         Quicksort(arr, pi + 1, end); 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         Quicksort(arr, 0, size - 1);
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }
    

import java.util.*;
public class Quicksort{
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Quicksort(int[] arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int pIdx=partition(arr,si,ei);
        Quicksort(arr,si,pIdx-1);
        Quicksort(arr,pIdx+1,ei);
    }
    public static int partition(int[] arr,int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String args[]){
        int arr[]={2,4,3,1,4,5,7,-1};
        Quicksort(arr,0,arr.length-1);
        printArray(arr);
    }
}