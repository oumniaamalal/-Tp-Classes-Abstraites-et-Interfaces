package tpabstraitesetinterfaces;

public class Cercle extends Forme {
	private double Rayon;
	


	public Cercle(double Rayon) {
        this.Rayon = Rayon;
    }
	 @Override
	    public double calculerSurface() {
	        return Math.PI * Rayon * Rayon;
	    }
	 @Override
	    public double calculerPerimetre() {
	        return 2 * Math.PI * Rayon;
	    }
	public double getRayon() {
		return Rayon;
	}
	public void setRayon(double rayon) {
		Rayon = rayon;
	}
	 
}
