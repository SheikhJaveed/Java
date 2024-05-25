public class recursion1{
    public static void printNum(int n){
        if(n==6){   //base condition - like terminating condition
            return;     //exits
        }
        System.out.println(n);
        printNum(n+1);    //recursion
    }
    public static void main(String[] args) {
        int n=1;
        printNum(n);
    }
}