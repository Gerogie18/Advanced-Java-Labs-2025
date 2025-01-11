package Week1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwitchCalc {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input simple math expression with two operators");
        String input = scanner.nextLine().replaceAll("\\s", "");
        scanner.close();

        Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)([+\\-x*/])(\\d+(?:\\.\\d+)?)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            double operandOne = Double.parseDouble(matcher.group(1));
            String operator = matcher.group(2);
            double operandTwo = Double.parseDouble(matcher.group(3));

            switch (operator) {
                case "+":
                    System.out.println("Addition - Result:");
                    System.out.println((operandOne + operandTwo));
                    break;
                case "-":
                    System.out.println("Subtraction - Result:");
                    System.out.println((operandOne - operandTwo));
                    break;
                case "/":
                    System.out.println("Division - Result:");
                    System.out.println((operandOne / operandTwo));
                    break;
                case "*":
                case "x":
                    System.out.println("Multiplication - Result:");
                    System.out.println((operandOne * operandTwo));
                    break;
            }
        } else {
            System.out.println("Input invalid: please input simple expression\n    Such as \" 1 + 1 \" ");
        }
    }
}
