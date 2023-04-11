import java.util.Scanner;

public class MainCalculator {
    static Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {

        int operand1 = getOperand1();
        int operand2 = getOperand2();
        char operation = getOperation();
        int resultCalculation = calculation(operand1, operand2, operation);

    }

    public static int getOperand1() {
        System.out.print("Please, input number 1:");
        int number1 = 0;
        while (true) {
            if (scannerInput.hasNextInt()) {
                number1 = scannerInput.nextInt();
                break;
            } else {
                scannerInput.next();
                System.out.print("Your enter wrong format number, try again:");
            }
        }
        return number1;
    }

    public static int getOperand2() {
        System.out.print("Please, input number 2:");
        int number2 = 0;
        while (true) {
            if (scannerInput.hasNextInt()) {
                number2 = scannerInput.nextInt();
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
                break;
            } else {
                System.out.println("Your enter wrong operation, try again:");
                scannerInput.next();
                sign = getOperation();
            }
        }
        return sign;
    }


    public static int calculation(int operand1, int operand2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = Operation.Adding(operand1, operand2);
                System.out.println("Result: " + operand1 + " + " + operand2 + " = " + result);
                break;
            case '-':
                result = Operation.Subtraction(operand1, operand2);
                System.out.println("Result: " + operand1 + " - " + operand2 + " = " + result);
                break;
            case '*':
                result = Operation.Multiplication(operand1, operand2);
                System.out.println("Result: " + operand1 + " * " + operand2 + " = " + result);
                break;
            case '/':
                result = Operation.Division(operand1, operand2);
                System.out.println("Result: " + operand1 + " / " + operand2 + " = " + result);
                break;


            default:
                System.out.println("not right");
        }
        return result;
    }

}
