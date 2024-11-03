package tpabstraitesetinterfaces;

public class testGestionStock {

	  public static void main(String[] args) {
	        Produit produit1 = new ProduitAlimentaire("Pomme", 0.5, 100);
	        Produit produit2 = new ProduitElectronique("Smartphone", 300, 20);

	        System.out.println(produit1);
	        System.out.println("Valeur du stock: " + produit1.calculerValeurStock());

	        System.out.println(produit2);
	        System.out.println("Valeur du stock: " + produit2.calculerValeurStock());
	    }
	}