// // Print 2D array
// import java.util.*;
// public class TWODArray{
//     static void printarray(int[][] arr){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         int [][] arr={{1,2,3},
//                     {4,5,6},
//                     {7,8,9}};
//     printarray(arr);       
//     }
// }

// // Taking 2D array input from user  .
// import java.util.*;
// public class TWODArray{
//     static void printarray(int[][] arr){
//         System.out.print("Entered rows and column are : ");
//         System.out.println("");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Row's Number : ");
//         int r=sc.nextInt();
//         System.out.print("Enter Column's Number : ");
//         int c=sc.nextInt();
//         int [][] arr=new int[r][c];
//         System.out.print("Enter "+r+" rows and "+c+" column : ");
//         System.out.println("");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//     printarray(arr);       
//     }
// }

// // Adding 2D array matrix in which we have taken input from user.
// import java.util.*;
// public class TWODArray{
//     static void printarray(int[][] arr){
//         System.out.print("Entered rows and column are : ");
//         System.out.println("");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void sum(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
//         int sum[][]=new int[r1][c1];
//         if(r1!=r2 || c1!=c2){
//             System.out.println("Error: Matrices dimensions do not match. Cannot add the matrices.");
//             return;
//         }
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//                 sum[i][j]=arr1[i][j] + arr2[i][j];
//             }
//         }
//         printarray(sum);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Row's of Array 1 : ");
//         int r=sc.nextInt();
//         System.out.print("Enter Column's of Array 1 : ");
//         int c=sc.nextInt();
//         int [][] arr=new int[r][c];
//         System.out.print("Enter "+r+" rows of Array 1 and "+c+" column of Array 1 : ");
//         System.out.println("");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         System.out.print("Enter Row's of Array 2 : ");
//         int r2=sc.nextInt();
//         System.out.print("Enter Column's of Array 2 : ");
//         int c2=sc.nextInt();
//         int [][] arr2=new int[r2][c2];
//         System.out.print("Enter "+r2+" rows of Array 2 and "+c2+" column of Array 2 : ");
//         System.out.println("");
//         for(int i=0;i<r2;i++){
//             for(int j=0;j<c2;j++){
//                 arr2[i][j]=sc.nextInt();
//             }
//         }
//         sum(arr,r,c,arr2,r2,c2); 
//     }
// }

// // Multiplication of 2D array matrix in which we have taken input from user.
// import java.util.*;
// public class TWODArray{
//     static void printarray(int[][] arr){
//         System.out.print("Entered rows and column are : ");
//         System.out.println("");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void multiply(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
//         if(c1 != r2){
//             System.out.println("Multiplication not possible - Wrong Dimension");
//             return;
//         }
//         int mul[][]=new int[r1][c2];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c2;j++){
//                 for(int k=0;k<c1;k++){
//                     mul[i][j]+=(arr1[i][k]*arr2[k][j]);
//                 }
//             }
//         }
//         printarray(mul);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Row's of Array 1 : ");
//         int r=sc.nextInt();
//         System.out.print("Enter Column's of Array 1 : ");
//         int c=sc.nextInt();
//         int [][] arr=new int[r][c];
//         System.out.print("Enter "+r+" rows of Array 1 and "+c+" column of Array 1 : ");
//         System.out.println("");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         System.out.print("Enter Row's of Array 2 : ");
//         int r2=sc.nextInt();
//         System.out.print("Enter Column's of Array 2 : ");
//         int c2=sc.nextInt();
//         int [][] arr2=new int[r2][c2];
//         System.out.print("Enter "+r2+" rows of Array 2 and "+c2+" column of Array 2 : ");
//         System.out.println("");
//         for(int i=0;i<r2;i++){
//             for(int j=0;j<c2;j++){
//                 arr2[i][j]=sc.nextInt();
//             }
//         }
//         multiply(arr,r,c,arr2,r2,c2); 
//     }
// }

// // Transpose of a 2D array matrix in which we have taken input from user.
// import java.util.*;
// public class TWODArray{
//     static void printarray(int[][] arr){
//         System.out.print("Entered rows and column are : ");
//         System.out.println("");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void Transpose(int[][] arr,int r,int c){
//         int trans[][]=new int[c][r];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 trans[j][i]=arr[i][j];
//             }
//         }
//         printarray(trans);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Row's of Array : ");
//         int r=sc.nextInt();
//         System.out.print("Enter Column's of Array : ");
//         int c=sc.nextInt();
//         int [][] arr=new int[r][c];
//         int total=r*c;
//         System.out.print("Enter "+total+"elements of an array : ");
//         System.out.println("");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         Transpose(arr,r,c); 
//     }
// }

// // Transpose of a 2D array matrix in which we have taken input from user without using any other array for only square matrix.
// import java.util.*;
// public class TWODArray{
//     static void printarray(int[][] arr){
//         System.out.print("Entered rows and column are : ");
//         System.out.println("");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void Transpose(int[][] arr,int r,int c){
//         for(int i=0;i<r;i++){
//             for(int j=i;j<c;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Row's of Array : ");
//         int r=sc.nextInt();
//         System.out.print("Enter Column's of Array : ");
//         int c=sc.nextInt();
//         int [][] arr=new int[r][c];
//         int total=r*c;
//         System.out.print("Enter "+total+"elements of an array : ");
//         System.out.println("");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         Transpose(arr,r,c); 
//         printarray(arr);
//     }
// }

