public class patterns19 {
    public static void main(String[] args) {
        int n=4;
        //reverse number triangle
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        System.out.println();
        }
    }
}
