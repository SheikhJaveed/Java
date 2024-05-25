import java.util.*; 
import java.math.BigInteger; 
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5_encryption {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String output = "";
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input.getBytes());
            BigInteger bigInteger = new BigInteger(1,digest);
            
            String hash = bigInteger.toString(16);
            while(hash.length() < 32){
                hash += "0" + hash;
            }

            output = hash;
            System.out.println(output);
        }
        catch(NoSuchAlgorithmException ex){
            System.out.println(ex.getMessage());
        }
    }
}