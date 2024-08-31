
package Lab_08_2;

public class car extends Vehicle {
    private String material;

    public car(String material, int speed) {
        super(speed);
        this.material = material;
    }

    @Override
    public void move() {
        System.out.println("Car is moving at speed: " + speed);
    }

    @Override
    public void carry() {
        System.out.println("Car is carrying passengers");
    }

    public void boreak() {
        speed -= 20;
        System.out.println("Car speed decreased to: " + speed);
    }
}

