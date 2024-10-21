public class Cliente {

    //Atributos
    private int cedula;
    private String nombre;
    
    //Constructor
    public Cliente(String nombre, int cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    //Métodos get y set
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Método toString
    @Override
    public String toString() {
        return   nombre + " \n Cedula: " + cedula ;
    }

    
}
