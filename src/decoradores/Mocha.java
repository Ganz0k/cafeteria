/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradores;

import componentes.Beverage;

/**
 *
 * @author luisg
 */
public class Mocha extends CondimentDecorator {
    
    public Beverage beverage;
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription(){
        return beverage.getDescription() + " + Mocha";
    }
    
    @Override
    public float cost(){
        return 10f + beverage.cost();
    }
}
