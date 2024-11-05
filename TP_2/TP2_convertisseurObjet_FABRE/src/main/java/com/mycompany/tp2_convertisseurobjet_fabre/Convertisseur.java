package com.mycompany.tp2_convertisseurobjet_fabre;

/*
* ConstanceFABRE TDC
* TP2 Ex 2
* 23 Octobre 2024
 */

/**
 *
 * @author constancefabre
 */
public class Convertisseur {
    // Déclaration des attributs
    int nbConversions;        // nombre de conversions effectuées par le convertisseur
   
    public Convertisseur () {
        nbConversions = 0 ;
    }
   
    public double CelciusVersKelvin (double tCelcius) {
        double tKelvin;
        tKelvin=tCelcius+273.15;
        nbConversions++;  // Incrémente le compteur à chaque conversion
        return tKelvin;
    }
   
    public double KelvinVersCelcius (double tKelvin) {
        double tCelcius;
        tCelcius=tKelvin-273.15;
        nbConversions++;  // Incrémente le compteur à chaque conversion
        return tCelcius;
    }
    public double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius;
        tCelcius=(tFarenheit-32)/1.8;
        nbConversions++;  // Incrémente le compteur à chaque conversion
        return tCelcius;
    }
    public double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit;
        tFarenheit=(tCelcius*1.8)+32;
        nbConversions++;  // Incrémente le compteur à chaque conversion
        return tFarenheit;
    }
    public double KelvinVersFarenheit (double tKelvin) {
        double tFarenheit;
        tFarenheit=(tKelvin*1.8)-459.67;
        nbConversions++;  // Incrémente le compteur à chaque conversion
        return tFarenheit;
    }
    public double FarenheitVersKelvin (double tFarenheit) {
        double tKelvin;
        tKelvin=(tFarenheit+459.67)/1.8;
        nbConversions++;  // Incrémente le compteur à chaque conversion
        return tKelvin;
    }
   
    @Override
    public String toString () {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
    
}
