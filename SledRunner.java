public class SledRunner {
    public static void main(String[] args) {
        RectangularSled test = new RectangularSled();
        System.out.println(test.getInfo());
        System.out.println(test.getRawInfo());

        CircularSled test1 = new CircularSled();
        System.out.println(test1.getInfo());
        test1.setColor("yellow");
        System.out.println(test1.getInfo());
        System.out.println(test1.getRawInfo());

        Toboggan toboggan = new Toboggan();
        System.out.println(toboggan.getInfo());
        toboggan.setTraditionalShape(false);
        System.out.println(toboggan.getInfo());
        System.out.println(toboggan.getRawInfo());
    }
}
