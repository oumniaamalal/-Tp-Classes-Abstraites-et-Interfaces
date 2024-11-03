package tpabstraitesetinterfaces;

public class Voiture extends Vehicule {

    // Constructeur de la classe Voiture
    public Voiture(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }

   
    @Override
    public void demarrer() {
    }

    
    @Override
    public void arreter() {
        System.out.println(nom + " s'arrête.");
    }

    
    public void rouler() {
        System.out.println(nom + " roule.");
    }
}
