/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author shirl
 */
public abstract class DecoradorCafe implements Cafe {
    protected Cafe cafeDecorado;

    public DecoradorCafe(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String getDescription() {
        return cafeDecorado.getDescription();
    }

    @Override
    public double cost() {
        return cafeDecorado.cost();
    }
}
