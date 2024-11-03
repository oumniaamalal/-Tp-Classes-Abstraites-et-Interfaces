package tpabstraitesetinterfaces;

public class testCalcul {

    public static void main(String[] args) {
        Forme cercle = new Cercle(5);
        System.out.println("Cercle :");
        System.out.println("Périmètre = " + cercle.calculerPerimetre());
        System.out.println("Surface = " + cercle.calculerSurface());

        Forme rectangle = new Rectangle(4, 6);
        System.out.println("\nRectangle :");
        System.out.println("Périmètre = " + rectangle.calculerPerimetre());
        System.out.println("Surface = " + rectangle.calculerSurface());

        Forme triangle = new Triangle(4, 3, 3, 4, 5);
        System.out.println("\nTriangle :");
        System.out.println("Périmètre = " + triangle.calculerPerimetre());
        System.out.println("Surface = " + triangle.calculerSurface());
    }
}
