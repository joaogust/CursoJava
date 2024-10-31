package ConstruindoEncapsulamento.Exercicio1;

// Aula 79
public class mainLamp {
    public static void main(String[] args) {
        var lamp = new Lamp(true);

        lamp.turnOff();
        lamp.turnOff();
        lamp.showState();
        lamp.turnOn();
        lamp.turnOn();
        lamp.showState();
    }
}
