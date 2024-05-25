import java.util.*;
public class arrays2d1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] num=new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched:");
        int key=sc.nextInt();     
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(num[i][j]==key){
                    System.out.println("key is found at index at (" +i+ "," +j+ ")");
                }
            }
        } 
    }
}
