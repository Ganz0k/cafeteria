/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author luisg
 */
public abstract class Beverage {

    public String description = "";

    public String getDescription() {
        return description;
    }

    public abstract float cost();
}
