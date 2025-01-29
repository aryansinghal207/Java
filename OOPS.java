// public class OOPS{
//     public static void main(String[] args){
//         Pen p1=new Pen();
//         p1.setcolor("Blue");
//         System.out.println(p1.color);
//         p1.settip(5);
//         System.out.println(p1.tip);
//     }
// }
// class Pen{
//     String color;
//     int tip;
//     void setcolor(String newcolor){
//         color=newcolor;
//     }
//     void settip(int newtip){
//         tip=newtip;
//     }
// }

// import java.util.*;
// public class OOPS{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=n;i>0;i--){
//             for(int j=0;j<i;j++){
//                 System.out.print("&");
//             }
//             System.out.println();
//         }
//     }
// }

public class OOPS{
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken c=new Chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs"); 
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}