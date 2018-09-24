package shapes;

public class Square extends Quadrilateral {
//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        return 4 * this.side;
//    }
//
//    public double getPerimeter() {
//        return Math.pow(this.side, 2);
//    }

    public Square(double width) {
        super(width, width);
    }

    @Override
    protected void setLength(double length) {
        this.length = length;
    }

    @Override
    protected void setWidth(double width) {
        this.width = width;
    }

    public void setSides(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public double getPerimeter() {
        return this.width * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.width, 2);
    }
}
