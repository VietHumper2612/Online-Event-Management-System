import java.util.ArrayList;

public class Event {

    private String title;
    private String description;
    private String date;
    private String location;
    private ArrayList<UserManager> participants = new ArrayList<>();

    public Event(String title, String description, String date, String location) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.location = location;
    }

    public void addParticipant(UserManager userManager){
        participants.add(userManager);
        System.out.println(userManager.getName() + " has been added to " + title);
    }

    public void updateEvent(String title, String date){
        this.title = title;
        this.date = date;
        System.out.println("Event has been updated");
    }

    public void notification(){
        for (UserManager userManager : participants){
            System.out.println("Notification sent to " + userManager.getName());
        }
    }

    public String getName() {
        return title;
    }

}