// // Rotate an array 90 degree.
// import java.util.*;
// public class TWODArray{
//     static void printarray(int[][] arr){
//         System.out.print("Entered rows and column are : ");
//         System.out.println("");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void Transpose(int[][] arr,int r,int c){
//         for(int i=0;i<r;i++){
//             for(int j=i;j<c;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//         }
//     }
//     static void Reverse(int[] arr){
//         int i=0,j=arr.length-1;
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//     }   
//     static void Rotate(int[][] arr,int n){
//         Transpose(arr,n,n);
//         for(int i=0;i<n;i++){
//             Reverse(arr[i]);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Row's of Array : ");
//         int r=sc.nextInt();
//         System.out.print("Enter Column's of Array : ");
//         int c=sc.nextInt();
//         int [][] arr=new int[r][c];
//         int total=r*c;
//         System.out.print("Enter "+total+" elements of an array : ");
//         System.out.println("");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         Rotate(arr,r); 
//         printarray(arr);
//     }
// }

// // Pascal Triangle
// import java.util.Scanner;
// public class TWODArray{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         // Input the number of rows
//         System.out.print("Enter the number of rows for Pascal's Triangle: ");
//         int rows = scanner.nextInt();
//         // Generate and print Pascal's Triangle
//         for (int i = 0; i < rows; i++) {
//             // Print spaces for alignment
//             for (int j = 0; j < rows - i; j++) {
//                 System.out.print(" ");
//             }
//             // Calculate and print numbers in the row
//             int number = 1;
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(number + " ");
//                 number = number * (i - j) / (j + 1);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class TWODArray {
//     static int[][] computePrefixSum(int[][] matrix) {
//         int r = matrix.length;
//         int c = matrix[0].length;
//         int[][] prefixSum = new int[r][c];
//         for (int i = 0; i < r; i++) {
//             prefixSum[i][0] = matrix[i][0];
//             for (int j = 1; j < c; j++) {
//                 prefixSum[i][j] = prefixSum[i][j - 1] + matrix[i][j];
//             }
//         }
//         return prefixSum;
//     }
//     static int findSum(int[][] prefixSum, int l1, int r1, int l2, int r2) {
//         int sum = 0;
//         for (int i = l1; i <= l2; i++) {
//             if (r1 >= 1) {
//                 sum += prefixSum[i][r2] - prefixSum[i][r1 - 1];
//             } else {
//                 sum += prefixSum[i][r2];
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows and columns of matrix:");
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int[][] matrix = new int[r][c];
//         System.out.println("Enter " + (r * c) + " values:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter the rectangle boundaries l1, r1, l2, r2:");
//         int l1 = sc.nextInt();
//         int r1 = sc.nextInt();
//         int l2 = sc.nextInt();
//         int r2 = sc.nextInt();
//         if (l1 < 0 || l2 >= r || r1 < 0 || r2 >= c || l1 > l2 || r1 > r2) {
//             System.out.println("Invalid boundaries!");
//             return;
//         }
//         int[][] prefixSum = computePrefixSum(matrix);
//         int rectangleSum = findSum(prefixSum, l1, r1, l2, r2);
//         System.out.println("Rectangle Sum: " + rectangleSum);
//     }
// }

// import java.util.*;
// public class TWODArray {
//     static int[][] computePrefixSum(int[][] matrix) {
//         int r = matrix.length;
//         int c = matrix[0].length;
//         int[][] prefixSum = new int[r][c];
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 prefixSum[i][j] = matrix[i][j];
//                 if (i > 0) {
//                     prefixSum[i][j] += prefixSum[i - 1][j];
//                 }
//                 if (j > 0) {
//                     prefixSum[i][j] += prefixSum[i][j - 1];
//                 }
//                 if (i > 0 && j > 0) {
//                     prefixSum[i][j] -= prefixSum[i - 1][j - 1];
//                 }
//             }
//         }
//         return prefixSum;
//     }
//     static int findSum(int[][] prefixSum, int l1, int r1, int l2, int r2) {
//         int sum = prefixSum[l2][r2];
//         int up = (l1 > 0) ? prefixSum[l1 - 1][r2] : 0;
//         int left = (r1 > 0) ? prefixSum[l2][r1 - 1] : 0;
//         int common = (l1 > 0 && r1 > 0) ? prefixSum[l1 - 1][r1 - 1] : 0;
//         return sum - up - left + common;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows and columns of matrix:");
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         if (r <= 0 || c <= 0) {
//             System.out.println("Invalid matrix size!");
//             return;
//         }
//         int[][] matrix = new int[r][c];
//         System.out.println("Enter " + (r * c) + " values:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter the rectangle boundaries l1, r1, l2, r2:");
//         int l1 = sc.nextInt();
//         int r1 = sc.nextInt();
//         int l2 = sc.nextInt();
//         int r2 = sc.nextInt();
//         if (l1 < 0 || l2 >= r || r1 < 0 || r2 >= c || l1 > l2 || r1 > r2) {
//             System.out.println("Invalid boundaries!");
//             return;
//         }
//         int[][] prefixSum = computePrefixSum(matrix);
//         int rectangleSum = findSum(prefixSum, l1, r1, l2, r2);
//         System.out.println("Rectangle Sum: " + rectangleSum);
//     }
// }


