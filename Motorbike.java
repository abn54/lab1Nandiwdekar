/**
 * Project: Lab1 Motorcycle
 * Purpose Details: Create a Motorcycle class with fields, constructors, and getter/setter methods.
 * Course: IST 242
 * Author: Aayudh Nandiwdekar
 * Date Developed: 09/04/2024
 * Last Date Changed:
 * Revision:
 */

class Motorbike {
    private String make;
    private String model;
    private int engineSize; // in cc
    private Trim1 trim; // Trim1 object
    private Color color; // Color enum

    public Motorbike(String make, String model, int engineSize, Trim1 trim, Color color) {
        this.make = make;
        this.model = model;
        this.engineSize = engineSize;
        this.trim = trim;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public Trim1 getTrim() {
        return trim;
    }

    public Color getColor() {
        return color;
    }

    public void start() {
        System.out.println(make + " " + model + " is starting...");
    }

    public void stop() {
        System.out.println(make + " " + model + " is stopping...");
    }
}
