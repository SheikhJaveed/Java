
class Account{
    public String name;
    protected String email;
    private String password;

    //we can access private things by using getters and setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Apna college";
        a1.email = "apnacollege@gmail.com";
        // a1.password = "abcd"; password cannot be accessed here because we declared it as private
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());

        //encapsulation - data + function
        /*data hiding is the process of protecting members of the class from unintended changes whereas ,
        abstraction is hiding the implementation details and showing only important or useful parts to the user*/
    }
}