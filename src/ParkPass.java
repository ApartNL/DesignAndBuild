import java.util.Random;

/* creates a boolean called isPass that is randomly picked to be true or false. */

public class ParkPass extends Car {
public ParkPass() {}
    public Random rnd = new Random();

    public boolean isPass = rnd.nextBoolean();


    public void setPass(boolean pass) {
        isPass = pass;
    }

    public boolean isPass() {
        return isPass;
    }
}