import java.util.Scanner;

public class MainCalculator {
    static Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {

        double operand1 = getOperand1();
        double operand2 = getOperand2();
        char operation = getOperation();
        double resultCalculation = calculation(operand1, operand2, operation);

    }

    public static double getOperand1() {
        System.out.print("Please, input number 1:");
        double number1 = 0;
        while (true) {
            if (scannerInput.hasNextDouble()) {
                number1 = scannerInput.nextDouble();
                break;
            } else {
                scannerInput.next();
                System.out.print("Your enter wrong format number, try again:");

            }
        }
        return number1;
    }

    public static double getOperand2() {
        System.out.print("Please, input number 2:");
        double number2 = 0;
        while (true) {
            if (scannerInput.hasNextDouble()) {
                number2 = scannerInput.nextDouble();
                break;
            } else {
                scannerInput.next();
                System.out.print("Your enter wrong format number, try again:");
            }
        }
        return number2;
    }

    public static char getOperation() {
        System.out.print("You need to choose one operation +, -, *, /,:");
        char sign;
        while (true) {
            if (scannerInput.hasNext()) {
                sign = scannerInput.next().charAt(0);
                if ((sign == '+') | (sign == '-') | (sign == '*') | (sign == '/')) break;
                System.out.print("Your enter wrong operation, try again:");
            }
        }
        return sign;
    }

    public static double calculation(double operand1, double operand2, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = Operation.Adding(operand1, operand2);
                System.out.println("Result: " + result);
                break;
            case '-':
                result = Operation.Subtraction(operand1, operand2);
                System.out.println("Result: " + result);
                break;
            case '*':
                result = Operation.Multiplication(operand1, operand2);
                System.out.println("Result: " + result);
                break;
            case '/':
                result = Operation.Division(operand1, operand2);
                System.out.println("Result: " + result);
                break;


        }
        return result;
    }

}
