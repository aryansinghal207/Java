// import java.util.*;
// public class Backtracking{
//     public static void changearr(int[] arr,int i,int val){
//         if(i==arr.length){
//             printArr(arr);
//             return;
//         }
//         arr[i]=val;
//         changearr(arr,i+1,val+1);
//         arr[i]=arr[i]-2;
//     }
//     public static void printArr(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]=new int[10];
//         changearr(arr,0,1);
//         printArr(arr); 
//     }
// }


// // WAP to find subset of a string
// import java.util.*;
// public class Backtracking{
//     public static void findsubs(String str,String ans,int i){
//         if(i==str.length()){
//             if(ans.length()==0){
//                 System.out.println("null");
//             }else{
//                 System.out.println(ans);
//             }
//             return;
//         }
//         findsubs(str,ans+str.charAt(i),i+1);
//         findsubs(str,ans,i+1);
//     }
//     public static void main(String[] args){
//         String str="abc";
//         findsubs(str,"",0);
//     }
// }


// // WAP to print the permutation of a string
// import java.util.*;
// public class Backtracking{
//     public static void permutation(String str,String ans){
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char curr=str.charAt(i);
//             String newstr=str.substring(0,i)+str.substring(i+1);
//             permutation(newstr,ans+curr);
//         }
//     }
//     public static void main(String[] args){
//         String str="abc";
//         permutation(str,"");
//     }
// }


// // N-Queen
// import java.util.*;
// public class Backtracking{
//     public static boolean issafe(char[][] board,int row,int col){
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col]=='Q') return false;
//         }
//         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
//             if(board[i][j]=='Q') return false;
//         }
//         for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
//             if(board[i][j]=='Q') return false;
//         }
//         return true;
//     }
//     public static void nqueen(char[][] board,int row){
//         if(row==board.length){
//             printboard(board);
//             return;
//         }
//         for(int j=0;j<board.length;j++){
//             if(issafe(board,row,j)){
//                 board[row][j]='Q';
//                 nqueen(board,row+1);
//                 board[row][j]='.';
//             }
//         }
//     }
//     public static void printboard(char[][] board){
//         System.out.println("----- Chess Board -----");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int n=4;
//         char board[][]=new char[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j]='.';
//             }
//         }
//         nqueen(board,0);
//     }
// }


// // N-Queen count.
// import java.util.*;
// public class Backtracking{
//     public static boolean issafe(char[][] board,int row,int col){
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col]=='Q') return false;
//         }
//         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
//             if(board[i][j]=='Q') return false;
//         }
//         for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
//             if(board[i][j]=='Q') return false;
//         }
//         return true;
//     }
//     public static int nqueen(char[][] board,int row){
//         if(row==board.length){
//             return 1;
//         }
//         int count=0;
//         for(int j=0;j<board.length;j++){
//             if(issafe(board,row,j)){
//                 board[row][j]='Q';
//                 count+=nqueen(board,row+1);
//                 board[row][j]='.';
//             }
//         }
//         return count;
//     }
//     public static void printboard(char[][] board){
//         System.out.println("----- Chess Board -----");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int n=4;
//         char board[][]=new char[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j]='.';
//             }
//         }
//         System.out.print(nqueen(board,0));
//     }
// }


// Print only one possible soltuion of N-Queen.
import java.util.*;
public class Backtracking{
    public static boolean issafe(char[][] board,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public static boolean nqueen(char[][] board,int row){
        if(row==board.length){
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                if(nqueen(board,row+1)) return true;
                board[row][j]='.';
            }
        }
        return false;
    }
    public static void printboard(char[][] board){
        System.out.println("----- Chess Board -----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        if(nqueen(board,0)){
            System.out.println("Solution is possible");
            printboard(board);
        }else{
            System.out.println("Solution is not possible.");
        }
    }
}