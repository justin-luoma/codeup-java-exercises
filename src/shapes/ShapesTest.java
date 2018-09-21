package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.printf("Area 20: %.1f%n", box1.getArea());
        System.out.printf("Perimeter 18: %.1f%n", box1.getPerimeter());
        Rectangle box2 = new Square(5);
        System.out.printf("Area 25: %.1f%n", box2.getArea());
        System.out.printf("Perimeter 20: %.1f%n", box2.getPerimeter());
    }
}
