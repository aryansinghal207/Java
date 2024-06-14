// public class intro{
//     public static void main(String[] args){
//         int a=10;
//         int b=20;
//         int c=a+b;
//         int d=a*b;
//         System.out.println(c);
//         System.out.println(d);  
//     }
// }


// #Taking input from user
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name= sc.nextLine();
//         System.out.println(name); 
//     }
// }


// #Calculating radius of circle by taking radius input from user
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(3.14*a*a); 
//     }
// }


// Print the table of number entered by user using loop
// import java.util.*;
// public class intro{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(a*i);
//         }
//     }
// }


// #Using Switch in conditional statement
import java.util.*;
public class intro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }
    }
}