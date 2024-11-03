package tpabstraitesetinterfaces;

public class Bateau extends Vehicule implements Flottant {

    public Bateau(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }

    @Override
    public void demarrer() {
        System.out.println(nom + " démarre.");
    }

    @Override
    public void arreter() {
        System.out.println(nom + " s'arrête.");
    }

    @Override
    public void flotter() {
        System.out.println(nom + " flotte.");
    }
}
