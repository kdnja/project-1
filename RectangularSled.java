public class RectangularSled extends Sled {
    // Instance variables
    private double length;
    private double width;
    private double height;
    private double weight;

    // Constructors

    public RectangularSled() {
        super("Default rectangular sled", "plastic", "blue");
        length = 47.0;
        width = 18.85;
        height = 5.4;
        weight = 3.0;
    }

    public RectangularSled(String name, String material, String color, double length, double width,
            double height, double weight) {
        super(name, material, color);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Getters

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setters

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
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
        return super.getInfo() + " The dimensions of the sled are " + length + " x " + width + " x "
                + height + " inches, and it weighs " + weight + " pounds.";
    }

}
