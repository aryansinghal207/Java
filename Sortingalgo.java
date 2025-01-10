// import java.util.Scanner;
// public class Sortingalgo{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]==0 && arr[j+1]!=0){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for (int i : arr) {
//             System.out.print(i+" ");
//         }
//     }
// }


// Sort array of fruits name in lexicographical order i.e Dictorary order
import java.util.Scanner;
public class Sortingalgo{
    static void sortFruits(String[] fruits){
        int n=fruits.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[min_index])<0){
                    min_index=j;
                }
            }
            String temp=fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits={"apple","kiwi","papaya","mango"};
        sortFruits(fruits);
        for (String val : fruits) {
            System.out.print(val+" ");
        }
    }
}