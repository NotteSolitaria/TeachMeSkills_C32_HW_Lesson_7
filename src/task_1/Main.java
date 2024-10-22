package task_1;

/**
 * Create classes "Director", "Worker", "Accountant".
 * Implement an interface with a method that specifies the behavior for displaying the job title.
 * Implement this method in the created classes.
 * Create a runner class with a main method to run the program.
 * Request the job code from the console and display the job title on the screen.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1 to select a worker, 2 to select a director, 3 to select an accountant: ");

        Scanner scanner = new Scanner(System.in);
        int jobChoose = scanner.nextInt();

        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        if (jobChoose == 1) {
            System.out.println(worker.outputJobTitle());
        } else if (jobChoose == 2) {
            System.out.println(director.outputJobTitle());
        } else if (jobChoose == 3) {
            System.out.println(accountant.outputJobTitle());
        }
    }
}
