import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private BedRoom bedRoom1;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;
    private Guest guest2;
    private Booking booking1;

    @Before
    public void before() {
        hotel = new Hotel("CodeClanTowers");
        bedRoom1 = new BedRoom("1", "Single",1);
        conferenceRoom1 = new ConferenceRoom("Trump Suite", 1);
        guest1 = new Guest("Donald");
        guest2 = new Guest("Hilary");
//        booking1 = new Booking(bedRoom1, 3);

    }

    @Test
    public void hasName() {
        assertEquals("CodeClanTowers", hotel.getName());
    }

    @Test
    public void hasNoBedroomsAtStart() {
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void hasNoConferenceRoomsAtStart() {
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void canAddBedRoom() {
        hotel.addBedRoom(bedRoom1);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInGuestToBedroom() {
        hotel.addBedRoom(bedRoom1);
        assertEquals(1, hotel.bedroomCount());
        hotel.checkInGuestToBedroom(guest1, bedRoom1);
        assertEquals(1, bedRoom1.guestCount());
    }

    @Test
    public void cannotCheckIntoBedRoomBeyondCapacity() {
        hotel.addBedRoom(bedRoom1);
        assertEquals(1, hotel.bedroomCount());
        hotel.checkInGuestToBedroom(guest1, bedRoom1);
        hotel.checkInGuestToBedroom(guest2, bedRoom1);
        assertEquals(1, bedRoom1.guestCount());

    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.conferenceRoomCount());
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.guestCount());

    }

    @Test
    public void cannotCheckIntoConferenceRoomBeyondCapacity() {
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.conferenceRoomCount());
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        hotel.checkInGuestToConferenceRoom(guest2, conferenceRoom1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.conferenceRoomCount());
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        hotel.checkOutGuestFromConferenceRoom(guest1, conferenceRoom1);
        assertEquals(0, conferenceRoom1.guestCount());
    }

    @Test
    public void canBookABedRoom() {
        hotel.addBedRoom(bedRoom1);
        assertEquals(1, hotel.bedroomCount());
        booking1 = hotel.bookBedRoom(bedRoom1, 3);
        assertEquals(bedRoom1, booking1.getBedRoom());
        assertEquals(3, booking1.getNumOfNights());
    }

}
