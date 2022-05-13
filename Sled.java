public class Sled {
    // Instance variables
    private String name;
    private String material;
    private String color;

    // Constructors

    public Sled() {
        name = "Sled";
        material = "plastic";
        color = "green";
    }

    public Sled(String name, String material, String color) {
        this.name = name;
        this.material = material;
        this.color = color;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Other methods
    // TODO: add more methods

    public String getInfo() {
        return ("This sled is named \"" + name + ".\" It is made of " + material + " and is "
                + color + ".");
    }

    public String getRawInfo() {
        return (name + ", " + material + ", " + color);
    }

}
