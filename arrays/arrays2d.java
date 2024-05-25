import java.util.*;
public class arrays2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] num=new int[r][c];
        System.out.println("Enter the elements:");
        //input
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("Entered elements are:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(num[i][j] + " ");
            }
        System.out.println();
        }
    }
}
