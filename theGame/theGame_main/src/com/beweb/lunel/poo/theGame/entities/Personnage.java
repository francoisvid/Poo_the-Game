/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.poo.theGame.entities;

import com.beweb.lunel.poo.theGame.entities.interfaces.ActionInterface;
import com.beweb.lunel.poo.theGame.entities.interfaces.Initializable;

/**
 *
 * @author francois
 */
public abstract class Personnage implements Initializable, ActionInterface {
    
    public int force, endurance, pv;
    public String nom;
    
    public Personnage(){
        this.initAttributs();
    }
    
    public Personnage(String n){
        this();
        this.nom = n;
    }
        
    
    @Override
    public void Attaquer(Personnage cible){
        cible.pv = cible.pv = (this.force - cible.endurance);
        
        if(cible.pv <= 0)
            {System.out.println(cible.nom + " est mort !!!");}
        else{
            System.out.println(this.nom + " attaque " + cible.nom + ", il reste " + cible.pv + " points de vie !");           
        }
                
    }
    
 }
    
