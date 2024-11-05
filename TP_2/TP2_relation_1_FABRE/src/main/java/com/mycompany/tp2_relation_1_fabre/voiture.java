package com.mycompany.tp2_relation_1_fabre;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author constancefabre
 */
public class voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
   
    // Constructeur pour initialiser nom et prenom
    public voiture(String Modele,String Marque,int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.proprietaire = null;
    }
   
    @Override
    public String toString () {
        return "Modele : " +Modele+" Marque:"+Marque+" PuissanceCV:"+PuissanceCV;
    }
}
