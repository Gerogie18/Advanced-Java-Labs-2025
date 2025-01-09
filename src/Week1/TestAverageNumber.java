package Week1;

import java.util.Scanner;

public class TestAverageNumber {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("Number Averager");
        System.out.println("Press Enter to calculate average");
        System.out.println(" ");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                scanner.close();
                break;
            }
            try {
                double number = Double.parseDouble(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
}
