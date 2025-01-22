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


// // Shortest Path
// import java.util.*;
// public class Stringfile{ 
//     public static float getshortestpath(String path){
//         int x=0;
//         int y=0;
//         for(int i=0;i<path.length();i++){
//             char dir=path.charAt(i);
//             if(dir=='N'){
//                 y++;
//             }
//             else if(dir=='S'){
//                 y--;
//             }
//             else if(dir=='E'){
//                 x++;
//             }
//             else{
//                 x--;
//             }
//         }
//         int x2=x*x;
//         int y2=y*y;
//         return (float)Math.sqrt(x2+y2);        
//     }
//     public static void main(String[] args) {
//         String path="WNEENESENNN";
//         System.out.println(getshortestpath(path));
//     }
// }


// // Substring 
// import java.util.*;
// public class Stringfile{ 
//     public static void getsubstring(String str,int a,int b){
//         String result="";
//         for(int i=a;i<b;i++){
//             result+=str.charAt(i);
//         }
//         System.out.print("Substring according to index is : "+result);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         String str="Aryan";
//         getsubstring(str,a,b);
//     }
// }

// // WAP to print the largest String according to lexicographic order
// import java.util.*;
// public class Stringfile{ 
//     public static void main(String[] args) {
//         String fruits[]={"apple","banana","mango"};
//         String largest=fruits[0];
//         for(int i=1;i<fruits.length;i++){
//             if(largest.compareTo(fruits[i])<0){
//                 largest=fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }

// WAP to append a to z char in string
import java.util.*;
public class Stringfile{ 
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}