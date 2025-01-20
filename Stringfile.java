// Strings are IMMUTABLE in java
// import java.util.*;
// public class Stringfile{ 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name; 
//         name = sc.nextLine();
//         System.out.println(name);
//     }
// }

// import java.util.*;
// public class Stringfile{ 
//     public static void main(String[] args) {
//         String firstname="Aryan";
//         String lastname="Singhal";
//         String fullname=firstname+" "+lastname;
//         System.out.println(fullname);
//     }
// }

import java.util.*;
public class Stringfile{ 
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String firstname="Aryan";
        String lastname="Singhal";
        String fullname=firstname+" "+lastname;
        printletter(fullname);
    }
}