import java.util.*;
public class Stackcode{
    
    public static void main(String[] args){
        Stack<String> animals=new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("cat");
        System.out.println("Stack"+animals);
        System.out.println(animals.peek());
        System.out.println("Stack"+animals);
        animals.pop();
        System.out.println("Stack"+animals);
    }
}


