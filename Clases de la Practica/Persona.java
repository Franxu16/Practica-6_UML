public class Persona {
    private String nombre;
    private int numero;
    private String correoElc;
    private Direccion direccion;
    private LibroDir libroDir;

    //Constructor

    public Persona(String nombre, int numero, String correoElc) {
        this.nombre = nombre;
        this.numero = numero;
        this.correoElc = correoElc;
    }

    public Persona(LibroDir lDir){
        this.libroDir = lDir;
    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getCorreoElc() {
        return correoElc;
    }

    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCorreoElc(String correoElc) {
        this.correoElc = correoElc;
    }

    public void ComprarTicket(){
        //ToDo
    }
}
