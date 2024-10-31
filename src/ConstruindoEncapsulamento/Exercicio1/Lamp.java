package ConstruindoEncapsulamento.Exercicio1;

public class Lamp {
    private boolean on;

    public Lamp(boolean on) {
        this.on = on;
    }
    void turnOn() {
        if(on != true) {
            on = true;
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("A lâmpada já está ligada");
        }
    }

    void turnOff() {
        if(on == true) {
            on = false;
            System.out.println("Lâmpada desligada");
        } else {
            System.out.println("A lâmpada já está desligada");
        }
    }

    void showState() {
        System.out.println("A lâmpada está " + (on ? "desligada" : "ligada"));
    }
}
