package Week1;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        String[] numberWords = {"one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a one-digit number (0-9): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 9) {
            System.out.println("Error: Invalid Number.");
        } else {
            System.out.println(numberWords[number]);
        }
        scanner.close();
    }
}
