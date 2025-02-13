package Interfaces.walk.Revisao.Encapsulamento;

public class Lamp {
    private boolean on;

    void turnOn(){
        on = true;
        System.out.println("A lâmpada foi acesa.");
    }

    void turnOf() {
        on = false;
        System.out.println("A lâmpada foi apagada.");
    }

    void showState() {
        System.out.println("A lâmpada está " + (on ? "ligada." : "desligada."));
    }

    public static void main(String[] args) {
        var lamp = new Lamp();
        lamp.showState();
        lamp.turnOn();
        lamp.showState();
        lamp.turnOf();
        lamp.showState();
    }
}
