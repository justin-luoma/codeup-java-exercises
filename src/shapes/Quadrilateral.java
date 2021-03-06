package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    protected abstract void setLength(double length);

    protected abstract void setWidth(double width);

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
