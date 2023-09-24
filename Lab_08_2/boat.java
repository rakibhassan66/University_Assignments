
package Lab_08_2;


public class boat extends Vehicle {
    private String material;

    public boat(String material, int speed) {
        super(speed);
        this.material = material;
    }

    @Override
    public void move() {
        System.out.println("Boat is moving at speed: " + speed);
    }

    @Override
    public void carry() {
        System.out.println("Boat is carrying cargo");
    }

    public void slowSpeed() {
        speed -= 10;
        System.out.println("Boat speed decreased to: " + speed);
    }
}
