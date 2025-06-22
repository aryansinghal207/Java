import java.util.*;
public class BitManipulation{
    public static void oddoreven(int n){
        if((n & 1)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args){
        oddoreven(1);
        oddoreven(2);
        oddoreven(3);
        oddoreven(4);
    }
}