// // Time Complexity of this is (nlogn)
// // This is not in-place alog
// // This is siable
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