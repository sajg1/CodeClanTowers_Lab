import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<BedRoom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public String getName() {
        return name;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addBedRoom(BedRoom bedRoom) {
        this.bedrooms.add(bedRoom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuestToBedroom(Guest guest, BedRoom bedRoom) {
        if (this.bedrooms.contains(bedRoom) && bedRoom.guestCount() < bedRoom.getCapacity()) {
            bedRoom.addGuest(guest);
        }

    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        if (this.conferenceRooms.contains(conferenceRoom) && conferenceRoom.getCapacity() > conferenceRoom.guestCount())
        {
            conferenceRoom.addGuest(guest);
        }
    }

    public void checkOutGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }

    public Booking bookBedRoom(BedRoom bedRoom, int numOfNights) {
        return new Booking(bedRoom, numOfNights);
    }
}
