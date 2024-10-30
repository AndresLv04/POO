package Momento3;

public class Piso {
    //Atributos
    
    private int numsPisos; //La cantidad de pisos

    //botones para indicar dirección
    private Boton botonSubir; 
    private Boton botonBajar;

    public Piso (int numsPisos){
        this.botonSubir = new Boton("Subir");
        this.botonBajar = new Boton("Bajar");
        this.numsPisos = numsPisos; 
    }

    //Método getters y setters
    public int getNumsPisos() {
        return numsPisos;
    }

    public void setNumsPisos(int numsPisos) {
        this.numsPisos = numsPisos;
    }

    public Boton getBotonSubir() {
        return botonSubir;
    }

    public void setBotonSubir(Boton botonSubir) {
        this.botonSubir = botonSubir;
    }

    public Boton getBotonBajar() {
        return botonBajar;
    }

    public void setBotonBajar(Boton botonBajar) {
        this.botonBajar = botonBajar;
    }

    
}
