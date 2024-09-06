/*
 * Project: Lab1 Motorcycle
 * Purpose Details: Create Motorcycle objects and print their properties.
 * Course: IST 242
 * Author: Aayudh Nandiwdekar
 * Date Developed:09/04/2024
 * Last Date Changed:
 * Revision:

 */

public class Main {
    public static void main(String[] args) {
        // Create Trim1 objects
        Trim1 trim1 = new Trim1("Leather", "Matte Black", true);
        Trim1 trim2 = new Trim1("Vinyl", "Glossy Red", false);
        Trim1 trim3 = new Trim1("Leather", "Glossy Blue", true);

        // Create Motorbike objects using the constructor, Trim1 objects, and Color enum
        Motorbike motorbike1 = new Motorbike("Honda", "CBR600RR", 600, trim1, Color.RED);
        Motorbike motorbike2 = new Motorbike("Yamaha", "YZF-R1", 1000, trim2, Color.YELLOW);
        Motorbike motorbike3 = new Motorbike("Suzuki", "GSX-R750", 750, trim3, Color.GREEN);

        // Print the details of each motorbike using the getter methods
        printMotorbikeDetails(motorbike1);
        printMotorbikeDetails(motorbike2);
        printMotorbikeDetails(motorbike3);

        // Start and stop each motorbike
        motorbike1.start();
        motorbike1.stop();
        motorbike2.start();
        motorbike2.stop();
        motorbike3.start();
        motorbike3.stop();
    }

    private static void printMotorbikeDetails(Motorbike motorbike) {
        System.out.println(motorbike.getMake() + " " + motorbike.getModel() +
                " with " + motorbike.getEngineSize() + "cc engine, " +
                "Color: " + motorbike.getColor() + ", " +
                "Seat: " + motorbike.getTrim().getSeatType() + ", " +
                "Paint: " + motorbike.getTrim().getPaintJob() + ", " +
                "Accessories: " + (motorbike.getTrim().hasAccessories() ? "Yes" : "No"));
    }
}
