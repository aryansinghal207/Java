// // Creating a trie
// import java.util.*;
// public class Triescodes {
//     public static class Node {
//         Node[] children = new Node[26];
//         boolean isEndOfWord=false;
//         Node() {
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     // inserting data in trie
//     public static void insert(String word) {
//         Node curr = root;
//         for(int level = 0; level < word.length(); level++) {
//             int idx = word.charAt(level) - 'a';
//             if (curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.isEndOfWord = true;
//     }

//     // searching in trie
//     public static boolean search(String key) {
//         Node curr = root;
//         for(int level = 0; level < key.length(); level++) {
//             int idx = key.charAt(level) - 'a';
//             if (curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.isEndOfWord == true;
//     }       

//     public static void main(String[] args) {
//         String words[]={"the", "a", "there", "any", "thee", "their"};
//         for(int i=0;i< words.length; i++) {
//             insert(words[i]);
//         }
//         System.out.println(search("the"));
//         System.out.println(search("these"));
//     }
// }


// // Word Break Problem
// import java.util.*;
// public class Triescodes{
//     public static class Node{
//         Node children[]=new Node[26];
//         boolean isEnd=false;
//         public Node(){
//             for(int i=0;i<26;i++){
//                 children[i]=null;
//             }
//         }
//     } 
//     public static Node root=new Node();
//     public static void insert(String word){
//         Node curr=root;
//         for(int i=0;i<word.length();i++){
//             int idx=word.charAt(i)-'a';
//             if(curr.children[idx]==null){
//                 curr.children[idx]=new Node();
//             }
//             curr=curr.children[idx];
//         }
//         curr.isEnd=true;
//     }
//     public static boolean search(String key){
//         Node curr=root;
//         for(int i=0;i<key.length();i++){
//             int idx=key.charAt(i)-'a';
//             if(curr.children[idx]==null){
//                 return false;
//             }
//             curr=curr.children[idx];
//         }
//         return curr.isEnd==true;
//     }
//     public static boolean wordbreak(String key){
//         if(key.length()==0){
//             return true;
//         }
//         for(int i=1;i<=key.length();i++){
//             if(search(key.substring(0,i)) && wordbreak(key.substring(i))){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         String words[]={"i","like","sam","samsung","mobile","ice"};
//         for(int i=0;i< words.length; i++) {
//             insert(words[i]);
//         }
//         String key="ilikesamsung";
//         System.out.println(wordbreak(key));
//     }
// }


// Prefix Preorder using tries
import java.util.*;
public class Triescodes{
    public static class Node{
        Node[] children=new Node[26];
        boolean eow=false;
        int freq;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            freq=0;
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
            curr.freq++;
        }
        curr.eow=true;
    }
    public static void findPrefix(Node curr,String ans){
        if(curr==null){
            return;
        }
        if(curr.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<26;i++){
            if(curr.children[i] != null){
                findPrefix(curr.children[i],ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args){
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        root.freq=-1;
        findPrefix(root," ");
    }
}