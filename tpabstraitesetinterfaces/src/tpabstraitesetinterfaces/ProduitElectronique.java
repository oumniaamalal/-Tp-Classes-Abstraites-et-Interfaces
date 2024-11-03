package tpabstraitesetinterfaces;

public class ProduitElectronique implements Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;

   
    public ProduitElectronique(String nom, double prixUnitaire, int quantite) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    
    @Override
    public double calculerValeurStock() {
        return prixUnitaire * quantite;
    }

    @Override
    public String toString() {
        return "Produit Électronique: " + nom + ", Prix unitaire: " + prixUnitaire + ", Quantité: " + quantite;
    }
}

