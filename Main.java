import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        double value = 234.5623;
        //formatting a float or double value
        System.out.println(new DecimalFormat("0.00").format(25.32*12.45));
        System.out.printf("Interest of saver 1 is %.2f\n",value);
    }
}
