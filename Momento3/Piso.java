package Momento3;

public class Piso {
    private int numsPisos;
    private Boton botonSubir; //
    private Boton botonBajar;

    public Piso (int numsPisos){
        this.botonSubir = new Boton("Subir");
        this.botonBajar = new Boton("Bajar");
        this.numsPisos = numsPisos; 
    }
}
