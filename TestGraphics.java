// File: TestGraphics.java

import graphics.*;
public class TestGraphics {
    public static void main(String[] args) {
        // Create instances of each shape
       Rectangle r = new Rectangle(5, 10);
       Triangle t = new Triangle(6, 8);
       Square s = new Square(4);
        Circle c = new Circle(7);

        // Print the areas of each shape
        System.out.println("Area of Rectangle: " + r.area());
       System.out.println("Area of Triangle: " + t.area());
        System.out.println("Area of Square: " + s.area());
        System.out.println("Area of Circle: " + c.area());
    }
}

