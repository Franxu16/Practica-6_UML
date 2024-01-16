public class Direccion {
    private String calle;
    private String ciudad;
    private int codPost;
    private Persona persona;
    private Estado estado;

    //Constructor

    public Direccion(String calle, String ciudad, int codPost) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codPost = codPost;
    }

    public Direccion (Estado est){
        this.estado = est;
    }

    //getters

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getCodPost() {
        return codPost;
    }

    //setter

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodPost(int codPost) {
        this.codPost = codPost;
    }
}
