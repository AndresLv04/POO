package Momento3;

import Momento3.Botones.Boton;
import Momento3.Botones.BtnBajar;
import Momento3.Botones.BtnSubida;

public class Piso {
    //Atributos
    
    private int numsPisos; //La cantidad de pisos

    //botones para indicar dirección
    private Boton botonSubir; 
    private Boton botonBajar; 

    public Piso (int numsPisos){
        this.botonSubir = new BtnSubida();
        this.botonBajar = new BtnBajar();
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
