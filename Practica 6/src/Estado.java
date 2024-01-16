public class Estado {
    private int id;
    private String nombre;
    private Pais pais;

    //Constructor

    public Estado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Estado(Pais p){
        this.pais = p;
    }

    //getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
