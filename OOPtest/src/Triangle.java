public class Triangle extends Shape {

    private double base, height, side1, side2, side3;

    public Triangle(String name, double base, double height, double side1, double side2, double side3) {
        super(name);
        this.base = Math.abs(base);
        this.height = Math.abs(height);
        this.side1 = Math.abs(side1);
        this.side2 = Math.abs(side2);
        this.side3 = Math.abs(side3);
    }

    public double compareTo(Triangle triton) {
        return this.getArea() - triton.getArea();
    }

    public boolean equals(Triangle triton) {
        return this.getArea() == triton.getArea() && this.getPerimeter() == triton.getPerimeter();
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString() {
        return super.toString()
                + "   Base: " + this.base
                + "   Height: " + this.height
                + "   Side 1: " + this.side1
                + "   Side 2: " + this.side2
                + "   Side 3: " + this.side3
                + "   Area: " + this.getArea()
                + "   Perimeter: " + this.getPerimeter();
    }
}
