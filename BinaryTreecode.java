// import java.util.*;
// public class BinaryTreecode{
//     static class Node{
//         int data;
//         Node right;
//         Node left;
//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }
//     static class BinaryTree{
//         static int idx=-1;
//         public static Node buildtree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }
//             Node newnode=new Node(nodes[idx]);
//             newnode.left=buildtree(nodes);
//             newnode.right=buildtree(nodes);
//             return newnode;
//         }
//         public static void preorder(Node root){
//             if(root == null){
//                 return;
//             }
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//         public static void inorder(Node root){
//             if(root == null){
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//         }
//         public static void postorder(Node root){
//             if(root == null){
//                 return;
//             }
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data+" ");
//         }
//         public static void levelOrder(Node root){
//             if(root == null){
//                 return;
//             }
//             Queue<Node> q=new LinkedList<>();
//             q.add(root);
//             q.add(null);
//             while(!q.isEmpty()){
//                 Node currNode=q.remove();
//                 if(currNode == null){
//                     System.out.println();
//                     if(q.isEmpty()){
//                         break;
//                     }else{
//                         q.add(null);
//                     }
//                 } else{
//                     System.out.print(currNode.data+" ");
//                     if(currNode.left != null){
//                         q.add(currNode.left);
//                     }
//                     if(currNode.right != null){
//                         q.add(currNode.right);
//                     }
//                 }
//             }
//         }
//     }
//     public static void main(String[] args){
//         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         BinaryTree tree=new BinaryTree();
//         Node root=tree.buildtree(nodes);
//         tree.preorder(root);
//         System.out.println(""); 
//         tree.inorder(root); 
//         System.out.println(""); 
//         tree.postorder(root);
//         System.out.println("");
//         tree.levelOrder(root);
//     }
// }


// import java.util.*;
// public class BinaryTreecode{
//     static class Node{
//         int data;
//         Node right;
//         Node left;
//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }
//     public static class BinaryTree{
//         static int idx=-1;
//         public static Node buildtree(int nodes[]){
//             idx++;
//             if(nodes[idx]==-1){
//                 return null;
//             }
//             Node newnode=new Node(nodes[idx]);
//             newnode.left=buildtree(nodes);
//             newnode.right=buildtree(nodes);
//             return newnode;
//         }
//         public static void preorder(Node root){
//             if(root == null){
//                 return;
//             }
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//     }
//     public static void main(String[] args){
//         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         BinaryTree tree=new BinaryTree();
//         Node root=tree.buildtree(nodes);
//         tree.preorder(root);

//     }
// }


// Height of a tree
public class BinaryTreecode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(height(root));
    }
}


// // Count the nodes of a tree
// public class BinaryTreecode {
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//        }
//    }
//    public static int count(Node root){
//        if(root == null) return 0;
//        int leftcount=count(root.left);
//        int rightcount=count(root.right);
//        return leftcount+rightcount+1;
//    }
//    public static void main(String[] args) {
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        System.out.println(count(root));
//    }
// }


// // Calculate the sum of nodes of a tree
// public class BinaryTreecode{
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//        }
//    }
//    public static int countsum(Node root){
//        int sum=0;
//        if(root == null) return 0;
//        int leftsum=countsum(root.left);
//        int rightsum=countsum(root.right);
//        sum+=leftsum+rightsum+root.data;
//        return sum;
//    }
//    public static void main(String[] args) {
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        System.out.println(countsum(root));
//    }
// }


// // Diameter of a tree TC : O(n^2)
// public class BinaryTreecode{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//             this.data=data;
//             this.left=null;
//         }
//     }
//     public static int height(Node root){
//         if(root == null){
//             return 0;
//         }
//         int lh=height(root.left);
//         int rh=height(root.right);
//         return Math.max(lh,rh)+1;
//     }
//     public static int diameter(Node root){
//         if(root == null){
//             return 0;
//         }
//         int leftdia=diameter(root.left);
//         int lh=height(root.left);
//         int rightdia=diameter(root.right);
//         int rh=height(root.right);
//         int selfdia=lh+rh+1;
//         return Math.max(selfdia,Math.max(leftdia,rightdia));
//     }

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);
//         root.right.left=new Node(6);
//         root.right.right=new Node(7);
//         System.out.println(diameter(root));
//     }
// }


