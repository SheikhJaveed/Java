class Calculate{
    public void calc(int n){
        System.out.println("Square = "+ (n*n));
    }
    public void calc(double n){
        System.out.println("Cube ="+ (n*n*n));
    }
}

public class square_cube {
    public static void main(String[] args) {
        Calculate sq = new Calculate();
        Calculate cube = new Calculate();
        sq.calc(12);
        cube.calc(2.0);
    }
}
