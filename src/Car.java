/**
 * @author      327278, 331048, 335364 & 343991
 * @version     01-04-2016
 */

public abstract class Car  {
    private Location location;
    private int minutesLeft;
    public static boolean isPaying;
    public static boolean isBlue;

    /**
     * Constructor for objects of class Car
     */
    public Car() {



    }

    /**
     * Method to retrieve the current Location of a Car.
     * @return  The current Location of the current Car, based on the Location class.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Method to set a new Location for a Car.
     * @param location Define a new Location for the current Car (based on an existing Location).
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Method to retrieve the parking time a parked Car still has remaining.
     * @return  The amount of parking time the current Car still has.
     */
    public int getMinutesLeft() {
        return minutesLeft;
    }

    /**
     * Method to change the parking time of a parked Car.
     * @param minutesLeft Define the amount of minutes to set minutesLeft to.
     */
    public void setMinutesLeft(int minutesLeft) {
        this.minutesLeft = minutesLeft;
    }

    /**
     * Method to check if a ticket is being paid for.
     * @return Return 'true' if being paid for, return 'false' if not being paid for.
     */
    public boolean getIsPaying() {
        return isPaying;
    }

    /**
     * Method to change the value of the isPaying boolean.
     * @param isPaying  Define the new value. True means 'Yes', False means 'No'.
     */
    public void setIsPaying(boolean isPaying) {
        this.isPaying = isPaying;
    }


    public void setIsBlue(boolean isBlue) {
        this.isBlue = isBlue;
    }

    /**
     * Method to decrease the time a parked Car has remaining.
     */
    public void tick() {
        minutesLeft--;
    }

}