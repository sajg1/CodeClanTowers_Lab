import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> conferenceRoomGuests;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.conferenceRoomGuests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int guestCount() {
        return this.conferenceRoomGuests.size();
    }

    public void addGuest(Guest guest) {
        this.conferenceRoomGuests.add(guest);
    }

    public void removeGuest(Guest guest) {

        this.conferenceRoomGuests.remove(guest);
    }
}
