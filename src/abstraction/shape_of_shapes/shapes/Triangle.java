package abstraction.shape_of_shapes.shapes;

public class Triangle extends Shape {
    private final double width, height;

    public Triangle() {
        this(1, 1);
    }

    public Triangle(double width, double height) {
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
        // Area = (width*height)/2
        return (width * height) / 2;
    }

    @Override
    public double calculateCircumference() {
        // A right triangle has a base(b), hypotenuse(h) and //perpendicular(p) as its
        // sides,
        // Therefore, the Perimeter of a right angle triangle= b + p + h
        return width + height + Math.sqrt((width * width) + (height * height));
    }

}