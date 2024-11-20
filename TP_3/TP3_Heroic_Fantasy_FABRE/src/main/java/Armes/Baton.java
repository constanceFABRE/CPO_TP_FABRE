package Armes;


import Armes.Arme;


/*
 *Constance FABRE
TP 3
 */

/**
 *
 * @author constancefabre
 */
public class Baton extends Arme {
    private int Age;

    public Baton(String Nom, int NivAtt, int Age) {
        super(Nom, NivAtt);
        this.Age = Age;
        this.Age = Math.min (Age, 100);
    }

    public int getAge() {
        return Age;
    }
}
