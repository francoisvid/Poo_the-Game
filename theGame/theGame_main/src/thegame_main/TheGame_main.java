/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame_main;

import com.beweb.lunel.poo.theGame.entities.Elf;
import com.beweb.lunel.poo.theGame.entities.Humain;
import com.beweb.lunel.poo.theGame.entities.Personnage;

/**
 *
 * @author francois
 */
public class TheGame_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personnage[] domeDuTonnere = new Personnage[2];
        domeDuTonnere[0] = new Humain("loic");
        domeDuTonnere[1] = new Elf("jonathan");
        
        int fin = 1000;

        while (fin > 0) {
            double choix = Math.random();

            if (choix > 0.5) {
                domeDuTonnere[0].attaquer(domeDuTonnere[1]);
                fin = domeDuTonnere[1].pv;
            }
            
            
            else{
            domeDuTonnere[1].attaquer(domeDuTonnere[0]);
            fin = domeDuTonnere[0].pv;
            }
            
        }
    }

}
