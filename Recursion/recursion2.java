public class recursion2 {
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println("The sum is "+sum);
            return;
        }
        sum +=i;
        printSum(i+1, n, sum); //we are updating all the values, (i+1) increases the count of numbers, n remains same and sum values updates everytime
        System.out.println(i); //numbers from 9 to 1 will be printed as we are returning from the highest level of the stack to first level
    }
    public static void main(String[] args) {
        printSum(1, 10, 0);
    }
}
