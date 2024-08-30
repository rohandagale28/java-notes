package bank;

class Account {
    public String name;
    protected String email;
    private String password; // getter and setters

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]) {
        Account account = new Account();
        account.name = "rohan";
        account.email = "rohan@gmail.com";
        account.setPassword("pass");
        System.out.println(account.getPassword());
    }
}