import java.util.*;
public class Directed_cycle {
    static class Edge {
        int src;
        int dest;
    public Edge(int s, int d) {
        this.src = s;
        this.dest = d;
        }
    }
    
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }
    public static boolean isCycleDirected(ArrayList<Edge> graph[],boolean vis[],int curr,boolean recStack[]){
        vis[curr]=true;
        recStack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(recStack[e.dest]==true){ //cycle exists
                return true; 
            }else if(!vis[e.dest]){     //unvisited nodes
                if(isCycleDirected(graph, vis, e.dest, recStack)){
                    return true;    //if cycle exists for neighbour
                }
            }
        }
        recStack[curr]=false;
        return false;  //it means that cycle does not exists
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //if we have seperate components
        boolean vis[]=new boolean[V];
        boolean recStack[]=new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                boolean isCycle = isCycleDirected(graph, vis, 0, recStack);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
       
    }
}