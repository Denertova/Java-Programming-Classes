class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // Defualt constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Shape{" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                "} radius=" + radius +
                '}';
    }
}

class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
        // Default constructor
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Shape{" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                "} width=" + width +
                ", length=" + length +
                '}';
    }
}