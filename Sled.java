public class Sled {
    // Instance variables
    private String name;
    private double height;
    private double weight;
    public boolean hasHandles;

    // Constructors
    public Sled() {
        this.name = "Sled";
        this.height = 47.0;
        this.weight = 3.0;
        this.hasHandles = true;
    }

    public Sled(String name, double height, double weight, boolean hasHandles) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hasHandles = hasHandles;
    }

    // Getters

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getHandles() {
        return this.hasHandles;
    }

    // Setters

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHandles(boolean handles) {
        this.hasHandles = handles;
    }

    // Other methods

    // TODO: add more methods

}
