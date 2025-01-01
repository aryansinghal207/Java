// Wrapper class : A class whose object contains or wrap a primitive datatype.
// Object of a wrapper class contain a field which stores primitive datatype.
import java.util.*;
public class Arraylist{
    public static void main(String[] args){
        // Integer in=Integer.valueOf(4);
        // System.out.println(in);
        // Float f=Float.valueOf(3.3f);
        // System.out.println(f);
        ArrayList<Integer> l1=new ArrayList<>();
        // Arraylist<Boolean> l2=new Arraylist<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        // System.out.println(l1.get(1));
        // for(int i=0;i<l1.size();i++){
        //     System.out.print(l1.get(i)+" ");
        // }
        // System.out.println();
        System.out.println(l1);
        l1.add(1,100);
        System.out.println(l1);

    }
}