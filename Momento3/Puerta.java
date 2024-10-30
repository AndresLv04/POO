package Momento3;

public class Puerta {
    private boolean puertaAbierta;

    public Puerta(){
        this.puertaAbierta = false;
    }

    //Método getters y setters
    public boolean getPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    //Método para abrir la puerta
    public void puertaAbierta(){
        puertaAbierta = true;
        System.out.println("Puerta abierta...");
    }

    //Método para cerrar la puerta
    public void puertaCerrar(){
        puertaAbierta = false;
        System.out.println("Puerta cerrada...");
    }

    
    
}
