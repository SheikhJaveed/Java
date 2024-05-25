public class factorial_rec {
    public static void calcFactorial(int n,int fact){
        if(n==0){   
            System.out.println("The factorial is "+fact);
            return;
        }
        fact *= n;
        calcFactorial(n-1, fact);
        // System.out.println(n); //prints numbers from 1 to 5 because while returning it will come down from n=1 to n=5

    }
    public static void main(String[] args) {
        int n=5;
        calcFactorial(n, 1);
    }
}
