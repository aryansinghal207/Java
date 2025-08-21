import java.util.*;
public class codepractice{
    public static class Node{
        boolean isEnd=false;
        Node[] children=new Node[26];
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
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
        }
        curr.isEnd=true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.isEnd==true;
    }
    public static void main(String[] args){
        String words[]={"the","thee","tree","there"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("tree"));
        System.out.println(search("tried"));
    }
}