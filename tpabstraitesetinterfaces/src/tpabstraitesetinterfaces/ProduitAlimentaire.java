package tpabstraitesetinterfaces;

public class ProduitAlimentaire implements Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;

   
    public ProduitAlimentaire(String nom, double prixUnitaire, int quantite) {
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
        return "Produit Alimentaire: " + nom + ", Prix unitaire: " + prixUnitaire + ", Quantité: " + quantite;
    }
}
