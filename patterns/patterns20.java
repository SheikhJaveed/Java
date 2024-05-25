public class patterns20 {
    public static void main(String[] args) {
        int n=5;
        //k pattern
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
