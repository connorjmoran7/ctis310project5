package edu.guilford;

public class Drums extends Instrument implements Comparable<Drums> {

    // Attributes of a drum set

    private int numberOfDrums;
    private String brand;
    private String kitType; // Types could include: jazz, rock, fusion, etc.

    // Constructor to generate a drum set object with random values for each
    // attribute including the inherited attributes.

    public Drums() {
        super();
        this.name = "Drums";
        this.type = "Percussion";
        // Pick a random color from the array of colors.
        this.color = colors[(int) (Math.random() * colors.length)];
        // Pick a major user from a list of 10 famous drummers.
        String[] drummers = { "Neil Peart", "John Bonham", "Keith Moon", "Buddy Rich", "Ginger Baker", "Ringo Starr",
                "Stewart Copeland", "Gene Krupa", "Dave Grohl", "Travis Barker" };
        this.majorUser = drummers[(int) (Math.random() * drummers.length)];
        // Pick a random number of drums between 4 and 12.
        this.numberOfDrums = (int) (Math.random() * 9) + 4;
        // Pick a random kit type from a list of 3 kit types.
        String[] kitTypes = { "jazz", "rock", "fusion" };
        this.kitType = kitTypes[(int) (Math.random() * kitTypes.length)];
        // Pick a random brand from a list of 5 brands.
        String[] brands = { "Pearl", "Tama", "Ludwig", "DW", "Yamaha" };
        this.brand = brands[(int) (Math.random() * brands.length)];
    }

    // Getters and setters

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public String getBrand() {
        return brand;
    }

    public String getKitType() {
        return kitType;
    }

    public void setNumberOfDrums(int numberOfDrums) {
        this.numberOfDrums = numberOfDrums;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKitType(String kitType) {
        this.kitType = kitType;
    }

    // Method to play the drums

    @Override
    public void play() {
        System.out.println("Boom, boom, boom.");
    }

    // Method to compare two drum sets by the number of drums

    @Override
    public int compareTo(Drums o) {
        return this.numberOfDrums - o.numberOfDrums;
    }

    // Method to print the attributes of a drum set

    @Override
    public String toString() {
        return "Drums{" +
                "numberOfDrums=" + numberOfDrums +
                ", brand='" + brand + '\'' +
                ", kitType='" + kitType + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", majorUser='" + majorUser + '\'' +
                '}';
    }

    // Override the getAveragePrice method from the Instrument class to return the
    // average price of a drum set

    @Override
    public double getAveragePrice() {
        return 1000.0;
    }

}
