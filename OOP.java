class Person {
    private String name; 
    private int age; 
    Person(String n,int a){
        this.name=n;
        this.age=a;
    }
    public void display(){ 
        System.out.println("Name: " + name + ", Age: " + age);
    }
} 
class Student extends Person{
    private int marks;
    Student(String name,int age,int m){
        super(name,age);
        this.marks=m;
    }
    public void display(){
        super.display();
        System.out.println("Marks:"+marks);
    }
}
abstract class shape{
    abstract void area();
}
class circle extends shape{
    double radius;
    circle(double r){
        this.radius=r;
    }
    void area(){
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
interface Animal{
    void sound();
}
interface Pet{
    void play();
}
class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
public class OOP{ 
    public static void main(String[] args){
        Person p = new Person("Aryan", 21);
        p.display();
        System.out.println("-----");
        Student s=new Student("Upi",19,95);
        s.display();
        System.out.println("-----");
        // 4. Abstraction
        shape c = new circle(5);
        c.area();
        System.out.println("-----");
        // 5. Interface
        Dog d = new Dog();
        d.sound();
        d.play();
    }
}