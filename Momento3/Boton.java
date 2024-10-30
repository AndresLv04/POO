package Momento3;

public class Boton {
    
    private String direccion; //Nos indica si la persona va asi arriba o bajo
    private boolean botonPresionado; //Saber si el botón fue presionado

    public Boton (String direccion){
        this.direccion = direccion;
        this.botonPresionado = false; //Inicializo false porque no se a seleccionado ninguna dirección lo que indica que no esta en funcionamiento el ascensor.
    }

    //Métodos getters y setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isBotonPresionado() {
        return botonPresionado;
    }

    public void setBotonPresionado(boolean botonPresionado) {
        this.botonPresionado = botonPresionado;
    }

    
}
