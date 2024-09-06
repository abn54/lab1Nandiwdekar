/**
 * Project: Lab1 Motorcycle
 * Purpose Details: Create a Motorcycle class with fields, constructors, and getter/setter methods.
 * Course: IST 242
 * Author: Aayudh Nandiwdekar
 * Date Developed: 09/04/2024
 * Last Date Changed:
 * Revision:
 */

public class Engine {
    // Fields (attributes) of the Engine class
    private int horsepower;
    private String type; // Example: "V-Twin", "Inline-4"
    private int capacity; // Capacity in cubic centimeters (cc)

    // Constructor to initialize an Engine object
    public Engine(int horsepower, String type, int capacity) {
        this.horsepower = horsepower;
        this.type = type;
        this.capacity = capacity;
    }

    // Getter for 'horsepower'
    public int getHorsepower() {
        return horsepower;
    }

    // Setter for 'horsepower'
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Getter for 'type'
    public String getType() {
        return type;
    }

    // Setter for 'type'
    public void setType(String type) {
        this.type = type;
    }

    // Getter for 'capacity'
    public int getCapacity() {
        return capacity;
    }

    // Setter for 'capacity'
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

