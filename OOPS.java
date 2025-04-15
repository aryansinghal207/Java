// # Compile-Time Polymorphism (Method Overloading)
// Achieved through method overloading.
// The method name is the same, but the parameters (number or type) are different.

// # Run-Time Polymorphism (Method Overriding)
// Achieved through method overriding.
// A subclass provides a specific implementation of a method that is already defined in the parent class.


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


// public class OOPS{
//     public static void main(String args[]){
//         Horse h=new Horse();
//         h.eat();
//         h.walk();

//         Chicken c=new Chicken();
//         c.eat();
//         c.walk();
//     }
// }
// abstract class Animal{
//     void eat(){
//         System.out.println("Animal Eats");
//     }
//     abstract void walk();
// }
// class Horse extends Animal{
//     void walk(){
//         System.out.println("Walks on 4 legs"); 
//     }
// }
// class Chicken extends Animal{
//     void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }


// // Interfaces
// public class OOPS{
//     public static void main(String args[]){
//         Queen q=new Queen();
//         q.moves();
//     }
// }
// interface ChessPlayer{
//     void moves();
// }
// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal (in all 4 directions)");
//     }
// }
// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal (by 1 step)");
//     }
// }


// import java.util.*;
// public class OOPS{
//     public static void main(String[] args){
//         Person p1=new Person();    // Constructor is called.
//         Person p2=new Person(18,"Arush");
//         p1.name="Aryan";
//         p1.age=20;
//         System.out.println("Person's Age is : "+p1.age+" ");
//         System.out.println("Person's Name is : "+p1.name+" ");
//         p1.study();
//         p1.study(1);
//         System.out.println("Person's Age is : "+p2.age+" ");
//         System.out.println("Person's Name is : "+p2.name+" ");
//         System.out.println(Person.count);
//         Developer D1=new Developer(19, "Ayan");
//         D1.study();
//     }
// }

// class Developer extends Person{     // Inheritance 
//     public Developer(int age,String name){
//         super(age,name);       // Super Keyword :- It is used to call its parent constructor
//     }
// }

// class Person{
//     String name;
//     int age;
//     static int count;    // Static Keyword
//     public Person(){     // Default Constructor
//         count++;
//         System.out.println("Creating an object of function class");
//     }
//     public Person(int age,String newName){      // Parameterized Constructor and Function Overloading 
//         count++;
//         name=newName;
//         this.age=age;    // this keyword
//     }
//     void study(){
//         System.out.println(name+" is studying.");
//     }
//     void study(int hours){ 
//         System.out.println(name+" is studying from last "+hours+" hour");
//     }
// }


// // Abstraction
// import java.util.*;
// public class OOPS{
//     public static void main(String[] args){
//         Audi a1=new Audi();
//         a1.start();
//     }
// }
// class Audi extends Car{
//     void start(){
//         System.out.println("Audi is starting");
//     }
// }
// abstract class Car{     // Like we can't make object from this because this is a concept so we asign abstract class to it 
//     int price;
//     abstract void start();
// }


// // Interfaces
// import java.util.*;
// public class OOPS implements car{
//     public static void main(String[] args){
        
//     }
//     public void start(){
//         System.out.println("My Car is Starting"); 
//     }
// }
// interface car{
//     void start();   // This is by default abstract
// }


