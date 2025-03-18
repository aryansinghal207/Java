import java.util.*;
public class Arraysclasscode{
    public static void main(String[] args){
        int[] numbers={1,4,2,6,5,7,8,9};
        Arrays.sort(numbers);
        int index=Arrays.binarySearch(numbers,4);
        System.out.println("The index of element 4 is : "+index);
    }
}