// // Diameter of a tree TC : O(n)
// public class BinaryTreecode {
//     static class Node {
//         int data;
//         Node left, right;
//         Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }
//     static class TreeInfo {
//         int height;
//         int diameter;
//         TreeInfo(int height, int diameter) {
//             this.height = height;
//             this.diameter = diameter;
//         }
//     }
//     public static TreeInfo diameterOptimized(Node root) {
//         if (root == null) {
//             return new TreeInfo(0, 0);
//         }
//         TreeInfo left = diameterOptimized(root.left);
//         TreeInfo right = diameterOptimized(root.right);
//         int height = Math.max(left.height, right.height) + 1;
//         int selfDiameter = left.height + right.height + 1;
//         int maxDiameter = Math.max(selfDiameter, Math.max(left.diameter, right.diameter));
//         return new TreeInfo(height, maxDiameter);
//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         System.out.println(diameterOptimized(root).diameter);
//     }
// }


// // Subtree of another tree
// public class BinaryTreecode {
//     static class Node {
//         int data;
//         Node left, right;
//         Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }
//     public static boolean issubtree(Node root,Node subroot){
//         if(root == null){
//             return false;
//         }
//         if(root.data==subroot.data){
//             if(isidentical(root,subroot)){
//                 return true;
//             }
//         }
//         return issubtree(root.left,subroot) || issubtree(root.right,subroot);
//     }
//     public static boolean isidentical(Node node,Node subroot){
//         if(node==null && subroot==null){
//             return true;
//         }
//         else if(node==null ||subroot==null ||node.data!=subroot.data){
//             return false;
//         }
//         if(!isidentical(node.left,subroot.left)){
//             return false;
//         }
//         if(!isidentical(node.right,subroot.right)){
//             return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         Node subroot=new Node(2);
//         subroot.left=new Node(4);
//         subroot.right=new Node(5);
//         System.out.println(issubtree(root,subroot));
//     }
// }


// // Top View of a tree
// import java.util.*;
// public class BinaryTreecode {
//     public static class Node {
//         int data;
//         Node left, right;
//         Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }
//     public static class Info {
//         Node node;
//         int hd;
//         public Info(Node node, int hd) {
//             this.node = node;
//             this.hd = hd;
//         }
//     }
//     public static void topview(Node root) {
//         if (root == null) return;
//         Map<Integer, Node> map = new TreeMap<>(); 
//         Queue<Info> q = new LinkedList<>();
//         q.add(new Info(root, 0));
//         while (!q.isEmpty()) {
//             Info curr = q.remove();
//             if (!map.containsKey(curr.hd)) {
//                 map.put(curr.hd, curr.node);
//             }
//             if (curr.node.left != null) {
//                 q.add(new Info(curr.node.left, curr.hd - 1));
//             }
//             if (curr.node.right != null) {
//                 q.add(new Info(curr.node.right, curr.hd + 1));
//             }
//         }
//         for (Node node : map.values()) {
//             System.out.print(node.data + " ");
//         }
//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         topview(root);
//     }
// }


// // Kth level
// import java.util.*;
// public class BinaryTreecode {
//     public static class Node {
//         int data;
//         Node left, right;
//         Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }
//     public static void klevel(Node root,int level,int k){
//         if(root==null){
//             return;
//         }
//         if(level==k){
//             System.out.print(root.data+" ");
//             return;
//         }
//         klevel(root.left,level+1,k);
//         klevel(root.right,level+1,k);
//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         int k=3;
//         klevel(root,1,k);
//     }
// }


// // lowest Coomon Ancestor with Time complexity and space complexity = O(n)
// import java.util.*;
// public class BinaryTreecode {
//     public static class Node {
//         int data;
//         Node left, right;
//         Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }
//     public static boolean getpath(Node root,int n,ArrayList<Node> path){
//         if(root==null){
//             return false;
//         }
//         path.add(root);
//         if(root.data==n){
//             return true;
//         }
//         boolean foundleft=getpath(root.left,n,path);
//         boolean foundright=getpath(root.right,n,path);
//         if(foundleft || foundright){
//             return true;
//         }
//         path.remove(path.size()-1);
//         return false;
//     }
//     public static Node lca(Node root,int n1,int n2){
//         ArrayList<Node> path1=new ArrayList<>();
//         ArrayList<Node> path2=new ArrayList<>();
//         getpath(root,n1,path1);
//         getpath(root,n2,path2);
//         int i=0;
//         for(;i<path1.size() && i<path2.size();i++){
//             if(path1.get(i) != path2.get(i)){
//                 break;
//             }
//         }
//         Node lca=path1.get(i-1);
//         return lca;
//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         int n1=4,n2=7;
//         System.out.print(lca(root,n1,n2).data);
//     }
// }


// // lowest Common Ancestor with Time complexity O(n) and space complexity O(1)
import java.util.*;
public class BinaryTreecode {
    public static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node lca2(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2) return root;
        Node leftlca=lca2(root.left,n1,n2);
        Node rightlca=lca2(root.right,n1,n2);
        if(rightlca==null) return leftlca;
        if(leftlca==null) return rightlca;
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1=4,n2=7;
        System.out.print(lca2(root,n1,n2).data);
    }
}