/*
 * 
 * Exercice 2 TP0
 */

package com.mycompany.exo2_tp0;

import java.util.Scanner;

/**
 *
 * @author constancefabre
 */
public class EXO2_TP0 {

    public static void main(String[] args) {
        int nb;
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
//Declaration des variables
int ind; //indice
nb=5;
        int result = 0;
             // Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
               result=result+ind;
               ind = ind + 1;
             }
             // Affichage du resultat
             System.out.println();
             System.out.println("La somme des "+ nb + "entiers est: "+result);
          }
    }

