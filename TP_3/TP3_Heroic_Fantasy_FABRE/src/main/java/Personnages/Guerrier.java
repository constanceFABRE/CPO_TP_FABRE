package Personnages;

/*
 * 
 */

/**
 *
 * @author constancefabre
 */
public class Guerrier extends Personnage {
    private boolean Cheval;

    public Guerrier(String Nom, int NivVie, boolean Cheval) {
        super(Nom, NivVie);
        this.Cheval = Cheval;
    }

    public void setCheval(boolean Cheval) {
        this.Cheval = Cheval;
    }

    public boolean getCheval() {
        return Cheval;
    }
}