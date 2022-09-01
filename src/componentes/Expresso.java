/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author luisg
 */
public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public float cost() {
        return 65f;
    }
}
