package LAB_report_2;

import java.util.Scanner;

public class Circle {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Circle circle = new Circle();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = circle.calculateArea(radius);


        System.out.println("The area of the circle with radius " + radius + " is: " + area);


    }
}
