
public class guest_invite {
    public static int guestCall(int n){
        if(n<=1){
            return 1;
        }

        //single invite
        int ways1 = guestCall(n-1);
        //pair invite
        int ways2 = (n-1)*guestCall(n-2);
        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(guestCall(n));
    }
}
