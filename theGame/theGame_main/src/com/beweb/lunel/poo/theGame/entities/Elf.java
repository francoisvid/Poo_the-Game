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
public class Elf extends Personnage {
    
    public Elf(){    
        this.endurance = 18;
        this.force = 8;
        this.pv = 30;
    }
        
    public Elf(String n) {
        super(n);
    }

    @Override
    public void initAttributs() {
        this.endurance = 18;
        this.force = 8;
        this.pv = 30;
    }
    
    
}
