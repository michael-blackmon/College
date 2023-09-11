/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 4 EXERCISE 2
DUE 7/29/23
SUBMITTED 7/29/23
 */
package exercise2;
import java.util.Arrays;

public class CruiseShip extends Ship {
    //CruiseShip unique variables
    private double ticketPrice;
    private int numberOfRooms;
    private String[] services;
    private String cruiseType;

    //constructor
    public CruiseShip(String name, String origin, String departureDate, String arrivalDate,
                      String departingPort, String arrivalPort, String owner,
                      double ticketPrice, int numberOfRooms, String[] services, String cruiseType) {
        super(name, origin, departureDate, arrivalDate, departingPort, arrivalPort, owner);
        this.ticketPrice = ticketPrice;
        this.numberOfRooms = numberOfRooms;
        this.services = services;
        this.cruiseType = cruiseType;
    }

    public CruiseShip(){
        //default constructor
    }
    @Override
    public void sail() {
        System.out.printf("\n%s%s%s%s%s","Cruise ship ",name," is sailing on a ",cruiseType," cruise.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("\n%s%,.2f","Ticket Price: $",ticketPrice);
        System.out.printf("\n%s%d","Number of Rooms: ",numberOfRooms);
        System.out.printf("\n%s%s","Services: ",Arrays.toString(services));//prints array as string formatting
        System.out.printf("\n%s%s","Cruise Type: ",cruiseType);
    }
}
