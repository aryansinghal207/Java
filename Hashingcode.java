import java.util.*;
public class Hashingcode{
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("India",101);
        hm.put("India",102);
        hm.put("India",103);   // HashMap does allow duplicate value and pick the last declared value of one
        System.out.println(hm);
    }
}