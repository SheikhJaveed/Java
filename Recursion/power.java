public class power {
    public static int calcPower(int x, int n){
        if(n==0){  //base case 1
            return 1;
        }
        if(x==0){   //base case 2
            return 0;
        }
        int xPowmn1 = calcPower(x, n-1); //calculates x^(n-1)
        int xPow = x*xPowmn1;       // x*(x^(n-1)) this will give x^n value
        return xPow;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calcPower(x, n);
        System.out.println("The value of x^n is "+ans);
    }
}
