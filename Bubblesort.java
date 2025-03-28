// In this algo we check the next element is it is smaller then we swap the elements 
// Bubblesort is a stable sort and in-place algorithm
// Best case Timecomplexity is O(n^2),Average case Timecomplexity is (n^2), Worst case Timecomplexity is (n^2).
// In modified code only Best case Timecomplexity is O(n),Average case Timecomplexity is (n^2), Worst case Timecomplexity is (n^2).
// Space Complexity is O(1)
// In this algo we check the further element is greter or smaller if smaller then we swap for ascending order sorting and vice-verse.

// import java.util.Scanner;
// public class Bubblesort{
//     static void sort(int[] a,int n) {
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(a[j]>a[j+1]){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int size=sc.nextInt();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sort(arr,size);
//         for (int i : arr) {
//             System.out.print(i+" ");
//         }
//     }
// }


// Optimal Approach of the previous code for best case only
import java.util.Scanner;
public class Bubblesort{
    static void sort(int[] a,int n) {
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                return;
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
