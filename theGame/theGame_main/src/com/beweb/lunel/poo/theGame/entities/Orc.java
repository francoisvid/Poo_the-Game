/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.poo.theGame.entities;

/**
 *
 * @author francois
 */
public class Orc extends Personnage {
    
    public Orc(){
        this.force = 15;
        this.endurance = 12;
        this.pv = 65;
                
    }
    
    public Orc(String n){
        super(n);
    }

    @Override
    public void initAttributs() {       
        this.force = 15;
        this.endurance = 12;
        this.pv = 65;
    }
}
