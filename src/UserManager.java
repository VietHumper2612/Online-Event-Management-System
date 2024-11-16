abstract class UserManager {
    private static UserManager instance;
    private String name;
    private String email;
    private String password;

    protected UserManager(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static UserManager getInstance(String name, String email, String password) {
        if (instance == null) {
            instance = new UserManager(name, email, password) {
                @Override
                public void manageAccount() {
                }
            };
        }
        return instance;
    }

    public abstract void manageAccount();

    protected String getName() {
        return name;
    }
}