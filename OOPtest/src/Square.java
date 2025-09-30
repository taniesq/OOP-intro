public class Square extends Shape {

    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = Math.abs(side);
    }

    public double compareTo(Square sq) {
        double comp = this.getArea() - sq.getArea();
        return comp;
    }

    public boolean equals(Square sq) {
        if (this.getPerimeter() == sq.getPerimeter() && this.getArea() == sq.getArea()) {
            return true;
        } else {
            return false;
        }
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    double getPerimeter() {
        return this.side + this.side + this.side + this.side;
    }

    double getArea() {
        return this.side * this.side;
    }

    public String toString() {
        return super.toString()
                + "   Side: " + this.side
                + "   Area: " + this.getArea()
                + "   Perimeter: " + this.getPerimeter();
    }
}
