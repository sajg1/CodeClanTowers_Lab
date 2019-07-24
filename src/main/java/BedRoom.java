import java.util.ArrayList;

public class BedRoom {
    private String number;
    private String type;
    private int capacity;
    private ArrayList<Guest> bedRoomGuests;

    public BedRoom(String number, String type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
        this.bedRoomGuests = new ArrayList<Guest>();
    }

    public String getNumber() {

        return number;
    }

    public String getType() {

        return type;
    }

    public int getCapacity() {

        return capacity;
    }

    public int guestCount() {

        return this.bedRoomGuests.size();
    }

    public void addGuest(Guest guest) {
        this.bedRoomGuests.add(guest);
    }

    public void removeGuest(Guest guest) {

        this.bedRoomGuests.remove(guest);
    }
}




