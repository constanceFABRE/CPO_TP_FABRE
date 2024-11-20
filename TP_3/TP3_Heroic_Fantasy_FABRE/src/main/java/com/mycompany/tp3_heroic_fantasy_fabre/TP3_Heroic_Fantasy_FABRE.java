/*
 * Constance FABRE
 * TP 3
 */

package com.mycompany.tp3_heroic_fantasy_fabre;

import Personnages.Guerrier;
import Personnages.Magicien;
import Armes.Epee;              
import Armes.Baton;       
import java.util.ArrayList;
import Personnages.Personnage;
import Armes.Arme;



/**
 *
 * @author constancefabre
 */
public class TP3_Heroic_Fantasy_FABRE {

    public static void main(String[] args) {
        Epee Exc = new Epee("Excalibur",7,5);
        Epee Dur = new Epee("Durandal",4,7);
        Baton Che = new Baton("Chene", 4, 5);
        Baton Cha = new Baton("Charme", 5, 6);
       
        System.out.println(Exc);
        System.out.println(Dur);
        System.out.println(Che);
        System.out.println(Cha);
       
        ArrayList <Arme> Armes = new ArrayList <Arme>();
        Armes.add(Exc);
        Armes.add(Dur);
        Armes.add(Che);
        Armes.add(Cha);
       
        for (int i = 0; i<(Armes.size()); i++){
            System.out.println(Armes.get(i));
        }
       
       
        Magicien Gan = new Magicien("Gandalf",65,true);
        Magicien Gar = new Magicien("Garcimore",44,false);
        Guerrier Con = new Guerrier("Conan", 78, false);
        Guerrier Lan = new Guerrier("Lannister", 45, true);
               
        System.out.println(Gan);
        System.out.println(Gar);
        System.out.println(Con);
        System.out.println(Lan);
       
        ArrayList <Personnage> Personnages = new ArrayList <Personnage>();
        Personnages.add(Gan);
        Personnages.add(Gar);
        Personnages.add(Con);
        Personnages.add(Lan);
       
        for (int i = 0; i<(Armes.size()); i++){
            System.out.println(Personnages.get(i));
        }
       
        Baton Mys = new Baton("Mystique", 20, 80);
        Epee Enc = new Epee("Enchantée", 40, 90);
        
        Con.ajouterArme(Che);
        Con.ajouterArme(Exc);
        Con.ajouterArme(Dur);
        Con.equiperArme("Excalibur");
        
        Gan.ajouterArme(Cha);
        Gan.ajouterArme(Mys);
        Gan.ajouterArme(Enc);
        
       
               
    }
}
    