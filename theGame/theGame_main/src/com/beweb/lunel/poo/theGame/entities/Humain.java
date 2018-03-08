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
public class Humain extends Personnage {



    public Humain(String n) {
        super(n);
    }

    @Override
    public void initAttributs() {
        
        this.force = 10;
        this.endurance = 10;
        this.pv = 50;
    }
    
    

}
