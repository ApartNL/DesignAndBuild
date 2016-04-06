import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author      327278, 331048, 335364 & 343991
 * @version     01-04-2016
 */

public class SimulatorView extends JFrame {
    private CarParkView carParkView;
    private int numberOfFloors;
    private int numberOfRows;
    private int numberOfPlaces;
    private Car[][][] cars;
    private JButton button1;
    private JButton button2;
    private JLabel label;
    private Simulator sim;
    private Car cr;

    public SimulatorView(int numberOfFloors, int numberOfRows, int numberOfPlaces, Simulator sim) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfRows = numberOfRows;
        this.numberOfPlaces = numberOfPlaces;
        this.sim = sim;
        cars = new Car[numberOfFloors][numberOfRows][numberOfPlaces];

        carParkView = new CarParkView();

        button1 = new JButton("Run 1 time");
        button2 = new JButton("Run 100 times");
        label = new JLabel("Test bericht");

        event a = new event();
        button1.addActionListener(a);

        event2 b = new event2();
        button2.addActionListener(b);

        Container contentPane = getContentPane();
        //contentPane.add(stepLabel, BorderLayout.NORTH);
        contentPane.add(carParkView, BorderLayout.CENTER);
        contentPane.add(button1,BorderLayout.NORTH);
        contentPane.add(button2,BorderLayout.SOUTH);
        //contentPane.add(population, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        updateView();
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent a){
            sim.singletick();
        }
    }


    public class event2 implements ActionListener {
        public void actionPerformed(ActionEvent b){
            Thread queryThread = new Thread(); {
            sim.hundredtick();
                }
        }
    }


    public void updateView() {
        carParkView.updateView();
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public Car getCarAt(Location location) {
        if (!locationIsValid(location)) {
            return null;
        }
        return cars[location.getFloor()][location.getRow()][location.getPlace()];
    }

    public boolean setCarAt(Location location, Car car) {
        if (!locationIsValid(location)) {
            return false;
        }
        Car oldCar = getCarAt(location);
        if (oldCar == null) {
            cars[location.getFloor()][location.getRow()][location.getPlace()] = car;
            car.setLocation(location);
            return true;
        }
        return false;
    }

    public Car removeCarAt(Location location) {
        if (!locationIsValid(location)) {
            return null;
        }
        Car car = getCarAt(location);
        if (car == null) {
            return null;
        }
        cars[location.getFloor()][location.getRow()][location.getPlace()] = null;
        car.setLocation(null);
        return car;
    }

    public Location getFirstFreeLocation() {
        for (int floor = 0; floor < getNumberOfFloors(); floor++) {
            for (int row = 0; row < getNumberOfRows(); row++) {
                for (int place = 0; place < getNumberOfPlaces(); place++) {
                    Location location = new Location(floor, row, place);
                    if (getCarAt(location) == null) {
                        return location;
                    }
                }
            }
        }
        return null;
    }

    public Car getFirstLeavingCar() {
        for (int floor = 0; floor < getNumberOfFloors(); floor++) {
            for (int row = 0; row < getNumberOfRows(); row++) {
                for (int place = 0; place < getNumberOfPlaces(); place++) {
                    Location location = new Location(floor, row, place);
                    Car car = getCarAt(location);
                    if (car != null && car.getMinutesLeft() <= 0 && !car.getIsPaying()) {
                        return car;
                    }
                }
            }
        }
        return null;
    }

    public void tick() {
        for (int floor = 0; floor < getNumberOfFloors(); floor++) {
            for (int row = 0; row < getNumberOfRows(); row++) {
                for (int place = 0; place < getNumberOfPlaces(); place++) {
                    Location location = new Location(floor, row, place);
                    Car car = getCarAt(location);
                    if (car != null) {
                        car.tick();
                    }
                }
            }
        }
    }

    private boolean locationIsValid(Location location) {
        int floor = location.getFloor();
        int row = location.getRow();
        int place = location.getPlace();
        if (floor < 0 || floor >= numberOfFloors || row < 0 || row > numberOfRows || place < 0 || place > numberOfPlaces) {
            return false;
        }
        return true;
    }

    private class CarParkView extends JPanel {

        private Dimension size;
        private Image carParkImage;

        /**
         * Constructor for objects of class CarPark
         */
        public CarParkView() {
            size = new Dimension(0, 0);
        }

        /**
         * Overridden. Tell the GUI manager how big we would like to be.
         */
        public Dimension getPreferredSize() {
            return new Dimension(800, 500);
        }

        /**
         * Overriden. The car park view component needs to be redisplayed. Copy the
         * internal image to screen.
         */
        public void paintComponent(Graphics g) {
            if (carParkImage == null) {
                return;
            }

            Dimension currentSize = getSize();
            if (size.equals(currentSize)) {
                g.drawImage(carParkImage, 0, 0, null);
            }
            else {
                // Rescale the previous image.
                g.drawImage(carParkImage, 0, 0, currentSize.width, currentSize.height, null);
            }
        }

       // public void updateView() {
            // Create a new car park image if the size has changed.
         //   if (!size.equals(getSize())) {
           //     size = getSize();
             //   carParkImage = createImage(size.width, size.height);
           // }
           // Graphics graphics = carParkImage.getGraphics();
           // for(int floor = 0; floor < getNumberOfFloors(); floor++) {
            //    for(int row = 0; row < getNumberOfRows(); row++) {
              //      for(int place = 0; place < getNumberOfPlaces(); place++) {
                //        Location location = new Location(floor, row, place);
                  //      Car car = getCarAt(location);
                    //    Color color = car == null ? Color.white : Color.red;
                  //      drawPlace(graphics, location, color);
                 //   }
             //   }
          //  }
        //    repaint();
//        }

        /**
         * Paint a place on this car park view in a given color.
         */
  //      private void drawPlace(Graphics graphics, Location location, Color color) {
    //        graphics.setColor(color);
      //      graphics.fillRect(
        //            location.getFloor() * 260 + (1 + (int)Math.floor(location.getRow() * 0.5)) * 75 + (location.getRow() % 2) * 20,
          //          60 + location.getPlace() * 10,
            //        20 - 1,
              //      10 - 1); // TODO use dynamic size or constants
    //    }
   // }

//}


        public void updateView() {
            /* Create a new car park image if the size has changed.
        	   added 2 colours to show the difference between the three different customer types.*/
            if (!size.equals(getSize())) {
                size = getSize();
                carParkImage = createImage(size.width, size.height);
            }
            Graphics graphics = carParkImage.getGraphics();
            for(int floor = 0; floor < getNumberOfFloors(); floor++) {
                for(int row = 0; row < getNumberOfRows(); row++) {
                    for(int place = 0; place < getNumberOfPlaces(); place++) {
                        Location location = new Location(floor, row, place);
                        Car car = getCarAt(location);
                        Color color; if(car == null) {
                            color = Color.white;
                        } else if(car instanceof AdHocCar && car.getIsPaying() == true)
                        {
                            color = Color.red;
                        } else if (car instanceof ParkPass){
                            color = Color.blue;
                        } else {
                            color = Color.black;
                        }


                                //(ParkPass.isPass ? Color.blue : Car.isPaying ?  Color.red: Color.black;   /*: isReservation == true ? Color.green*/;
                        drawPlace(graphics, location, color);
                    }
                }
            }
            repaint();
        }

        /**
         * Paint a place on this car park view in a given color.
         */
        private void drawPlace(Graphics graphics, Location location, Color color) {
            graphics.setColor(color);
            graphics.fillRect(
                    location.getFloor() * 260 + (1 + (int)Math.floor(location.getRow() * 0.5)) * 75 + (location.getRow() % 2) * 20,
                    60 + location.getPlace() * 10,
                    20 - 1,
                    10 - 1); // TODO use dynamic size or constants
        }
    }

}
