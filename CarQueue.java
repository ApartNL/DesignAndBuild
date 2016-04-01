import java.util.LinkedList;
import java.util.Queue;

/**
 * @author      327278, 331048, 335364 & 343991
 * @version     01-04-2016
 */

public class CarQueue {
    private Queue<Car> queue = new LinkedList<>();

    public boolean addCar(Car car) {
        return queue.add(car);
    }

    public Car removeCar() {
        return queue.poll();
    }

}
