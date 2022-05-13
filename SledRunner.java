public class SledRunner {
    public static void main(String[] args) {
        RectangularSled test = new RectangularSled();
        System.out.println(test.getInfo());
        CircularSled test1 = new CircularSled();
        System.out.println(test1.getInfo());
        test1.setColor("yellow");
        System.out.println(test1.getInfo());
    }
}
