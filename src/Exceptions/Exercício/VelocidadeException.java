package Exceptions.Exercício;

public class VelocidadeException extends RuntimeException{

    public VelocidadeException() {
        System.out.println("Velocidade ultrapassou a 200km/h.");
    }
}
