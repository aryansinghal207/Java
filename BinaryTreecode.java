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


// // Height of a tree
// public class BinaryTreecode {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//         }
//     }
//     public static int height(Node root){
//         if(root==null){
//             return 0;
//         }
//         int lh=height(root.left);
//         int rh=height(root.right);
//         return Math.max(lh,rh)+1;
//     }

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);
//         root.right.left=new Node(6);
//         root.right.right=new Node(7);
//         System.out.println(height(root));
//     }
// }


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


