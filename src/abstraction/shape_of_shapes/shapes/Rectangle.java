package abstraction.shape_of_shapes.shapes;

public class Rectangle extends Shape {
    private final double width, height; // sides

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLengh() {
        return height;
    }

    @Override
    public double calculateArea() {
        // A = w * l
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        // P = 2(w + l)
        return 2 * (width + height);
    }

}
