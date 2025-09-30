public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = Math.abs(length);
        this.width = Math.abs(width);
    }

    public double compareTo(Rectangle rect) {
        return this.getArea() - rect.getArea();
    }

    public boolean equals(Rectangle rect) {
        return this.getPerimeter() == rect.getPerimeter()
                && this.getArea() == rect.getArea();
    }

    double getPerimeter() {
        return this.width * 2 + this.length * 2;
    }

    double getArea() {
        return this.width * this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return super.toString()
                + "   Length: " + this.length
                + "   Width: " + this.width
                + "   Area: " + this.getArea()
                + "   Perimeter: " + this.getPerimeter();
    }


}
