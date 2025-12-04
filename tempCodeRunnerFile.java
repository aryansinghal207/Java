
        int[] result = dijkstra(V, adj, S);
        System.out.println("Shortest distances from node " + S + " :");
        for (int dist : result) {
            System.out.print(dist + " ");