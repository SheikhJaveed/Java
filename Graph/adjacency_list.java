import java.util.*;

public class adjacency_list {
    static class Edge{
        int src,dest,wt; //wt-weight
        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>(); //if we don't write this loop we get NullPointer Exception
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));

    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V]; //we created an array graph[] and for every index of array we have an arrayList and the arraylist contains the edge 
        createGraph(graph);

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);   // {2,0} -> 0 is the dest, so 0 will be printed and so on..
            System.out.println(e.dest+","+e.wt);
        }
    }
}
