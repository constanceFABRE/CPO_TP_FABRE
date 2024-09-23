/*
 * Constance FABRE
 * Exercice 2 TP1
 * 23 septembre 2024
 */

package com.mycompany.tp1_convertisseur_fabre;

import java.util.Scanner;

/**
 *
 * @author constancefabre
 */
public class TP1_convertisseur_FABRE {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nombre1;  
    nombre1 = 0;
    System.out.println("veuillez entrer un nombre");
    nombre1 = sc.nextDouble();
    System.out.println("Vous avez saisi :" + nombre1);
    System.out.println("Vous la température en degré Kelvin :" + (nombre1 + 273.15)+" K");
        
    }
    
    public static double CelciusVersKelvin (double tCelcius) {
    double tKelvin;
    tKelvin = tCelcius + 273.15;
    return tKelvin;
    
    }
    
    public static double KelvinVersCelcius (double tKelvin) {
    double tCelcius;
    tCelcius = tKelvin - 273.15;
    return tCelcius;
    
    }
    
    public static double FarenheitVersCelcius (double tFarenheit) {
    double tCelcius;
    tCelcius = (tFarenheit - 32)/1.8;
    return tCelcius;
    
    }
}
  