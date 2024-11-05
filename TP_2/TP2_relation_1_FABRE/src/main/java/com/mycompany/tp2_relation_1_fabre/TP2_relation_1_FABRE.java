/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_relation_1_fabre;

/**
 *
 * @author constancefabre
 */
public class TP2_relation_1_FABRE {

    public static void main(String[] args) {
        voiture uneClio = new voiture ("Clio", "Renault", 5 ) ;
        voiture uneAutreClio = new voiture ("Clio", "Renault", 5 ) ;
        voiture une2008 = new voiture ("2008", "Peugeot", 6 ) ;
        voiture uneMicra = new voiture ("Micra", "Nissan", 4 ) ;
       
        Personne Bob = new Personne("Bobby", "Sixkiller");
        Personne Reno = new Personne("Reno", "Raines");
       
        //Bob.liste_voitures[0] = uneClio ;
        //Bob.nbVoitures = 1 ;
        //uneClio.proprietaire = Bob ;
       
        // Ajouter une deuxième voiture à Bob
        //Bob.liste_voitures[1] = uneMicra;
        //Bob.nbVoitures++;  // Mise à jour du nombre de voitures
        //uneMicra.proprietaire = Bob;  // Bob est le propriétaire de la Micra
       
        // Assigner des voitures à Reno
        //Reno.liste_voitures[0] = uneAutreClio;
        //Reno.nbVoitures = 1;  // Mise à jour du nombre de voitures de Reno
        //uneAutreClio.proprietaire = Reno;  // Reno est le propriétaire de l'autre Clio

        //Reno.liste_voitures[1] = une2008;
        //Reno.nbVoitures++;  // Mise à jour du nombre de voitures de Reno
        //une2008.proprietaire = Reno;  // Reno est le propriétaire de la 2008

        //System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        //System.out.println("la premiere voiture de Bob est " + Bob.liste_voitures[0] ) ;
        //System.out.println("la deuxieme voiture de Bob est " + Bob.liste_voitures[1] ) ;
        //System.out.println("la premiere voiture de Reno est " + Reno.liste_voitures[0] ) ;
        //System.out.println("la deuxieme voiture de Reno est " + Reno.liste_voitures[1] ) ;
       
      // Test de l'ajout de voitures à Bob
        System.out.println("Ajout de la Clio a Bob: " + Bob.ajouter_voiture(uneClio));
        System.out.println("Ajout de la Micra a Bob: " + Bob.ajouter_voiture(uneMicra));

        // Essayer d'ajouter la même voiture (Clio) à Reno (devrait échouer car elle appartient déjà à Bob)
        System.out.println("Ajout de la Clio a Reno: " + Reno.ajouter_voiture(uneClio));

        // Test de l'ajout de voitures à Reno
        System.out.println("Ajout de l'autre Clio a Reno: " + Reno.ajouter_voiture(uneAutreClio));
        System.out.println("Ajout de la 2008 a Reno: " + Reno.ajouter_voiture(une2008));
    }
}
