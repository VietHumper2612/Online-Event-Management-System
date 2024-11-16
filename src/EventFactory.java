public class EventFactory {
    public static Event createEvent(String type, String title, String description, String date, String location){
        switch (type.toLowerCase()){
            case "concert":
                return new Event(title + " Concert", description, date, location);
            case "conference":
                return new Event(title + " Conference", description, date, location);
            case "Workshop":
                return new Event(title + " Workshop", description, date, location);
            default:
                return null;
        }
    }
}
