// File: Square.java
package graphics;
import graphics.Figure;
public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    public double area() {
        return side * side;
    }
}

