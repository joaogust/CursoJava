package Exceptions.Exercício;

public class Vehicle {
    private int velocidade;

    public Vehicle(int velocidade) {
        this.velocidade = velocidade;
        speedException();
    }
    public int accelerate() {
        velocidade *= 2;
        speedException();
        return velocidade;
    }

    private void speedException() {
        if (velocidade > 200) {
            throw new VelocidadeException();
        }
    }
}
