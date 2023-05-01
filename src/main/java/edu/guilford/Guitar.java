package edu.guilford;

public class Guitar extends Instrument implements Comparable<Guitar> {

    // Attributes of a guitar

    private int numberOfStrings;
    private String bodyType; // Types could include: solid, hollow, semi-hollow, etc.
    private String brand;

    // Constructor to generate a guitar object with random values for each attribute
    // including the inherited attributes.

    public Guitar() {
        super();
        this.name = "Guitar";
        this.type = "String";
        // Pick a random color from the array of colors.
        this.color = colors[(int) (Math.random() * colors.length)];
        // Pick a major user from a list of 10 famous guitarists.
        String[] guitarists = { "Jimi Hendrix", "Eric Clapton", "Jimmy Page", "Keith Richards", "Jeff Beck",
                "B.B. King", "Chuck Berry", "Eddie Van Halen", "Slash", "John Mayer" };
        this.majorUser = guitarists[(int) (Math.random() * guitarists.length)];
        // Pick a random number of strings between 6 and 12.
        this.numberOfStrings = (int) (Math.random() * 7) + 6;
        // Pick a random body type from a list of 3 body types.
        String[] bodyTypes = { "solid", "hollow", "semi-hollow" };
        this.bodyType = bodyTypes[(int) (Math.random() * bodyTypes.length)];
        // Pick a random brand from a list of 5 brands.
        String[] brands = { "Fender", "Gibson", "Ibanez", "Epiphone", "PRS" };
        this.brand = brands[(int) (Math.random() * brands.length)];
    }

    // Getters and setters

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getBrand() {
        return brand;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Strum, strum, strum.");
    }

    // Add a compareTo method to compare guitars by brand and sorts them
    // alphabetically.

    @Override
    public int compareTo(Guitar guitar) {
        return this.brand.compareTo(guitar.brand);
    }

    // Add a toString method to print out the attributes of a guitar.

    @Override
    public String toString() {
        return "Guitar{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", majorUser='" + majorUser + '\'' +
                ", numberOfStrings=" + numberOfStrings +
                ", bodyType='" + bodyType + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    // Override the getAveragePirce method to return the average price of a guitar.

    @Override
    public double getAveragePrice() {
        return 1000.00;
    }

}
