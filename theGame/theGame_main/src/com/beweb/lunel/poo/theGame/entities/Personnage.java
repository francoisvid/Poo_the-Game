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
public class Personnage {
    
    public int force, endurance, pv;
    public String nom;
    
    public Personnage(){
        this.initAttributs();
    }
    
    public Personnage(String n){
        this();
        this.nom = n;
    }
    
    public void initAttributs(){
        
    }
    
    public void attaquer(Personnage cible){
        cible.pv = cible.pv = (this.force - cible.endurance);
        
        if(cible.pv <= 0)
            {System.out.println(cible.nom + " est mort !!!");}
        else{
            System.out.println(this.nom + " attaque " + cible.nom + ", il reste " + cible.pv + " points de vie !");           
        }
                
    }
    
 }
    
