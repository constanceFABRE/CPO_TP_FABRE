/*
 * ConstanceFABRE TDC
* TP2 Ex 1
* 16 Octobre 2024
*/

package com.mycompany.tp2_bieres_fabre;

/**
 *
 * @author constancefabre
 */
public class TP2_Bieres_FABRE {

    public static void main(String[] args) {
        //BouteilleBiere uneBiere = new BouteilleBiere() ;
        //uneBiere.nom = "Cuvee des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie = "Dubuisson";
        //uneBiere.ouverte = false;
        //uneBiere.lireEtiquette();
       
        //BouteilleBiere secondeBiere = new BouteilleBiere() ;
        //secondeBiere.nom = "Leffe";
        //secondeBiere.degreAlcool = 6.6 ;
        //secondeBiere.brasserie = "Abbaye de Leffe";
        //secondeBiere.ouverte = false;
        //secondeBiere.lireEtiquette();
       
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Heineken" ,5 ,"Gerard Heineken") ;
        troisiemeBiere.lireEtiquette();
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Desperados" ,5.9 ,"Alken-Maes") ;
        quatriemeBiere.lireEtiquette();
        BouteilleBiere derniereBiere = new BouteilleBiere("Corona" ,4.5 ,"Grupo Modelo") ;
        derniereBiere.lireEtiquette();
       
        uneBiere.decapsuler();
        autreBiere.decapsuler();
        quatriemeBiere.decapsuler();
       
        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(troisiemeBiere);
        System.out.println(quatriemeBiere);
        System.out.println(derniereBiere);
    }
        
    
}
