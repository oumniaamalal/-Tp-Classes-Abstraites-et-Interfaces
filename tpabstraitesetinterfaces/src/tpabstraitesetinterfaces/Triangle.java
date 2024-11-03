package tpabstraitesetinterfaces;

public class Triangle extends Forme {
    private double base;
    private double hauteur;
    private double premierCote;
    private double deuxiemeCote;
    private double troisiemeCote;

    public Triangle(double base, double hauteur, double premierCote, double deuxiemeCote, double troisiemeCote) {
        this.base = base;
        this.hauteur = hauteur;
        this.premierCote = premierCote;
        this.deuxiemeCote = deuxiemeCote;
        this.troisiemeCote = troisiemeCote;
    }

    @Override
    public double calculerSurface() {
        return (base * hauteur) / 2;
    }

    @Override
    public double calculerPerimetre() {
        return premierCote + deuxiemeCote + troisiemeCote;
    }
}

