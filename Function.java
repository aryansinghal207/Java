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
    public static void addtwonumber(int a,int b){
        System.out.print(a+b);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        addtwonumber(a,b);
    }
}
