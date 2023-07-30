/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 4 EXERCISE 2
DUE 7/29/23
SUBMITTED 7/29/23
 */
package exercise2;

public class Ship {
    //all ship variables
    protected String name;
    private String origin;
    private String departureDate;
    private String arrivalDate;
    private String departingPort;
    private String arrivalPort;
    private String owner;

    //constructor
    public Ship(String name, String origin, String departureDate, String arrivalDate,
                String departingPort, String arrivalPort, String owner) {
        this.name = name;
        this.origin = origin;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departingPort = departingPort;
        this.arrivalPort = arrivalPort;
        this.owner = owner;
    }

    public Ship(){
        //default constructor
    }

    public void sail() {
        System.out.printf("\n%s%s%s%s%s%s",name," is sailing from ",departingPort," to ",arrivalPort,".");
    }

    public void displayDetails() {
        System.out.printf("\n%s%s","Name: ",name);
        System.out.printf("\n%s%s","Origin: ",origin);
        System.out.printf("\n%s%s","Departure Date: ",departureDate);
        System.out.printf("\n%s%s","Arrival Date: ",arrivalDate);
        System.out.printf("\n%s%s","Departing Port: ",departingPort);
        System.out.printf("\n%s%s","Arrival Port: ",arrivalPort);
        System.out.printf("\n%s%s","Owner: ",owner);
    }
}


