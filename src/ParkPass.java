import java.util.Random;

/* creates a boolean called isPass that is randomly picked to be true or false. */

public interface ParkPass {

    public Random rnd = new Random();

    public boolean isPass = rnd.nextBoolean();
}