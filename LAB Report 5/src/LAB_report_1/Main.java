package LAB_report_1;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double resultAddition = calculator.add(5, 3);
        System.out.println("Addition: " + resultAddition);

        double resultSubtraction = calculator.subtract(8, 4);
        System.out.println("Subtraction: " + resultSubtraction);

        double resultMultiplication = calculator.multiply(6, 2);
        System.out.println("Multiplication: " + resultMultiplication);

        double resultDivision = calculator.divide(10, 2);
        System.out.println("Division: " + resultDivision);
    }
}