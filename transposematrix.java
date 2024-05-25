import java.util.*;
public class transposematrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.println(matrix[i][j]+" ");
            }
        }
    }
}
