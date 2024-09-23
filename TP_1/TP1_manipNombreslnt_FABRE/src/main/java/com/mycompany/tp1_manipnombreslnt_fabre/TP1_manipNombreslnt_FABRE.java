/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_manipnombreslnt_fabre;

import java.util.Scanner;

/**
 *
 * @author constancefabre
 */
public class TP1_manipNombreslnt_FABRE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre1;  
        int nombre2;
        nombre1 = 0;
        nombre2 = 0;
        System.out.println("veuillez entrer un premier nombre");
        nombre1 = sc.nextInt();
        System.out.println("veuillez entrer un deuzième nombre");
        nombre2 = sc.nextInt();
        System.out.println("voici la somme des deux nombres :" + (nombre1 + nombre2));
        System.out.println("voici la différence des deux nombres :" + (nombre1 - nombre2));
        System.out.println("voici le produit des deux nombres :" + (nombre1 * nombre2));
        System.out.println("voici le quotient des deux nombres :" + (nombre1 / nombre2));
        System.out.println("voici le reste de la division euclédienne des deux nombres :" + (nombre1 % nombre2));
    }
}
