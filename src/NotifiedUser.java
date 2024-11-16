class NotifiedUser extends User implements Observer {
    public NotifiedUser(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + getName() + ": " + message);
    }
}