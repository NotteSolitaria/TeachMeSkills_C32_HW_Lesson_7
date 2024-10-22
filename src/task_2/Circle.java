package task_2;

public class Circle extends Figure {
    double pi = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterCalculation() {
        perimeter = pi * 2 * radius;
        return perimeter;
    }

    @Override
    public double areaCalculation() {
        area = pi * radius * radius;
        return area;
    }
}
