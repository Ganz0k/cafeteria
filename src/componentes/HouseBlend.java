/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author luisg
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend";
    }

    @Override
    public float cost() {
        return 25f;
    }
}
