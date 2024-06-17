// import java.util.*;

// public class Function{
//     public static void printMyName(String name){
//         System.out.print(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.next();

//         printMyName(name);
//     }
// }


// #Add 2 number using functions
import java.util.*;
public class Function{
    public static void factorail(int a){
        if(a<0){
            System.out.println("Invalid Number");
            return;
        }
        int fact=1;
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }
        System.out.print(fact);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        factorail(a);
    }
}
