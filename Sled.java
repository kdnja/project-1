public class Sled {
    //// Instance variables ////
    private String name;
    private String material;
    private String color;


    //// Constructors ////
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


    //// Getters ////
    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }


    //// Setters ////
    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //// Other methods ////
    public String getInfo() {
        String className = this.getClass().getSimpleName();
        // Use switch for this occasion since we're checking the same thing over and over again
        // Clarifies what kind of sled is being referred to
        switch (className) {
            case "CircularSled":
                className = "circular sled";
                break;
            case "RectangularSled":
                className = "rectangular sled";
                break;
            case "Toboggan":
                className = "toboggan";
                break;
            default:
                className = "sled";
        }
        return ("This " + className + " is named \"" + name + ".\" It is made of " + material
                + " and is " + color + ".");
    }

    public String getRawInfo() {
        String className = this.getClass().getSimpleName();
        return (className + ", " + name + ", " + material + ", " + color);
    }

}
