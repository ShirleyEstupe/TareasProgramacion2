/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author shirl
 */
public class CafeSimple implements Cafe {
    @Override
    public String getDescription() {
        return "Café simple";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
