/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author luisg
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public float cost() {
        return 40f;
    }
}
