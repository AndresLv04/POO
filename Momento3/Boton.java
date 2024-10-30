package Momento3;

public class Boton {
    
    private String direccion; //Nos indica si la persona va asi arriba o bajo
    private boolean botonPresionado; //Saber si el botón fue presionado
    private boolean iluminado;

    public Boton (String direccion){
        this.direccion = direccion;
        this.botonPresionado = false; //Inicializo false porque no se a seleccionado ninguna dirección lo que indica que no esta en funcionamiento el ascensor.
        this.iluminado = false; //Inicializa el false porqu el botón no ha sido presionado
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

    //Método para saber si presionaron ya el botón
    public void presionar(){
        botonPresionado = true;
        iluminar();
        sonido();
        System.out.println("Botón de " + direccion + " fue presionado");
    }

    public void iluminar(){
        iluminado = true;
        System.out.println("El botón de " + direccion + " esta iluminado");
    }

    public void sonido(){
        System.out.println("Emitiendo sonido para " + direccion);
    }
    
}
