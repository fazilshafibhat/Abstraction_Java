package abstraction.shape_of_shapes;

import abstraction.shape_of_shapes.shapes.Circle;
import abstraction.shape_of_shapes.shapes.Rectangle;
import abstraction.shape_of_shapes.shapes.Shape;
import abstraction.shape_of_shapes.shapes.Triangle;

public class Main {
        public static void main(String[] args) {
                // // Rectangle test
                double width = 5, length = 7;
                Shape rectangle = new Rectangle(width, length);
                System.out.println("Rectangle width: " + width + " and length: " + length
                                + "\nResulting area: " + rectangle.calculateArea()
                                + "\nResulting perimeter: " + rectangle.calculateCircumference() + "\n");

                // // Circle test
                double radius = 5;
                Shape circle = new Circle(radius);
                System.out.println("Circle radius: " + radius
                                + "\nResulting Area: " + circle.calculateArea()
                                + "\nResulting Perimeter: " + circle.calculateCircumference() + "\n");

                // // Triangle test
                double tWidth = 5, tLength = 7;
                Shape triangle = new Triangle(tWidth, tLength);
                System.out.println("Triangle : " + tWidth + ", " + tLength +
                                "\nResulting Area: " + triangle.calculateArea()
                                + "\nResulting Perimeter: " + triangle.calculateCircumference() + "\n");

        }

}
