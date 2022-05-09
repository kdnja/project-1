public class RectangularSled {
    // Instance variables

    private String name;
    private double height;
    private double weight;
    private boolean hasHandles;

    // New instance variables
    private double length;
    private double width;
    private boolean isCurved;
    private String material;
    private String color;

    // Constructors

    public RectangularSled() {
        this.name = "Rectangular Sled";
        this.length = 47.0;
        this.width = 18.85;
        this.height = 5.4;
        this.isCurved = false;
        this.hasHandles = false;
        this.material = "plastic";
        this.color = "blue";
    }

    public RectangularSled(String name, double length, double width, double height, double weight,
            boolean isCurved, boolean hasHandles, String material, String color) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.isCurved = isCurved;
        this.hasHandles = hasHandles;
        this.material = material;
        this.color = color;
    }

    // Getters

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public boolean getIsCurved() {
        return this.isCurved;
    }

    public boolean getHandles() {
        return this.hasHandles;
    }

}
