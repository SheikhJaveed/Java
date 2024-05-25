public class random {
    public static int countX(int L, int R, int X) {
        int i,n,count=0;
        int sum=0;
        for(i=L+1;i<R;i++){
            n=i/10;
            if(n>10){
                while(n!=0){
                    int rem = n%10;
                    sum+=rem;
                    n/=10;
                }
                return sum;
            }
            else{
                ++count;
            }
        }
        return sum+count;
    }
    public static void main(String[] args) {
        int X = countX(10,50,1);
        System.out.println(X);
    }
}
