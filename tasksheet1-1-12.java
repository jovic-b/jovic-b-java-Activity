// Step 1: Define the Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Step 2: Create the AbstractShape abstract class implementing Shape interface
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return 0; // Placeholder implementation
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Placeholder implementation
    }
}

// Step 3: Implement concrete classes Circle and Rectangle
class Circle extends AbstractShape {
    double radius;

    Circle(String color, double radius) {
        super(color, 0, 0); // Set length and width to 0 for circles
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Step 4: Implement Main class
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
