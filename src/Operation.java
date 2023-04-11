public class Operation extends MainCalculator {

    public static int Adding(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public static int Subtraction(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public static int Multiplication(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public static int Division(int operand1, int operand2) {
        int division;
        while (true) {
            if (operand2 == 0) {
                System.out.println("You can't divide by zero, enter number again:");
                division = getOperand2();
            } else {
                division = operand1 / operand2;
            }
            return division;
        }

    }
}
