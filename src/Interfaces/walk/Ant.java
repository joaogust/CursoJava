package Interfaces.walk;

public class Ant implements Walkable {

    private int totalDistance;

    @Override
    public void walk() {
        totalDistance -= 10;
    }

    @Override
    public void stop() {
        totalDistance = 100;
    }
}
