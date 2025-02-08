package Interfaces.walk;

public class Person implements Walkable, Jumpable{

    private int steps;
    private int distancePerStep;

    @Override
    public void walk() {
        steps++;
        distancePerStep += 10;
    }

    @Override
    public void stop() {
        steps = 0;
    }

    @Override
    public void jump() {
        walk();
        walk();
    }
}
