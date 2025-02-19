package Polimorfismo.Sealed;

public non-sealed class Car extends Vehicle{
    /*
    Todas as classes que herdam de uma classe sealad devem conter modificador sendo eles:
    - sealed: Quando tem herança por lista (controlada);
    - non-sealed: Quando tem herança sem restrições (não controlada);
    - final: Quando não contém herança.
     */
    @Override
    public void drive() {
    }
}
