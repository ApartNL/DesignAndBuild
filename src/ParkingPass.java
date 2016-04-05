import java.util.Random;
/**
 * Created by stefan on 4-4-2016.
 */
public class ParkingPass
{
    public boolean getParkingPass() {
        Random random = new Random();
        return random.nextBoolean();
    }
}

