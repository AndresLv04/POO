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

    public boolean getIluminado() {
        return iluminado;
    }

    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }

    //Método para saber si presionaron ya el botón
    public void presionar(){
        botonPresionado = true;
        iluminar();
        sonido();
        System.out.println("Botón de " + direccion + " fue presionado");
    }

    //Método para iluminar cuando uno de los botones haya sido presionado
    public void iluminar(){
        iluminado = true;
        System.out.println("El botón de " + direccion + " esta iluminado");
    }

    //Método para emitir sonido para cuando uno de los botónes haya sido presionado
    public void sonido(){
        System.out.println("Emitiendo sonido para " + direccion);
    }

    //Método para reiniciar el presionado y el iluminado del botón
    public void reiniciar(){
        botonPresionado = false;
        iluminado = false;
    }

    public void mtrPuertaAbierta(){
        System.out.println("Esperando...");
    }
    
    
}
