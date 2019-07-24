import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    private BedRoom bedroom1;
    private BedRoom bedroom2;
    private Guest guest1;


    @Before
    public void setUp() {
        bedroom1 = new BedRoom("1", "Double", 2);
        bedroom2 = new BedRoom("2", "Single", 1);
        guest1 = new Guest("Stephen");
    }

    @Test
    public void hasNumber() {
        assertEquals("1", bedroom1.getNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2 , bedroom1.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals("Double", bedroom1.getType());
    }

    @Test
    public void hasNoGuestsAtStart() {
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.guestCount());
    }

}
