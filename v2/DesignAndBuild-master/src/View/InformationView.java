package View;

import Model.Simulator;

import javax.swing.*;
import java.awt.*;

public class InformationView extends AbstractView {

    private static final String LABEL_TOTAL_AMOUNT_OF_CARS      = "Total cars :";
    private static final String LABEL_CARS_WITH_PARKING_PASS    = "Parking pass cars :";
    private static final String LABEL_CARS_WITH_TICKETS         = "Cars with tickets :";
    private static final String LABEL_AMOUNT_OF_CARS_IN_ENTRANCE_QUEUE  = "Entrance queue :";
    private static final String LABEL_AMOUNT_OF_CARS_IN_EXIT_QUEUE      = "Exit queue :";
    private static final String LABEL_AMOUNT_OF_PARKPASS_CARS_IN_ENTRANCE_QUEUE  = "Parking pass entrance queue :";
    private static final String LABEL_AMOUNT_OF_PARKPASS_CARS_IN_EXIT_QUEUE      = "Parking pass exit queue :";
    private static final String LABEL_AMOUNT_OF_RESERVATION_CARS_IN_ENTRANCE_QUEUE  = "Reservation entrance queue :";
    private static final String LABEL_AMOUNT_OF_RESERVATION_CARS_IN_EXIT_QUEUE      = "Reservation exit queue :";
    private static final String LABEL_TOTAL_AMOUNT_OF_REVENUE                       = "Total revenue :";
    private static final String LABEL_AMOUNT_OF_REVENUE_TICKET_CARS                 = "Ticket car revenue :";
    private static final String LABEL_AMOUNT_OF_REVENUE_PARKPASS_CARS               = "Parkpass car revenue :";
    private static final String LABEL_AMOUNT_OF_REVENUE_RESERVATION_CARS            = "Reservation car revenue :";

    private JLabel label_totalAmountOfCars;
    private JLabel label_carsWithParkingPass;
    private JLabel label_carsWithTickets;
    private JLabel label_amountOfCarsInEntranceQueue;
    private JLabel label_amountOfCarsInExitQueue;
    private JLabel label_amountOfReservationCarsInEntranceQueue;
    private JLabel label_amountOfReservationCarsInExitQueue;
    private JLabel label_amountOfParkpassCarsInEntranceQueue;
    private JLabel label_amountOfParkpassCarsInExitQueue;
    private JLabel label_totalAmountOfRevenue;
    private JLabel label_amountOfTicketCarRevenue;
    private JLabel label_amountOfParkpassCarRevenue;
    private JLabel label_amountOfReservationCarRevenue;

    private JLabel totalAmountOfCars;
    private JLabel carsWithParkingPass;
    private JLabel carsWithTickets;
    private JLabel amountOfCarsInEntranceQueue;
    private JLabel amountOfCarsInExitQueue;
    private JLabel amountOfReservationCarsInEntranceQueue;
    private JLabel amountOfReservationCarsInExitQueue;
    private JLabel amountOfParkpassCarsInEntranceQueue;
    private JLabel amountOfParkpassCarsInExitQueue;
    private JLabel totalAmountOfRevenue;
    private JLabel amountOfTicketCarRevenue;
    private JLabel amountOfParkpassCarRevenue;
    private JLabel amountOfReservationCarRevenue;

