package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        do {
            double radius = input.getDouble("Enter the radius of the new " +
                    "circle: ");
            Circle c = new Circle(radius);
            System.out.printf("The area of your circle is: %f%n", c.getArea());
            System.out.printf("The circumference of your circle is: %f%n",
                    c.getCircumference());
        } while (input.yesNo("Would you like to continue? "));
    }
}
