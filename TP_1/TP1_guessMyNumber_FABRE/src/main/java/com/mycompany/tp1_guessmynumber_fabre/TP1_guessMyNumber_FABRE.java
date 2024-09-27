/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_guessmynumber_fabre;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author constancefabre
 */
public class TP1_guessMyNumber_FABRE {

    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++ ) {
            int n = generateurAleat.nextInt(100);
            System.out.println(n + " ");
        }
    
        int nb = generateurAleat.nextInt(100); 
        System.out.println("Vous devez saisr une valeur entre 0 et 100");
        int nombre = sc.nextInt();
        
        while (nombre!= nb)
            if (nb > nombre) {
                System.out.println("Trop petit");
            }    
        
            else if (nb < nombre) {
                System.out.println("Trop grand");
            }
        
            else {
                System.out.println("Gagné");
            }
        
    }
}
