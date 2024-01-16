import java.util.ArrayList;

public class LibroDir {
    private int cod;
    private ArrayList<Persona> personas;

    //Constructor

    public LibroDir(int cod) {
        this.cod = cod;
    }

    //getters

    public int getCod() {
        return cod;
    }

    //setters

    public void setCod(int cod) {
        this.cod = cod;
    }
}
