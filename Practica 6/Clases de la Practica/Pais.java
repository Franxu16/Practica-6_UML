public class Pais {
    private int id;
    private String nombre;

    //Constructor

    public Pais(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
