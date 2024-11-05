package Momento3;

public class Puerta {
    private String estado;

    public Puerta(){
        this.estado = "Cerrada";
    }

    public void abrir(){
        this.estado = "Puerta abierta...";
    }

    public void cerrada(){
        this.estado = "Puera cerrada...";
    }

    public void mantenerAbierta(){
        this.estado = "Esperando...";
    }

}
