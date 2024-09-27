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
       
        for (int i = 1; i<=5; i++){
            int n = generateurAleat.nextInt(100);
            System.out.print(n + " ");
        }
       
        int nb = generateurAleat.nextInt(100);
        System.out.println("Veuillez saisir un nombre entre 0 et 100 :");
        int nombre = sc.nextInt();
        int compteur = 0;
       
        while (nombre != nb) {
            if (nb>nombre){
                System.out.println("Trop petit");
                System.out.println("Veuillez saisir un nombre plus grand :");
                nombre = sc.nextInt();
                compteur += 1;
            }
           
            else {
                System.out.println("Trop grand");
                System.out.println("Veuillez saisir un nombre plus petit :");
                nombre = sc.nextInt();
                compteur += 1;
            }
        }
        System.out.println("Vous avez gagne");
        System.out.println("Vous avez effectue " + (compteur+1) + " coups");
        
        int niveau ;
        System.out.println("1 = facile");
        System.out.println("2 = normal");
        System.out.println("3 = difficile");
        System.out.println("veuillez saisir le numéro du niveau de difficulté que vous avez choisi");
        
        if ( niveau = 1 ){
            
           }
        
        else if ( niveau = 2 ){
            
           }
        
        else if ( niveau = 3 ){
            
           }
        
        else {
            
           }
        
        }
    }
    
}