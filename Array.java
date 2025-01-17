// // Single Dimensional Array
// public class Array{
//     public static void main(String[] args){
//         int[] age;
//         age=new int[3];
//         // or
//         // int[] arr1={1,2,3,4,5,6,7,8,9,10};
//         float[] weight=new float[3];
//         String[] name=new String[3];
//         age[0]=11;
//         age[1]=12;
//         age[2]=13;
//         weight[0]=2.34f;
//         weight[1]=4.14f;
//         weight[2]=5.74f;
//         name[0]="Aryan";
//         name[1]="Arush";
//         name[2]="Ayan";
//         for(int ages : age){
//             System.out.println(ages);
//         }
//         // System.out.println(weight[0]);
//         // System.out.println(weight[1]);
//         // System.out.println(weight[2]);
//         // System.out.println(name[0]);
//         // System.out.println(name[1]);
//         // System.out.println(name[2]);
//     }
// }

// // Multi-Dimensional Array
// public class Array{
//     public static void main(String[] args){
//         int[][] arr={{1,2},{3,4},{5,6}};
//         System.out.println(arr[0][0]);
//         System.out.println(arr[0][1]);
//         System.out.println(arr[1][1]);
//     }
// }

// // Traversing through Array
// public class Array{
//     public static void main(String[] args){
//         int[][] arr={{1,2},{3,4},{5,6}};
//         // for(int i=0;i<3;i++){
//         //     for(int j=0;j<2;j++){
//         //         System.out.println(arr[i][j]);
//         //     }
//         // }
//         // // or
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.println(arr[i][j]);
//             }
//         }
//     }
// }


// // Calculate the sum of given array
// public class Array{
//     public static void main(String[] args){
//         int[] arr={1,2,3};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }
//         System.out.println(sum);
//     }
// }

// // Calculate the max element of given array
// public class Array{
//     public static void main(String[] args){
//         int[] arr={1,2,3,44,2,7};
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

// // Search the given element in a given array
// public class Array {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 44, 2, 7};
//         int search = 44;
//         int index = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == search) {
//                 index = i;
//                 break;
//             }
//         }
//         if (index != -1) {
//             System.out.println("Element found at index: " + index);
//         } else {
//             System.out.println("Element not found");
//         }
//     }
// }

// // Taking input from user of an array
// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<5;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// // In arrays when we copy a array normally by assigning operator it do the shallow copy and demerit of that is the changes made in the copy one also make chnges in the original ones 
// // Soo to solve this issue we use .clone() keyword which do deepe copy.
// // In java we have java.util.array in which we have some predefined functions :
// // 1) copy:- Arrays.copyof(arr,arr.length); or Arrays.copyof(arr,2,arr.length); 
// import java.util.*;
// public class Array {
//     static int lastoccurenece(int[] arr,int x){
//         int last=-1;
//         for(int i=0;i<5;i++){
//             if(arr[i]==x){
//                 last=i;
//             }
//         }
//         return last;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Enter the number u want to find : ");
//         int n=sc.nextInt();
//         System.out.print("Lastoccurence of "+n+" is : "+lastoccurenece(arr,n));
//     }
// }

// // Traverse a array
// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<5;i++){
//             for(int j=i+1;j<5;j++){
//                 if(arr[i]==arr[j]){
//                     arr[i]=-1;
//                     arr[j]=-1;
//                 }
//             }
//         }
//         int ans=0;
//         for(int i=0;i<5;i++){
//             if(arr[i]>0){
//                 ans=arr[i];
//             }
//         }
//         System.out.print(ans);
//     }
// }

// // Find the second largest element of an array
// import java.util.*;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         System.out.print("Enter the elements of the array: ");
//         for (int i = 0; i < 5; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int max = Integer.MIN_VALUE;
//         int secondMax = Integer.MIN_VALUE;
//         for (int i = 0; i < 5; i++) {
//             if (arr[i] > max) {
//                 secondMax = max;
//                 max = arr[i];
//             } else if (arr[i] > secondMax && arr[i] != max) {
//                 secondMax = arr[i];
//             }
//         }
//         if (secondMax == Integer.MIN_VALUE) {
//             System.out.println("There is no second largest element.");
//         } else {
//             System.out.println("The second largest element is: " + secondMax);
//         }
//         sc.close();
//     }
// }

// // Select the first repeatative element of an array
// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//         }
//         int ans=-1;
//         outerLoop:
//         for(int i=0;i<5;i++){
//             for(int j=i+1;j<5;j++){
//                 if(arr[i]==arr[j]){
//                     ans=arr[i];
//                     break outerLoop;
//                 }
//             }
//         }
//         System.out.print(ans);
//     }
// }

// // Swapping an array
// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         System.out.println("Enter the values of a and b : ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println("Before swap : ");
//         System.out.println(a);
//         System.out.println(b);
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("After swap : ");
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// // Print reverse of an array
// import java.util.*;
// public class Array {
//     static void swapInArray(int[] arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     static void reversearray(int[] arr){
//         int i=0,j=arr.length-1;
//         while(i<j){
//             swapInArray(arr,i,j);
//             i++;
//             j--;
//         }
//     }
//     static void printarray(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,6};
//         reversearray(arr);
//         printarray(arr);
//     }
// }

// // Rotation of an array k times
// import java.util.*; 
// public class Array{
//     static int[] rotate(int arr[], int k){
//         int n=arr.length;
//         k=k%n;
//         int ans[]=new int[n];
//         int j=0;
//         for(int i=n-k;i<n;i++){
//             ans[j++]=arr[i];
//         }
//         for(int i=0;i<n-k;i++){
//             ans[j++]=arr[i];
//         }
//         return ans;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Enter the number of times array should be shifted : ");
//         int k=sc.nextInt();
//         System.out.print("Original Array : ");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//         int ans[]=rotate(arr,k); 
//         System.out.print("Array after "+k+" Rotation : ");
//         for (int i = 0; i < ans.length; i++) {
//             System.out.print(ans[i] + " ");
//         } 
//     }
// }

