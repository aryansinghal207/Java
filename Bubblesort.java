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

// Bubblesort is a stable sort and in-place algorithm