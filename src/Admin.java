import java.util.ArrayList;

class Admin extends UserManager {
    public Admin(String name, String email, String password) {
        super(name, email, password);
        UserManager.getInstance(name, email, password);
    }

    @Override
    public void manageAccount() {
        System.out.println("Admin profile management");
    }

    public void manageUsers(ArrayList<UserManager> users) {
        for (UserManager user : users) {
            System.out.println("Managing user: " + user.getName());
        }
    }

    public void generateReport(ArrayList<Event> events) {
        for (Event event : events) {
            System.out.println("Generating report for event: " + event.getName());
        }
    }
}