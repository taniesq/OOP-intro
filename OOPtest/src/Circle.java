public class Circle extends Shape {

    private double radius;
    private static final double PI = Math.PI;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double compareTo(Circle circe) {
        return this.getArea() - circe.getArea();
    }

    public boolean equals(Circle circe) {
        return this.getPerimeter() == circe.getPerimeter() && this.getArea() == circe.getArea();
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * PI * this.radius;
    }

    double getArea() {
        return PI * this.radius * this.radius;
    }

    public String toString() {
        return super.toString()
                + "   Radius: " + this.radius
                + "   Area: " + this.getArea()
                + "   Perimeter: " + this.getPerimeter();
    }

}
