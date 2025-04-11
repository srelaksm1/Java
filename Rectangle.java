// File: Rectangle.java
package graphics;
import graphics.Figure;
public class Rectangle implements Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double area() {
        return length * width;
    }
}

