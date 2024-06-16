// #Using Switch in conditional statement
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         switch(a){
//             case 1: System.out.println("Hello");
//             break;
//             case 2: System.out.println("Namaste");
//             break;
//             case 3: System.out.println("Bonjour");
//             break;
//             default : System.out.println("Invalid Button");
//         }
//     }
// }


// Print the table of number entered by user using loop
import java.util.*;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a*i);
        }
    }
}
