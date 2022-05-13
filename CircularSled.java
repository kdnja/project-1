public class CircularSled extends Sled {
    // Instance variables

    private double radius;
    private double height;
    private double weight;

    // Constructors

    public CircularSled() {
        super("Default circular sled", "plastic", "green");
        radius = 13.0;
        height = 4.0;
        weight = 2.0;
    }

    public CircularSled(String name, String material, String color, double radius, double height,
            double weight) {
        super(name, material, color);
        this.radius = radius;
        this.height = height;
        this.weight = weight;
    }

    // Getters

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setters

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Other methods
    // TODO: add other methods

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return (super.getInfo() + " The sled is circular, so it has a radius of " + radius
                + " inches. It has a height of " + height + " inches and weighs " + weight
                + " pounds.");
    }
}
