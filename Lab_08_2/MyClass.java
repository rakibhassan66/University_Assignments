
package Lab_08_2;

public class MyClass {
    public static void main(String[] args) {
        boat boat = new boat("wood", 50);
        car car = new car("steel", 100);

        boat.move();
        boat.slowSpeed();
        boat.move();

        car.move();
        car.boreak();
        car.move();
    }
}
