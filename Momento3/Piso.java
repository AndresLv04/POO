package Momento3;

public class Piso {
    //Atributos
    
    private int numsPisos; //La cantidad de pisos para crear un vector
    //botones para indicar dirección
    private Boton botonSubir; 
    private Boton botonBajar;

    public Piso (int numsPisos){
        this.botonSubir = new Boton("Subir");
        this.botonBajar = new Boton("Bajar");
        this.numsPisos = numsPisos; 
    }
}
