public class Operation extends MainCalculator {

    public static double Adding(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double Subtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double Multiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double Division(double operand1, double operand2) {
        double division = 0;
        double a = 0;
        while (true) {
            if (operand2 == 0) {
                while (true) {
                    System.out.println("You can't divide by zero, enter number again");
                    a = getOperand2();
                    if (a != 0) break;
                }
            } else {
                a = operand2;
            }
            division = operand1 / a;
            return division;
        }

    }
}