    public InformationView(Simulator sim) {
        super(sim);

        this.label_totalAmountOfCars = new JLabel(InformationView.LABEL_TOTAL_AMOUNT_OF_CARS);
        this.label_carsWithParkingPass = new JLabel(InformationView.LABEL_CARS_WITH_PARKING_PASS);
        this.label_carsWithTickets = new JLabel(InformationView.LABEL_CARS_WITH_TICKETS);
        this.label_amountOfCarsInEntranceQueue = new JLabel(InformationView.LABEL_AMOUNT_OF_CARS_IN_ENTRANCE_QUEUE);
        this.label_amountOfCarsInExitQueue = new JLabel(InformationView.LABEL_AMOUNT_OF_CARS_IN_EXIT_QUEUE);
        this.label_amountOfReservationCarsInEntranceQueue = new JLabel(InformationView.LABEL_AMOUNT_OF_RESERVATION_CARS_IN_ENTRANCE_QUEUE);
        this.label_amountOfReservationCarsInExitQueue = new JLabel(InformationView.LABEL_AMOUNT_OF_RESERVATION_CARS_IN_EXIT_QUEUE);
        this.label_amountOfParkpassCarsInEntranceQueue = new JLabel(InformationView.LABEL_AMOUNT_OF_PARKPASS_CARS_IN_ENTRANCE_QUEUE);
        this.label_amountOfParkpassCarsInExitQueue = new JLabel(InformationView.LABEL_AMOUNT_OF_PARKPASS_CARS_IN_EXIT_QUEUE);
        this.label_totalAmountOfRevenue = new JLabel(InformationView.LABEL_TOTAL_AMOUNT_OF_REVENUE);
        this.label_amountOfTicketCarRevenue = new JLabel(InformationView.LABEL_AMOUNT_OF_REVENUE_TICKET_CARS);
        this.label_amountOfParkpassCarRevenue = new JLabel(InformationView.LABEL_AMOUNT_OF_REVENUE_PARKPASS_CARS);
        this.label_amountOfReservationCarRevenue = new JLabel(InformationView.LABEL_AMOUNT_OF_REVENUE_RESERVATION_CARS);

        this.totalAmountOfCars              = new JLabel("0");
        this.carsWithParkingPass            = new JLabel("0");
        this.carsWithTickets                = new JLabel("0");
        this.amountOfCarsInEntranceQueue    = new JLabel("0");
        this.amountOfCarsInExitQueue        = new JLabel("0");
        this.amountOfReservationCarsInEntranceQueue    = new JLabel("0");
        this.amountOfReservationCarsInExitQueue        = new JLabel("0");
        this.amountOfParkpassCarsInEntranceQueue    = new JLabel("0");
        this.amountOfParkpassCarsInExitQueue        = new JLabel("0");

        this.totalAmountOfRevenue       = new JLabel("0");
        this.amountOfTicketCarRevenue = new JLabel("0");
        this.amountOfParkpassCarRevenue = new JLabel("0");
        this.amountOfReservationCarRevenue = new JLabel("0");

        this.setLayout(new GridLayout(13,2));

        this.add(label_totalAmountOfCars);
        this.add(totalAmountOfCars);
        this.add(label_carsWithParkingPass);
        this.add(carsWithParkingPass);
        this.add(label_carsWithTickets);
        this.add(carsWithTickets);
        this.add(label_amountOfCarsInEntranceQueue);
        this.add(amountOfCarsInEntranceQueue);
        this.add(label_amountOfCarsInExitQueue);
        this.add(amountOfCarsInExitQueue);
        this.add(label_amountOfParkpassCarsInEntranceQueue);
        this.add(amountOfParkpassCarsInEntranceQueue);
        this.add(label_amountOfParkpassCarsInExitQueue);
        this.add(amountOfParkpassCarsInExitQueue);
        this.add(label_amountOfReservationCarsInEntranceQueue);
        this.add(amountOfReservationCarsInEntranceQueue);
        this.add(label_amountOfReservationCarsInExitQueue);
        this.add(amountOfReservationCarsInExitQueue);
        this.add(label_totalAmountOfRevenue);
        this.add(totalAmountOfRevenue);
        this.add(label_amountOfTicketCarRevenue);
        this.add(amountOfTicketCarRevenue);
        this.add(label_amountOfParkpassCarRevenue);
        this.add(amountOfParkpassCarRevenue);
        this.add(label_amountOfReservationCarRevenue);
        this.add(amountOfReservationCarRevenue);

    }

    @Override
    public void updateView() {
        this.sim.countAllCars();

        this.totalAmountOfCars.setText(sim.getTotalNumberOfCars() + " cars");
        this.carsWithParkingPass.setText(sim.getTotalNumberOfParkingPassCars() + " cars");
        this.carsWithTickets.setText(sim.getTotalNumberOfTicketCars() + " cars");
        this.amountOfCarsInEntranceQueue.setText(sim.getEntranceCarQueueAmount() + " cars");
        this.amountOfCarsInExitQueue.setText(sim.getExitCarQueueAmount() + " cars");
        this.amountOfParkpassCarsInEntranceQueue.setText(sim.getParkingPassCarsEntranceCarQueueAmount() + " cars");
        this.amountOfParkpassCarsInExitQueue.setText(sim.getParkingpassCarsExitQueueAmount() + " cars");
        this.amountOfReservationCarsInEntranceQueue.setText(sim.getReservationCarsEntranceQueueAmount() + " cars");
        this.amountOfReservationCarsInExitQueue.setText(sim.getReservationCarsExitCarQueue() + " cars");
        this.totalAmountOfRevenue.setText(sim.getTotalRevenue() + " revenue");
        this.amountOfTicketCarRevenue.setText(sim.getTicketCarRevenue() + " revenue");
        this.amountOfParkpassCarRevenue.setText(sim.getParkpassCarRevenue()+ " revenue");
        this.amountOfReservationCarRevenue.setText(sim.getReservationCarRevenue() + " revenue");
    }
}
