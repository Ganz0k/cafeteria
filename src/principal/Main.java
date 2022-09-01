/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import componentes.Beverage;
import componentes.DarkRoast;
import componentes.Decaf;
import decoradores.Milk;
import decoradores.Mocha;

/**
 *
 * @author luisg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Si un cliente quiere un Café con Mocha y Leche
        
        Beverage bebida = new DarkRoast(); //Cost: $40.00
        bebida = new Mocha(bebida); //Cost: $40.00 + $10.00 = $50.00
        bebida = new Milk(bebida); //Cost: $50.00 + $10.00 = $60.00
        
        System.out.println("El costo de " + bebida.getDescription() + " es de: $" + bebida.cost());
        
        //Si un cliente quiere un Decaf con doble leche
        
        Beverage bebida2 = new Decaf(); //Cost: $50.00
        bebida2 = new Milk(bebida2); //Cost: $50.00 + $10.00 = $60.00
        bebida2 = new Milk(bebida2); //Cost: $60.00 + $10.00 = $70.00
        
        System.out.println("\nEl costo de " + bebida2.getDescription() + " es de: $" + bebida2.cost());
    }
    
}
