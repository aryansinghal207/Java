// // Make a graph and print the neighbours of vertex 2
// import java.util.*;
// public class Graphcodes {
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s , int d , int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     public static void main(String[] args){
//         int V=5;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         for(int i=0;i<V;i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 5));
//         graph[1].add(new Edge(1, 0, 5));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1, 3, 3));
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));
//         graph[2].add(new Edge(2, 4, 2));
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));

//         for(int i=0;i<graph[2].size();i++){
//             Edge e = graph[2].get(i);
//             System.out.println(e.dest);
//         }
//     }   
// }


// // BFS : Breadth First Search
// import java.util.*;
// public class Graphcodes {
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s , int d , int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0;i<graph.length;i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 5));
//         graph[1].add(new Edge(1, 0, 5));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1, 3, 3));
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));
//         graph[2].add(new Edge(2, 4, 2));
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));
//     }
//     public static void bfs(ArrayList<Edge>[] graph){
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[graph.length];
//         q.add(0);
//         while(!q.isEmpty()){
//             int curr = q.remove();
//             if(!vis[curr]){
//                 System.out.print(curr+" ");
//                 vis[curr] = true;
//                 for(int i=0;i<graph[curr].size();i++){
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }
//     public static void main(String[] args){
//         int V=5;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//         bfs(graph);
//     }
// }

// // DFS : Depth First Search
// import java.util.*;
// public class Graphcodes {
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s , int d , int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0;i<graph.length;i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 5));
//         graph[1].add(new Edge(1, 0, 5));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1, 3, 3));
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));
//         graph[2].add(new Edge(2, 4, 2));
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));
//     }
//     public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]){
//         System.out.print(curr+" ");
//         vis[curr] = true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest]){
//                 dfs(graph, e.dest, vis);
//             }
//         }
//     }
//     public static void main(String[] args){
//         int V=5;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//         boolean vis[] = new boolean[V];
//         dfs(graph, 0, vis);
//     }
// }

// // Has_Path
// import java.util.*;
// public class Graphcodes {
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s , int d , int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0;i<graph.length;i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 5));
//         graph[1].add(new Edge(1, 0, 5));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1, 3, 3));
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));
//         graph[2].add(new Edge(2, 4, 2));
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));
//     }
//     public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]){
//         if(src == dest){
//             return true;
//         }
//         vis[src] = true;
//         for(int i=0;i<graph[src].size();i++){
//             Edge e = graph[src].get(i);
//             if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         int V=5;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//         boolean vis[] = new boolean[V];
//         System.out.println(hasPath(graph, 0, 4, vis));
//     } 
// } 

// // Connected Components
// import java.util.*;
// public class Graphcodes {
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s , int d , int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0;i<graph.length;i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 5));
//         graph[1].add(new Edge(1, 0, 5));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1, 3, 3));
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));
//         graph[2].add(new Edge(2, 4, 2));
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));
//         graph[4].add(new Edge(4, 5, 2));
//         graph[5].add(new Edge(5, 4, 2));
//         graph[5].add(new Edge(5, 6, 3));
//         graph[6].add(new Edge(6, 5, 3));
//     }
//     public static void dfs(ArrayList<Edge>[] graph){
//         boolean vis[] = new boolean[graph.length];
//         int count = 0;
//         for(int i=0;i<graph.length;i++){
//             if(!vis[i]){
//                 System.out.print("Component "+count+" -> ");
//                 dfsutil(graph, i, vis);
//                 System.out.println();
//                 count++;
//             }
//         }
//         System.out.println("Total Components : "+count);
//     }
//     public static void dfsutil(ArrayList<Edge>[] graph, int curr, boolean vis[]){
//         System.out.print(curr+" ");
//         vis[curr] = true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest]){
//                 dfsutil(graph, e.dest, vis);
//             }
//         }
//     }
//     public static void main(String[] args){
//         int V=7;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//         dfs(graph);
//     } 
// }

// Cycle Detection in Undirected Graph
import java.util.*;
public class Graphcodes{
    public static class Edge{
        int src;
        int des;
        public Edge(int s , int d){
            this.src = s;
            this.des = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
    }
    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph, vis, -1, i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int par, int curr){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.des]){
                if(isCycleUtil(graph, vis, curr, e.des)){
                    return true;
                }
            }
            else if(par!=e.des){
                return true;
            }
        }
        return false; 
    }
    public static void main(String[] args){
        int V=3;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}