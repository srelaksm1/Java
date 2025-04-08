import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius; // Area = π * radius^2
    }

    public double perimeter() {
        return 2 * Math.PI * radius; // Perimeter = 2 * π * radius
    }
}

class Rectangle implements Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width; // Area = length * width
    }

    public double perimeter() {
        return 2 * (length + width); // Perimeter = 2 * (length + width)
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                // Circle option
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Shape circle = new Circle(radius);
                System.out.println("Area of Circle: " + circle.area());
                System.out.println("Perimeter of Circle: " + circle.perimeter());
            } 
            else if (choice == 2) {
                // Rectangle option
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                Shape rectangle = new Rectangle(length, width);
                System.out.println("Area of Rectangle: " + rectangle.area());
                System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
            } 
            else if (choice == 3) {
                // Exit option
                System.out.println("Exiting the program.");
                break;
            } 
            else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}

