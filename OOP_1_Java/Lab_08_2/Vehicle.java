
package Lab_08_2;


public abstract class Vehicle {
    
    protected int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    public abstract void move();
    public abstract void carry();
}
    
    
    
