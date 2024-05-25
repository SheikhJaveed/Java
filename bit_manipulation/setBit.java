public class setBit {
    public static void main(String[] args) {
        int n=5; //5 in binary is 0101
        int pos=1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
