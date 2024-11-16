import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating userManagers
        Admin admin = new Admin("Daniel", "Daniel@zealand.dk", "DanielErSej123");
        User user1 = new NotifiedUser("Tino", "Tino@zealand.dk", "Kodeord");
        User user2 = new NotifiedUser("Marcus", "Marcus@blindeinc.dk", "JegErBlindJo");

        // Creating events using factory
        Event concert = EventFactory.createEvent("concert", "Tomorrowland", "EDM concert in Belgium", "19. jul. – 28. jul. 2024", "Belgium");

        // Admin manages events
        concert.addParticipant(user1);
        concert.addParticipant(user2);
        concert.notification();
        concert.updateEvent("Summer Tomorrowland", "19. jul. – 28. jul. 2024");

        // Admin generates report
        ArrayList<Event> events = new ArrayList<>();
        events.add(concert);
        admin.generateReport(events);

        ArrayList<UserManager> userManagers = new ArrayList<>();
        userManagers.add(user2);
        admin.manageUsers(userManagers);
    }
}
