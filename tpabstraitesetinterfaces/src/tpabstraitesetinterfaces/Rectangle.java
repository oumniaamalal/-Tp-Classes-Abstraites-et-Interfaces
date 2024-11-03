package tpabstraitesetinterfaces;

public class Rectangle extends Forme {
	private double largeur;
	private double longeur;
	
public Rectangle (double largeur,double longeur ) {
	this.largeur = largeur;
    this.longeur = longeur;
    
}
@Override
public double calculerSurface() {
    return largeur * longeur;
}
public double calculerPerimetre() {
    return 2 * (largeur + longeur);
    
}
public double getLargeur() {
	return largeur;
}
public void setLargeur(double largeur) {
	this.largeur = largeur;
}
public double getLongeur() {
	return longeur;
}
public void setLongeur(double longeur) {
	this.longeur = longeur;
}
}
