/*
 * ConstanceFABRE TDC
* TP2 Ex 1
* 16 Octobre 2024
 */
package com.mycompany.tp2_bieres_fabre;

/**
 *
 * @author constancefabre
 */
public class BouteilleBiere {
    String nom ;
    String brasserie;
    double degreAlcool;
    boolean ouverte ;
    
    public void lireEtiquette() {
         System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
    }
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    
}
