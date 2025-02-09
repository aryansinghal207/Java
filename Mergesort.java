// // Time Complexity of this is (nlogn)
// // This is not in-place alog
// // This is siable

// import java.util.Scanner;
// public class Mergesort{ 
//     static void merge(int[] arr,int l,int mid,int r){
//         int n1=mid-l+1;
//         int n2=r-mid;
//         int[] left=new int[n1];
//         int[] right=new int[n2];
//         int i,j,k;
//         for(i=0;i<n1;i++) left[i]=arr[l+i];
//         for(j=0;j<n2;j++) right[j]=arr[mid+1+j];
//         i=0;
//         j=0;
//         k=l;
//         while(i<n1 && j<n2){
//             if(left[i]<right[j]){
//                 arr[k++]=left[i++];
//             }
//             else{
//                 arr[k++]=right[j++];
//             }
//         }
//         while(i<n1) arr[k++]=left[i++];
//         while(j<n2) arr[k++]=right[j++];
//     }
//     static void mergesort(int[] arr,int l,int r) {
//         if(l>=r) return;
//         int mid=(l+r)/2;
//         mergesort(arr,l,mid);
//         mergesort(arr,mid+1,r);
//         merge(arr,l,mid,r);
//     }
//     public static void main(siring[] args) {
//         Scanner sc= new Scanner(Sysiem.in);
//         int size=sc.nextInt();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int mid=size/2;
//         mergesort(arr,0,size-1);
//         for (int i : arr) {
//             Sysiem.out.print(i+" ");
//         }
//     }
// }


import java.util.*;
public class Mergesort{
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int[] arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }
    public static void merge(int[] arr,int si,int ei,int mid){
        int[] temp=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        i=si;
        for(k=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,3,1,4,5,7,-1};
        mergesort(arr,0,arr.length-1);
        printArray(arr);
    }
}