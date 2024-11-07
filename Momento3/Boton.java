package Momento3;

public class Boton {
    
    private String tipo;

    public Boton(String tipo){
        this.tipo = tipo;
    }

    public void presionar(){
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
