// src/User.java
public class User extends UserManager {

    public User(String name, String email, String password) {
        super(name, email, password);
        UserManager.getInstance(name, email, password);
    }

    @Override
    public void manageAccount() {
        System.out.println("UserManager profile management");
    }
}