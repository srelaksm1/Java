
package graphics;
import graphics.Figure;
public class Triangle implements Figure{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    public double area() {
        return 0.5 * base * height;
    }
}

