import java.util.Scanner;

public class matrix_multiply {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][2];
        int c[][] = new int[4][4];
        System.out.println("Enter the elements of first matrix:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                 b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                int sum=0;
                for(int k=0;k<3;k++){
                    sum = sum + a[i][k]*b[k][j];
                    c[i][j] = sum; 
                }
            
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+" ");
                }
            System.out.println();
            }
        }
        
    }

