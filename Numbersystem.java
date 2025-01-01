// // Binary to decimal
// import java.util.Scanner;
// public class Numbersystem{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int binary=sc.nextInt();
//         int ans=0;
//         int pw=1;
//         while(binary>0){
//             int unit=binary%10;
//             ans+=(unit*pw);
//             binary /=10;
//             pw *=2;
//         }
//         System.out.print(ans);
//     }
// }

// Decimal to binary
import java.util.Scanner;
public class Numbersystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        int ans=0;
        int pw=1;
        while(decimal>0){
            int parity=decimal%2;
            ans+=(parity*pw);
            decimal /=2;
            pw *=10;
        }
        System.out.print(ans);
    }
}