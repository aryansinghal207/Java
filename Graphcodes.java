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

// // Cycle Detection in Undirected Graph
// import java.util.*;
// public class Graphcodes{
//     public static class Edge{
//         int src;
//         int des;
//         public Edge(int s , int d){
//             this.src = s;
//             this.des = d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 2));
//         graph[1].add(new Edge(1, 0));
//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));
//     }
//     public static boolean isCycle(ArrayList<Edge>[] graph){
//         boolean vis[]=new boolean[graph.length];
//         for(int i=0;i<graph.length;i++){
//             if(!vis[i]){
//                 if(isCycleUtil(graph, vis, -1, i)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static boolean isCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int par, int curr){
//         vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             if(!vis[e.des]){
//                 if(isCycleUtil(graph, vis, curr, e.des)){
//                     return true;
//                 }
//             }
//             else if(par!=e.des){
//                 return true;
//             }
//         }
//         return false; 
//     }
//     public static void main(String[] args){
//         int V=3;
//         ArrayList<Edge>[] graph=new ArrayList[V];
//         createGraph(graph);
//         System.out.println(isCycle(graph));
//     }
// }


// import java.util.*;
// public class Graphcodes{
//     static class Edge{
//         int src;
//         int des;
//         int wt;
//         public Edge(int s,int d,int w){
//             this.src=s;
//             this.des=d;
//             this.wt=w;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<>();
//         }
//         graph[0].add(new Edge(0,2,5));
//         graph[1].add(new Edge(1,0,4));
//         graph[1].add(new Edge(1,3,3));
//         graph[1].add(new Edge(1,4,6));
//         graph[2].add(new Edge(2,1,5));
//         graph[2].add(new Edge(2,0,2));
//         graph[2].add(new Edge(2,4,5));
//         graph[3].add(new Edge(3,1,5));
//         // graph[0].add(new Edge(0,1,1));
//         // graph[1].add(new Edge(1,0,1));

//         // graph[0].add(new Edge(0,2,1));
//         // graph[2].add(new Edge(2,0,1));

//         // graph[1].add(new Edge(1,3,1));
//         // graph[3].add(new Edge(3,1,1));

//         // graph[2].add(new Edge(2,4,1));
//         // graph[4].add(new Edge(4,2,1));
//     }
//     public static void bfs(ArrayList<Edge>[] graph,int st){
//         boolean[] visited=new boolean[graph.length];
//         Queue<Integer> queue=new LinkedList<>();
//         queue.add(st);
//         visited[st]=true;
//         while(!queue.isEmpty()){
//             int curr=queue.remove();
//             System.out.print(curr+" ");
//             for(Edge e:graph[curr]){
//                 if(!visited[e.des]){
//                     visited[e.des]=true;
//                     queue.add(e.des);
//                 }
//             }
//         }
//         System.out.println();
//     }
//     public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] visited){
//         visited[curr]=true;
//         System.out.print(curr+" ");
//         for(Edge e:graph[curr]){
//             if(!visited[e.des]){
//                 dfs(graph,e.des,visited);
//             }
//         }
//     }
//     public static boolean isCycle(ArrayList<Edge>[] graph,int curr,boolean[] visited,int parent){
//         visited[curr]=true;
//         for(Edge e:graph[curr]){
//             if(!visited[e.des]){
//                 if(isCycle(graph,e.des,visited,curr)) return true; 
//             }
//             else if(e.des!=parent) return true;
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         int V = 5;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         boolean[] vis = new boolean[V];
//         createGraph(graph);
//         bfs(graph, 0);
//         dfs(graph,0,vis);
//         System.out.println();
//         boolean[] visited = new boolean[V];
//         System.out.println("Cycle Present: " + isCycle(graph,0,visited,-1));
//         System.out.println();
//     }
// }

// // Bipartite and Cycle in Directed Graph
// import java.util.*;
// public class Graphcodes{
//     public static class Edge{
//         int src;
//         int des;
//         public Edge(int s,int d){
//             this.src=s;
//             this.des=d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<>();
//         }
//         // graph[0].add(new Edge(0,1));
//         // graph[0].add(new Edge(0,2));
//         // graph[1].add(new Edge(1,0));
//         // graph[1].add(new Edge(1,3));
//         // graph[2].add(new Edge(2,0));
//         // graph[2].add(new Edge(2,4));
//         // graph[3].add(new Edge(3,1));
//         // // graph[3].add(new Edge(3,4));
//         // graph[4].add(new Edge(4,2));
//         // // graph[4].add(new Edge(4,3));
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 3));
//         graph[2].add(new Edge(2, 4));
//     }
//     public static boolean isBipartite(ArrayList<Edge>[] graph){
//         int col[]=new int[graph.length];
//         for(int i=0;i<graph.length;i++){
//             col[i]=-1;
//         }
//         Queue<Integer> q=new LinkedList<>();
//         for(int i=0;i<graph.length;i++){
//             if(col[i]==-1){
//                 q.add(i);
//                 col[i]=0;
//                 while(!q.isEmpty()){
//                     int curr=q.remove();
//                     for(int j=0;j<graph[curr].size();j++){
//                         Edge e=graph[curr].get(j);
//                         if(col[e.des]==-1){
//                             int next=col[curr]==0?1:0;
//                             col[e.des]=next;
//                             q.add(e.des);
//                         }else if(col[e.des]==col[curr]) return false;
//                     }
//                 }
//             }
//         }
//         return true;
//     }
//     public static boolean isCycle(ArrayList<Edge>[] graph){
//         boolean[] vis=new boolean[graph.length];
//         boolean[] st=new boolean[graph.length];
//         for(int i=0;i<graph.length;i++){
//             if(!vis[i]){
//                 if(isCycleUtil(graph,i,vis,st)) return true;
//             }
//         }
//         return false;
//     }
//     public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean[] vis,boolean[] st){
//         st[curr]=true;vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             if(st[e.des]) return true;
//             if(!vis[e.des] && isCycleUtil(graph,e.des,vis,st)) return true;
//         }
//         st[curr]=false;
//         return false;
//     }
//     public static void main(String[] args){
//         int V=5;
//         ArrayList<Edge>[] graph=new ArrayList[V];
//         createGraph(graph);
//         System.out.println(isCycle(graph));
//         System.out.print(isBipartite(graph));
//     }
// }


// Dijkstra's Algorithm
import java.util.*;
class Pair {
    int distance;
    int node;
    Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}
class Graphcodes {
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        PriorityQueue<Pair> pq =new PriorityQueue<>((x, y) -> x.distance - y.distance);
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) dist[i] = (int)(1e9);
        dist[S] = 0;
        pq.add(new Pair(0, S));
        while (!pq.isEmpty()) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            for (int i = 0; i < adj.get(node).size(); i++) {
                int adjNode = adj.get(node).get(i).get(0);
                int edgeWeight = adj.get(node).get(i).get(1);
                if (dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); 
        int E = sc.nextInt(); 
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(new ArrayList<>(Arrays.asList(v, w)));
            adj.get(v).add(new ArrayList<>(Arrays.asList(u, w)));
        }
        int S = sc.nextInt();
        int[] result = dijkstra(V, adj, S);
        System.out.println("Shortest distances from node " + S + " :");
        for (int dist : result) {
            System.out.print(dist + " ");
        }
        System.out.println();
    }
}