// // Sort an array which consist of 0's and 1's
// import java.util.*; 
// public class Array{
//     static void sort(int arr[]){
//         int n=arr.length;
//         int zero=0;
//         int one=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 zero++;
//             }
//             else if(arr[i]==1){
//                 one++;
//             }
//         }
//         for(int i=0;i<zero;i++){
//             System.out.print("0"+" ");
//         }
//         for(int i=zero;i<n;i++){
//             System.out.print("1"+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Original Array : ");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//         System.out.print("Sorted Array is : ");
//         sort(arr);
//     }
// }

// // Sort an array which consist of 0's and 1's using two pointer approach
// import java.util.*; 
// public class Array{
//     // static void sort(int arr[]){
//     //     int n=arr.length;
//     //     int zero=0;
//     //     int one=0;
//     //     for(int i=0;i<n;i++){
//     //         if(arr[i]==0){
//     //             zero++;
//     //         }
//     //         else if(arr[i]==1){
//     //             one++;
//     //         }
//     //     }
//     //     for(int i=0;i<zero;i++){
//     //         System.out.print("0"+" ");
//     //     }
//     //     for(int i=zero;i<n;i++){
//     //         System.out.print("1"+" ");
//     //     }
//     // }
//     static void swap(int[] arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     static void sort(int arr[]){
//         int n=arr.length;
//         int left=0;int right=n-1;
//         while(left<right){
//             if(arr[left]==1 && arr[right]==0){
//                 swap(arr,left,right);
//                 left++;
//                 right--;
//             }
//             if(arr[left]==0){
//                 left++;
//             }
//             if(arr[right]==1){
//                 right--;
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Original Array : ");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//         System.out.print("Sorted Array is : ");
//         sort(arr);
//     }
// }


// // Sort an array which consist of even and odd using two pointer approach
// import java.util.*; 
// public class Array{
//     static void swap(int[] arr,int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     static void sortevenodd(int arr[]){
//         int n=arr.length;
//         int left=0;int right=n-1;
//         while(left<right){
//             if(arr[left]%2 ==1 && arr[right]%2==0){
//                 swap(arr,left,right);
//                 left++;
//                 right--;
//             }
//             if(arr[left]%2==0){
//                 left++;
//             }
//             if(arr[right]%2==1){
//                 right--;
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Original Array : ");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//         System.out.print("Sorted Array is : ");
//         sortevenodd(arr);
//     }
// }

// // Sort an array based on square using two pointer approach
// import java.util.*; 
// public class Array{
//     static void sortsquare(int arr[]){
//         int n=arr.length;
//         int left=0;
//         int right=n-1;
//         int k=0;
//         int[] ans=new int[n];
//         while(left<=right){
//             if(Math.abs(arr[left])>Math.abs(arr[right])){
//                 ans[k++]=arr[left] * arr[left];
//                 left++;
//             }
//             else{
//                 ans[k++]=arr[right] * arr[right];
//                 right--;
//             }
//         }
//         for(int i=n-1;i>=0;i--){
//             System.out.print(ans[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Original Array : ");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//         System.out.print("Sorted Array is : ");
//         sortsquare(arr);
//     }
// }

// // Prefix sum Problem
// import java.util.*; 
// public class Array{
//     static void prefix(int arr[]){
//         int n=arr.length;
//         for(int i=1;i<n;i++){
//             arr[i]+=arr[i-1];
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Original Array : ");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//         System.out.print("Prefix Array is : ");
//         prefix(arr);
//     }
// }

// // Check if array can be subpartitioned or not
// import java.util.*; 
// public class Array{
//     static int sum(int arr[]){
//         int total=0;
//         for(int i=0;i<arr.length;i++){
//             total+=arr[i];
//         }
//         return total;
//     }
//     static boolean equalsum(int[] arr){
//         int total=sum(arr);
//         int prefix=0;
//         for(int i=0;i<arr.length;i++){
//             prefix+=arr[i];

//             int suffixsum=total-prefix;
//             if(prefix==suffixsum){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println(" ");
//         System.out.print("Equal Partition possible : "+equalsum(arr));
//     }
// }

// // suffix sum Problem
// import java.util.*; 
// public class Array{
//     static void suffix(int arr[]){
//         int n=arr.length;
//         for(int i=n-1;i>=1;i--){
//             arr[i]+=arr[i-1];
//         }
//         for(int i=n-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the array size : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Original Array : ");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(" ");
//         System.out.print("Suffix Array is : ");
//         suffix(arr);
//     }
// }


// import java.util.*;
// public class Array {
//     public static void swap(int nums[], int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
//     public static void sortColors(int[] nums) {
//         int n = nums.length;
//         int s = 0;
//         int e = n - 1;
//         int mid = 0;

//         while (mid <= e) {
//             if (nums[mid] == 1) {
//                 mid++;
//             } else if (nums[mid] == 0) {
//                 swap(nums, mid, s);
//                 mid++;
//                 s++;
//             } else {
//                 swap(nums, mid, e);
//                 e--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int nums[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             nums[i] = obj.nextInt();
//         }
//         sortColors(nums);
//         for (int i = 0; i < n; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }


import java.util.*;
public class lec3 {
    public static void subarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println("The maximum sum of a subarray is: " + max);
        System.out.println("The minimum sum of a subarray is: " + min);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subarray(arr);
    }
}