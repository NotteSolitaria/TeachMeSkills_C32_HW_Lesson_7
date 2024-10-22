package task_2;

public class Triangle extends Figure {
    double firstSide;
    double secondSide;
    double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double perimeterCalculation() {
        perimeter = firstSide + secondSide + thirdSide;
        return perimeter;
    }

    @Override
    public double areaCalculation() {
        if (firstSide < thirdSide && secondSide < thirdSide && (firstSide * firstSide + secondSide * secondSide) < thirdSide * thirdSide) {
            area = (firstSide * secondSide) / 2;
            return area;
        } else if (secondSide < firstSide && thirdSide < firstSide && (thirdSide * thirdSide + secondSide * secondSide) < firstSide * firstSide) {
            area = (secondSide * thirdSide) / 2;
            return area;
        } else if (firstSide < secondSide && thirdSide < secondSide && (thirdSide * thirdSide + firstSide * firstSide) < secondSide * secondSide) {
            area = (firstSide * thirdSide) / 2;
            return area;
        } else {
            double intermediateCalculation = (firstSide + secondSide + thirdSide) / 2 * (((firstSide + secondSide + thirdSide) / 2 - firstSide) * ((firstSide + secondSide + thirdSide) / 2 - secondSide) * ((firstSide + secondSide + thirdSide) / 2 - thirdSide));
            area = Math.sqrt(intermediateCalculation);
        }
        return area;
    }
}
