/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 4 EXERCISE 2
DUE 7/29/23
SUBMITTED 7/29/23
 */
package exercise2;

public class CargoShip extends Ship {
    //CargoShip unique variables
    private String cargoType;
    private String loadingMethod;
    private int numberOfCranes;
    private boolean contraband;
    private double cargoValue;

    //constructor
    public CargoShip(String name, String origin, String departureDate, String arrivalDate,
                     String departingPort, String arrivalPort, String owner,
                     String cargoType, String loadingMethod, int numberOfCranes,
                     boolean contraband, double cargoValue) {
        super(name, origin, departureDate, arrivalDate, departingPort, arrivalPort, owner);
        this.cargoType = cargoType;
        this.loadingMethod = loadingMethod;
        this.numberOfCranes = numberOfCranes;
        this.contraband = contraband;
        this.cargoValue = cargoValue;
    }

    public CargoShip(){
        //default constructor
    }

    @Override
    public void sail() {
        System.out.printf("\n%s%s%s%s%s","Cargo ship ",name," is transporting ",cargoType," cargo.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("\n%s%s","Cargo Type: ",cargoType);
        System.out.printf("\n%s%s","Loading Method: ",loadingMethod);
        System.out.printf("\n%s%s","Number of Cranes: ",numberOfCranes);
        System.out.printf("\n%s%s","Contraband: ",contraband);
        System.out.printf("\n%s%,.2f","Cargo Value: $",cargoValue);
    }
}
