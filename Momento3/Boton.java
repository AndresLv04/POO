package Momento3;

//Clase abstract para los diferentes sonidos
public abstract class Boton {
    
    //Método de sonido que va tener el mismo comportamiento sin importar quien lo llame
    public void sonido(){
        System.out.println("Emitiendo sonido...");
    }

    //Métodos para que van a comportar diferentes dependiendo que botón los llame
    public abstract void presionar();
    public abstract void iluminar();
    
} 
