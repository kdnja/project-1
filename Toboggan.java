public class Toboggan extends RectangularSled {
    // Instance variables
    private boolean traditionalShape;

    // Constructors
    public Toboggan() {
        super("Default toboggan", "wood", "brown", 72.0, 16.0, 12.0, 11.0);
        traditionalShape = true;
    }

    public Toboggan(String name, String material, String color, double length, double width,
            double height, double weight, boolean traditionalShape) {
        super(name, material, color, length, width, height, weight);
        this.traditionalShape = traditionalShape;
    }

    // Getters
    public boolean getTraditionalShape() {
        return traditionalShape;
    }

    // Setters
    public void setTraditionalShape(boolean traditionalShape) {
        this.traditionalShape = traditionalShape;
    }

    // Other methods
    // TODO: implement other methods for toboggan

    @Override
    public String getInfo() {
        String shapeString = "does not have";
        if (traditionalShape) {
            shapeString = "has";
        }
        return super.getInfo() + " This toboggan " + shapeString + " a traditional shape.";
    }

    @Override
    public String getRawInfo() {
        return super.getRawInfo() + ", " + traditionalShape;
    }

}
