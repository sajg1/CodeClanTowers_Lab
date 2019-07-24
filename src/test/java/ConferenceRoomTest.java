import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;

    @Before
    public void setUp() {

        conferenceRoom = new ConferenceRoom("Trump Suite", 10);
        guest1 = new Guest("Stephen");
    }

    @Test
    public void coneferenceRoomHasName() {
        assertEquals("Trump Suite", conferenceRoom.getName());
    }

    @Test
    public void coneferenceRoomHasCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void coneferenceRoomIsEmptyAtStart() {
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
        conferenceRoom.removeGuest(guest1);
        assertEquals(0, conferenceRoom.guestCount());
    }
}
