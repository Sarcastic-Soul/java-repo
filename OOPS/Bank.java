class Account{
    public String name;
    protected String email;
    private String Password;
    
    //Getter
    public String getPassword() {
        return this.Password;
    }
    //Setter
    public void setPassword(String pass) {
        this.Password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Anish";
        acc1.email = "anishisbusy@gmail.com";
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
    }
}
