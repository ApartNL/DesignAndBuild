
/**
 * TODO Write a description of class CarPark here.
* 
 * @author Arthur Perton and Harald Rietdijk
 * @version 2015.11.27
 */
public class CarPark
{
    private Car[][][] cars; 
   
    /**
     * Constructor for objects of class CarPark
     */
    public CarPark(int floors, int rows, int places)
    {
        cars = new Car[floors][rows][places];
    }

    /**
     * TODO add description
     */
    public CarType getCarAt(int floor, int row, int place) 
    {
        // TODO check bounds?
        return cars[floor][row][place];
    }
}
