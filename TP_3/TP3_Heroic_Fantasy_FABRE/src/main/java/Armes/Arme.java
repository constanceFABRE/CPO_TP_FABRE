package Armes;

/*
 * Constance FABRE
TP 3

 */

/**
 *
 * @author constancefabre
 */
public abstract class Arme {
    private String Nom;
    private int NivAtt;

    public Arme(String Nom, int NivAtt) {
        this.Nom = Nom;
        this.NivAtt = Math.min (NivAtt, 100);
    }
   
    public String getNom() {
        return Nom;
    }

    public int getNivAtt() {
        return NivAtt;
    }
   
    @Override
    public String toString(){
        return "Le nom de l arme est : " + Nom + " et son niveau d attaque est : " + NivAtt;        
    }
}
