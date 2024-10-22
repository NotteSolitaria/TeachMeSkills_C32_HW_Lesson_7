package task_2;

/**
 * Write the hierarchy of the classes Shape, Triangle, Rectangle, Circle.
 * Implement a function for calculating the area for each type of figure and calculating the perimeter (using abstract class/methods).
 * Create an array of 5 different shapes.
 * Loop through the array and display information about each shape.
 * Display the sum of the perimeters of all shapes in the array.
 */

public class Main {
    public static void main(String[] args) {

        Figure[] arrayOfFigures = new Figure[3];
        arrayOfFigures[0] = new Circle(4);
        arrayOfFigures[1] = new Rectangle(3, 7);
        arrayOfFigures[2] = new Triangle(3, 4, 5);

        for (Figure arrayOfFigure : arrayOfFigures) {
            System.out.println(arrayOfFigure);
        }

        double sumOfPerimetrs = 0;
        for (Figure arrayOfFigure : arrayOfFigures) {
            sumOfPerimetrs += arrayOfFigure.perimeter;
        }

        System.out.println("Sum of perimeters: " + sumOfPerimetrs);
    }
}
