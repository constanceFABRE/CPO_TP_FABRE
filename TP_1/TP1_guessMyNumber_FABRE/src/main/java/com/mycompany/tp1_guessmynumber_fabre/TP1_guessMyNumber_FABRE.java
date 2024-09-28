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
        
        //int n = generateurAleat.nextInt(100);
        int nb1;
        int mode;
        int cpt;
        cpt=1;
       
        System.out.println("\n Choisir le niveau de difficulté 1,2 ou 3 :");
        System.out.println("\n 1)Facile :");
        System.out.println("\n 2)Normal");
        System.out.println("\n 3)Difficile");
        mode=sc.nextInt();
       
        //System.out.println("\n Entrer un nombre entier entre 0 et 100 :");
        //nb1=sc.nextInt();
        //int n1 = generateurAleat.nextInt(100);
        //int n2 = generateurAleat.nextInt(100);
        //int n3 = generateurAleat.nextInt(100);
        //int n4 = generateurAleat.nextInt(100);
        //int n5 = generateurAleat.nextInt(100);
        //System.out.println("Les nombres sont: "+n1+", "+n2+", "+n3+", "+n4+","+n5+"");
       
        if (mode==1){
            int n = generateurAleat.nextInt(20);
            System.out.println("\n Entrer un nombre entier entre 0 et 20 :");
            nb1=sc.nextInt();
            while(n!=nb1){
                if (n<nb1){
                    System.out.println("trop grand");
                }
                if (n>nb1){
                    System.out.println("trop petit");
                }
                System.out.println("\n Entrer un nouvedau nombre entier entre 0 et 20 :");
                nb1=sc.nextInt();
                cpt=cpt+1;
            }
            if (n==nb1){
                System.out.println("gagné");
                System.out.println("nombre de tentative effectuée:"+cpt+"");
            }
        }
        if (mode==2){
            int n = generateurAleat.nextInt(50);
            System.out.println("\n Entrer un nombre entier entre 0 et 50 :");
            nb1=sc.nextInt();
            while(n!=nb1){
                if (n<nb1){
                    System.out.println("trop grand");
                }
                if (n>nb1){
                    System.out.println("trop petit");
                }
                System.out.println("\n Entrer un nouvedau nombre entier entre 0 et 50 :");
                nb1=sc.nextInt();
                cpt=cpt+1;
            }
            if (n==nb1){
                System.out.println("gagné");
                System.out.println("nombre de tentative effectuée:"+cpt+"");
            }
        }
        if (mode==3){
            int n = generateurAleat.nextInt(100);
            System.out.println("\n Entrer un nombre entier entre 0 et 100 :");
            nb1=sc.nextInt();
            while(n!=nb1){
                if (n<nb1){
                    System.out.println("trop grand");
                }
                if (n>nb1){
                    System.out.println("trop petit");
                }
                System.out.println("\n Entrer un nouvedau nombre entier entre 0 et 100 :");
                nb1=sc.nextInt();
                cpt=cpt+1;
            }
            if (n==nb1){
                System.out.println("gagné");
                System.out.println("nombre de tentative effectuée:"+cpt+"");
            }
        }
       
    
    }
}