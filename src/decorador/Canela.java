/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author shirl
 */
public class Canela extends DecoradorCafe {
    public Canela(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescription() {
        return cafeDecorado.getDescription() + ", con canela";
    }

    @Override
    public double cost() {
        return cafeDecorado.cost() + 0.3;
    }
}
