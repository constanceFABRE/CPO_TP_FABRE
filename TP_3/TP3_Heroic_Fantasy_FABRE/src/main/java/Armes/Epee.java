package Armes;


import Armes.Arme;

/*
 *  Constance FABRE
TP 3
 */

/**
 *
 * @author constancefabre
 */
public class Epee extends Arme {
    private int Indice;

    public Epee(String Nom, int NivAtt, int Indice) {
        super(Nom, NivAtt);
        this.Indice = Indice;
        this.Indice = Math.min (Indice, 100);
    }

    public int getIndice() {
        return Indice;
    }
}