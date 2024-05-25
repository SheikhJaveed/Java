import java.util.*;
public class BFS {
        static class Edge {
            int src;
            int dest;
            int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
        static void createGraph(ArrayList<Edge> graph[]) {
            for(int i=0; i<graph.length; i++) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));
            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));
            graph[2].add(new Edge(2, 0, 1));

            graph[2].add(new Edge(2, 4, 1));
            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));
            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 5, 1));
            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));
            graph[5].add(new Edge(6, 5, 1));
    }

    //O(V+E)
    public static void bfs(ArrayList<Edge> graph[], int V,boolean vis[],int start) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start); //start - starting point
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!visited[curr]) {
                System.out.print(curr+" ");
                visited[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (!vis[e.dest]) {     // Check if the destination node is not visited
                        q.add(e.dest);          // Add unvisited node to the queue
                        vis[e.dest] = true;     // Mark the destination node as visited
                    }
                    
                }
            }
        }
        System.out.println();
}
    public static void main(String args[]) {
        /*
        1 --- 3
        / | \
        0 | 5 -- 6

        \ | /
        2 ---- 4
        */
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[]= new boolean[V];
        for(int i=0;i<V;i++){       //this for loop is for disconnected components in a graph
            if(vis[i]==false){
                bfs(graph, V,vis,i);
            }
        }
        System.out.println();
    }
}