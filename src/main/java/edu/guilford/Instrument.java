package edu.guilford;

public abstract class Instrument {

    // This is the super class for all instruments.

    // Attributes of all instruments

    protected String name;
    protected String type; // Types could include: string, percussion, brass, woodwind, etc.
    protected String color;
    protected String majorUser; // This is the name of a famous musician who plays this instrument.

    // Create an array of possible colors for instruments.

    protected String[] colors = { "red", "orange", "yellow", "green", "blue", "purple", "pink", "brown", "black",
            "white" };

    // Constructor

    public Instrument(String name, String type, String color, String majorUser) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.majorUser = majorUser;
    }

    // Empty constructor

    public Instrument() {
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getMajorUser() {
        return majorUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setMajorUser(String majorUser) {
        this.majorUser = majorUser;
    }

    // Abstract method

    public abstract void play();

    // Price method (will need to be overridden in subclasses to return the correct
    // price)

    public double getAveragePrice() {
        return 0.0;
    }

}
