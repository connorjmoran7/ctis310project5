package edu.guilford;

public class Saxophone extends Instrument implements Comparable<Saxophone> {

    // Attributes of a saxophone

    private String brand;
    private String saxType; // Types could include: soprano, alto, tenor, baritone, etc.
    private String material; // Materials could include: brass, bronze, silver, etc.

    // Constructor to generate a saxophone object with random values for each
    // attribute including the inherited attributes.

    public Saxophone() {
        super();
        this.name = "Saxophone";
        this.type = "Woodwind";
        // Pick a random color from the array of colors.
        this.color = colors[(int) (Math.random() * colors.length)];
        // Pick a major user from a list of 10 famous saxophonists.
        String[] saxophonists = { "John Coltrane", "Charlie Parker", "Stan Getz", "Sonny Rollins", "Dexter Gordon",
                "Michael Brecker", "Grover Washington Jr.", "Coleman Hawkins", "Lester Young", "Joe Henderson" };
        this.majorUser = saxophonists[(int) (Math.random() * saxophonists.length)];
        // Pick a random sax type from a list of 4 sax types.
        String[] saxTypes = { "soprano", "alto", "tenor", "baritone" };
        this.saxType = saxTypes[(int) (Math.random() * saxTypes.length)];
        // Pick a random material from a list of 3 materials.
        String[] materials = { "brass", "bronze", "silver" };
        this.material = materials[(int) (Math.random() * materials.length)];
        // Pick a random brand from a list of 5 brands.
        String[] brands = { "Selmer", "Yamaha", "Yanagisawa", "Keilwerth", "Cannonball" };
        this.brand = brands[(int) (Math.random() * brands.length)];
    }

    // Getters and setters

    public String getBrand() {
        return brand;
    }

    public String getSaxType() {
        return saxType;
    }

    public String getMaterial() {
        return material;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Method to play the saxophone

    @Override
    public void play() {
        System.out.println("The " + this.color + " " + this.brand + " " + this.saxType + " saxophone is playing.");
    }

    // Method to compare two saxophones by brand

    @Override
    public int compareTo(Saxophone saxophone) {
        return this.brand.compareTo(saxophone.brand);
    }

    // Method to print the attributes of a saxophone

    @Override
    public String toString() {
        return "Saxophone{" +
                "brand='" + brand + '\'' +
                ", saxType='" + saxType + '\'' +
                ", material='" + material + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", majorUser='" + majorUser + '\'' +
                '}';
    }

    // Override the getAveragePrice method from the Instrument class to return the
    // average price of a saxophone.

    @Override
    public double getAveragePrice() {
        return 3000.00;
    }

}
