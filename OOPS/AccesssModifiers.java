package OOPS;

class Bank {
    String name;
    private String password;
    protected String PIN;

    public void setPassword(String password, String key) {

        if (key == "abc") {
            this.password = password;
        } else {
            System.out.println("Key not verified");
        }
    }

    public void getPassword(String password, String key) {

        if (key == "abc") {
            System.out.println(this.password);
        } else {
            System.out.println("Key not verified");
        }
    }

}

class HDFC extends Bank {

}

public class AccesssModifiers {
    public static void main(String[] args) {
        Bank c1 = new Bank();
        c1.setPassword("abc", "abc");

        HDFC  u1 = new HDFC(); 
        u1.PIN = 123 ; 
        System.out.println(u1.PIN);
    }
}
