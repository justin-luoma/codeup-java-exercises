package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        return 4 * this.side;
    }

    public double getPerimeter() {
        return Math.pow(this.side, 2);
    }
}
