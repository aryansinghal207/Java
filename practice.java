// import java.util.*;
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int matrix[][]=new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         // Print
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]>max){
//                     max=matrix[i][j];
//                 }
//             }
//         }
//         System.out.println("The maximum element from this is : "+max);
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]<min){
//                     min=matrix[i][j];
//                 }
//             }
//         }
//         System.out.println("The minimum element from this is : "+min);
//     }
// }


// import java.util.*;
// public class practice{
//     public static void printspiral(int[][] matrix){
//         int startrow=0;
//         int startcol=0;
//         int endrow=matrix.length-1;
//         int endcol=matrix[0].length-1;
//         while(startrow<=endrow && startcol<=endcol){
//             for(int j=startcol;j<=endcol;j++){
//                     System.out.print(matrix[startrow][j]+" ");
//             }
//             for(int i=startrow+1;i<=endrow;i++){
//                 System.out.print(matrix[i][endcol]+" ");
//             }
//             for(int j=endcol-1;j>=startcol;j--){
//                 if(startrow==endrow){
//                     break;
//                 }
//                 System.out.print(matrix[endrow][j]+" ");
//             }
//             for(int i=endrow-1;i>=startrow+1;i--){
//                 if(startcol==endcol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startcol]+" ");
//             }
//             startcol++;
//             startrow++;
//             endcol--;
//             endrow--;
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int matrix[][]=new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         // Print
//         printspiral(matrix);
//     }
// }


// import java.util.*;
// public class practice{
//     public static int diagonalsum(int[][] matrix){
//         int n=matrix.length;
//         int m=matrix[0].length;
//         int sum=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(i==j){
//                     sum+=matrix[i][j];
//                 }
//                 else if(i+j==n-1){
//                     sum+=matrix[i][j];
//                 }
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int matrix[][]=new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         // Print
//         int sum = diagonalsum(matrix);
//         System.out.println("Diagonal Sum: " + sum);
//     }
// }

// import java.util.*;
// public class practice {
//     public static int diagonalsum(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         if (n != m) {
//             System.out.println("Matrix is not square; diagonal sum cannot be computed.");
//             return 0;
//         }
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += matrix[i][i];
//             if (i != n - i - 1) { 
//                 sum += matrix[i][n - i - 1];
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int[][] matrix = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         int sum = diagonalsum(matrix);
//         System.out.println("Diagonal Sum: " + sum);
//         sc.close();
//     }
// }

import java.util.*;
public class practice {
    public static boolean Staircase(int[][] matrix,int key) {
        int row = 0;
        int column = matrix[0].length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==key){
                System.out.println("Key Found at "+row+" row number and "+column+" column ");
                return true;
            }
            else if(key<matrix[row][column]){
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not found!");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int key=sc.nextInt();
        Staircase(matrix,key);
    }
}