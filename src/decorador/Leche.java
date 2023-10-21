/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author shirl
 */
public class Leche extends DecoradorCafe {
    public Leche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescription() {
        return cafeDecorado.getDescription() + ", con leche";
    }

    @Override
    public double cost() {
        return cafeDecorado.cost() + 0.5;
    }
}
