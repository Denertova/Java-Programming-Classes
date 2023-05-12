class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point other) {
        double dx = x - other.getX();
        double dy = y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class Segment {
    private Point v1;
    private Point v2;

    public Segment(Point v1, Point v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Point getV1() {
        return v1;
    }

    public Point getV2() {
        return v2;
    }

    public double getLength() {
        return v1.distance(v2);
    }

    public String toString() {
        return "Segment[v1=(" + v1.getX() + "," + v1.getY() + "),v2=(" + v2.getX() + "," + v2.getY() + ")]";
    }
}

class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Point getV1() {
        return v1;
    }

    public Point getV2() {
        return v2;
    }

    public Point getV3() {
        return v3;
    }

    public double getDistance(Point p1, Point p2) {
        return p1.distance(p2);
    }

    public double getDistances() {
        double d1 = getDistance(v1, v2);
        double d2 = getDistance(v2, v3);
        double d3 = getDistance(v3, v1);
        return d1 + d2 + d3;
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        if (d1 == d2 && d2 == d3) {
            return "równoboczny";
        } else if (d1 == d2 || d2 == d3 || d3 == d1) {
            return "równoramienny";
        } else {
            return "różnoboczny";
        }
    }

    public String toString() {
        return "Triangle[v1=(" + v1.getX() + "," + v1.getY() + "),v2=(" + v2.getX() + "," + v2.getY() + "),v3=(" + v3.getX() + "," + v3.getY() + ")]";
    }
}
class Main {
    public static void main(String[] args) {
        // create some points
        Point p1 = new Point(100, 100);
        Point p2 = new Point(200, 200);
        Point p3 = new Point(300, 100);

        // create some segments
        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(p2, p3);
        Segment s3 = new Segment(p3, p1);

        // create a triangle
        Triangle t1 = new Triangle(p1, p2, p3);

        // print some information about the objects
        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
        System.out.println("Point p3: " + p3);
        System.out.println("Segment s1: " + s1);
        System.out.println("Segment s2: " + s2);
        System.out.println("Segment s3: " + s3);
        System.out.println("Triangle t1: " + t1);
        System.out.println("długość odcinka s1: " + s1.getLength());
        System.out.println("długość odcinka s2: " + s2.getLength());
        System.out.println("długość odcinka s3: " + s3.getLength());
        System.out.println("obwod tego trojkata: " + t1.getDistances());
        System.out.println("Rodzaj trójkąta: " + t1.getType());
    }
}