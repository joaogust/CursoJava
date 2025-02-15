package Interfaces.Pet;

public abstract class Pet {
    /*
    Colocar abstract na frente de uma classe impede que objetos sejam
    instanciados a partir dela. Isso é muito útil nesse caso, haja vista
    que instanciar um objeto de Pet não faria sentido. Ele aqui só está
    sendo usado para ser uma classe de referência para outras subclasses.
     */
    private String color;
    private int amountEaten;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void feed(int amount) {
        amountEaten += amount;
    }

    public int getAmountEaten() {
        return amountEaten;
    }

    public abstract void sleep(int time);
    /*
    Colocar abstract na frente de um metodo faz com que não seja necessário
    aplicar utilidade para o metodo. Isso obriga com que subclasses de Pet
    sobrescrevam esse metodo.

    Metodos abstratos não podem existir em classes não abstratas e classes
    abstratas podem ter metodos não abstratos.

     */
}
