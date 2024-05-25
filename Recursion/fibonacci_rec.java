public class fibonacci_rec {
    public static void printFib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1); // b will replace a, c will replace b and (n-1) because the number of terms will decrease from start to end
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFib(a, b, n-2); //(n-2) because we have already printed a and b so we exclude those two
    }
}
