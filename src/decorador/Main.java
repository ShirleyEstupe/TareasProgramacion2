/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador;

/**
 *
 * @author shirl
 */
public class Main {

    public static void main(String[] args) {
        Cafe cafe = new CafeSimple();
        System.out.println("Pedido: " + cafe.getDescription() + ", Costo: $" + cafe.cost());

        Cafe cafeConLeche = new Leche(new CafeSimple());
        System.out.println("Pedido: " + cafeConLeche.getDescription() + ", Costo: $" + cafeConLeche.cost());

        Cafe cafeConCanela = new Canela(new CafeSimple());
        System.out.println("Pedido: " + cafeConCanela.getDescription() + ", Costo: $" + cafeConCanela.cost());
    }
}
