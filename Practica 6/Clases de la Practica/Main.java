import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LibroDir l1 = new LibroDir(12);
        Direccion d1 = new Direccion("calle Tersio 32", "Valladolid", 23564);
        Persona p1 = new Persona("Pedro", 65423514, "pedrolopez@gmail.com");
        Estado e1 = new Estado(15, "Castilla y Leon");
        Estado e2 = new Estado(54, "Comunidad Valenciana");
        Pais pa1 = new Pais(24, "Espanya");
        Pais pa2 = new Pais(33, "Inglaterra");

        System.out.println("Nombre de la Persona: " + p1. getNombre());
        System.out.println("Nombre del Pais de Residencia: " + pa1.getNombre());
        System.out.println("Nombre del estado: " + e1.getNombre());
        System.out.println("Numero de la Persona: " + p1.getNumero());
    }
}
