package src;

/**
 * Created by stefan on 4-4-2016.
 */
public class ParkingPass
{
    private boolean ParkingPass;

    /**
     * Method to check if the customer has an parkingpass.
     * @return Return 'true' if he has an parking pass, return 'false' if he does pay with an ticket
     */
    public boolean hasParkingPass()
    {
        return ParkingPass;
    }

    /**
     * Method to change the value of the ParkingPass boolean.
     * @param ParkingPass  Define the new value. True means 'Yes', False means 'No'.
     */
    public void sethasParkingPass(boolean ParkingPass)
    {
        this.ParkingPass = ParkingPass;
    }


}

