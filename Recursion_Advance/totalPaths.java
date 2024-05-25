
public class totalPaths {
    public static int countpaths(int i, int j,int n,int m){
        if(i==n || j==m){   //last cell
            return 0;
        }
        if(i == n-1 && j == m-1){  //does not move
            return 1;
        }
        
        int downPaths = countpaths(i+1, j, n, m); //downward paths
        int rightPaths = countpaths(i, j+1, n, m); //right paths

        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        
        int totPaths = countpaths(0, 0, n, m);
        System.out.println("The total paths are "+totPaths);
    }
}
