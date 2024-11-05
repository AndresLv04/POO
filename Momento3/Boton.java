package Momento3;

public class Boton {
    private boolean presionado;
    private String tipo;

    public Boton(String tipo){
        this.presionado = false;
        this.tipo = tipo;
    }

    public void presionar(){
        presionado = true;
        emitirSonido();
        System.out.println("El boton " + tipo + " ha sido presionado en el piso" );
        iluminar();
        
    }

    public void emitirSonido(){
        System.out.println("Emitido sonido");
    }
    public void iluminar(){
        System.out.println("El botón " + tipo + " esta iluminado");
    }
}
