import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private BedRoom bedRoom1;

    @Before
    public void before() {
        bedRoom1 = new BedRoom("1","Single", 1);
        booking = new Booking(bedRoom1, 3);
    }

    @Test
    public void hasBedRoom() {
        assertEquals(bedRoom1, booking.getBedRoom());
    }

    @Test
    public void hasNumOfNights() {
        assertEquals(3, booking.getNumOfNights());
    }
}
