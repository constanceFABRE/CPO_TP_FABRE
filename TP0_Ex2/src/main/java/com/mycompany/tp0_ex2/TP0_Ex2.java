/*
 * TP0 exercice 2
 * 17 septembre 2024
 */

package com.mycompany.tp0_ex2;

/**
 *
 * @author constancefabre
 */
public class TP0_Ex2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Declaration des variables
        int nb; // nombre d entiers a additionner
        int result; // resultat
        int ind; //indice
        nb=5;
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
               result=result+ind;
             }
         // Affichage du resultat
             System.out.println();
             System.out.println("La somme des "+ nb + "entiers est: "+result);
          }
        
    }

