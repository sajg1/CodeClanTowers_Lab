import java.util.HashMap;

public class Booking {

//      private HashMap<BedRoom, Integer> booking;
    private BedRoom bedRoom;
    private int numOfNights;

    public Booking(BedRoom bedRoom, int numOfNights) {
        this.bedRoom = bedRoom;
        this.numOfNights = numOfNights;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public int getNumOfNights() {
        return numOfNights;
    }
}
