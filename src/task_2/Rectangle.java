package task_2;

public class Rectangle extends Figure {
    double width;
    double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public double perimeterCalculation() {
        perimeter = width * 2 + lenght * 2;
        return perimeter;
    }

    @Override
    public double areaCalculation() {
        area = width * lenght;
        return area;
    }
}
