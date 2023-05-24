public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }

    public int add() {
        return number1 + number2;
    }

    public int subtract() {
        return number1 - number2;
    }

    public int multiply() {
        return number1 * number2;
    }

    public double divide() {
        if (number2 != 0) {
            return (double) number1 / number2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator(10, 5);

        // Perform calculations
        int sum = calculator.add();
        int difference = calculator.subtract();
        int product = calculator.multiply();
        double quotient = calculator.divide();

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
