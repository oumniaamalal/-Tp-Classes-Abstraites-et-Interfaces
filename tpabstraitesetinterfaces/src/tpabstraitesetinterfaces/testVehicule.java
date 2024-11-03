package tpabstraitesetinterfaces;
public class testVehicule {
	public static void main(String[] args) {
        
        Vehicule[] vehicules = new Vehicule[3];
        vehicules[0] = new Voiture("Voiture 1", "Essence");
        vehicules[1] = new Bateau("Bateau 1", "Diesel");
        vehicules[2] = new Hydravion("Hydravion 1", "Aviation");

       
        for (Vehicule v : vehicules) {
            v.demarrer();
            v.arreter();
        }

       
        for (Vehicule v : vehicules) {
            if (v instanceof Roulant) {
                ((Roulant) v).rouler(); 
            }
            if (v instanceof Flottant) {
                ((Flottant) v).flotter(); 
            }
            if (v instanceof Volant) {
                ((Volant) v).voler(); 
            }
        }
    }
}
