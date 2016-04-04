import java.util.LinkedList;
import java.util.Queue;

/**
 * @author      327278, 331048, 335364 & 343991
 * @version     01-04-2016
 */

public class CarQueue {
    /**
     * Constructor for the class CarQueue that is initialized with objects of the class Car
     */
    private Queue<Car> queue = new LinkedList<>();

    /**
     * Add a Car to the CarQueue.
     * @param car Define the name of the car.
     * @return Add car to queue.
     */
    public boolean addCar(Car car) {
        return queue.add(car);
    }

    /**
     * Remove a Car from the CarQueue.
     * @return Remove the first object in the list.
     */
    public Car removeCar() {
        return queue.poll();
    }

}
