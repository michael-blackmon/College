/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 4 EXERCISE 2
DUE 7/29/23
SUBMITTED 7/29/23
 */
/*
                                                        TEST CASE EXERCISE 2
Big Boy Express is sailing from California to Portugal.
Name: Big Boy Express
Origin: USA
Departure Date: 7/29/23
Arrival Date: 8/15/23
Departing Port: California
Arrival Port: Portugal
Owner: Big Boys Shipping
--------------------------
Cargo ship Largest Boy is transporting Containers cargo.
Name: Largest Boy
Origin: Italy
Departure Date: 7/31/23
Arrival Date: 9/10/23
Departing Port: Portofino
Arrival Port: San Francisco
Owner: Bigger Than Big Boys Shipping
Cargo Type: Containers
Loading Method: Crane
Number of Cranes: 4
Contraband: false
Cargo Value: $1,000,000.00
--------------------------
Cruise ship Dreams Come True is sailing on a Luxury cruise.
Name: Dreams Come True
Origin: Hawaii
Departure Date: 7/28/23
Arrival Date: 8/5/23
Departing Port: Honolulu
Arrival Port: Juno
Owner: Dream Cruise Lines
Ticket Price: $2,000.00
Number of Rooms: 800
Services: [Pool, Buffet, Gym]
Cruise Type: Luxury
--------------------------
Process finished with exit code 0
 */
package exercise2;

//main start of program
public class ShipDriver {
    public static void main(String[] args) {
        //instantiate array object of Ship class
        Ship[] ships = new Ship[3];

        //creating 3 ship arrays
        ships[0] = new Ship("Big Boy Express", "USA", "7/29/23", "8/15/23",
                "California", "Portugal", "Big Boys Shipping");
        ships[1] = new CargoShip("Largest Boy", "Italy", "7/31/23", "9/10/23",
                "Portofino", "San Francisco", "Bigger Than Big Boys Shipping",
                "Containers", "Crane", 4, false, 1000000.0);
        ships[2] = new CruiseShip("Dreams Come True", "Hawaii", "7/28/23", "8/5/23",
                "Honolulu", "Juno", "Dream Cruise Lines",
                2000.0, 800, new String[]{"Pool", "Buffet", "Gym"}, "Luxury");

        for (Ship ship : ships) {
            //to display polymorphism
            ship.sail(); //sail() invokes proper method based on object type
            ship.displayDetails(); //displayDetails() invokes proper method based on object type
            System.out.printf("\n%s","--------------------------");
        }
    }
}
