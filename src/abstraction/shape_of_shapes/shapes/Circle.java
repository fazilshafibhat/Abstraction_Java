package abstraction.shape_of_shapes.shapes;

public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        // P = 2πr
        return 2 * pi * radius;
    }
}
