package Momento3;

public class Piso {
    private int numPiso;
    private Boton btnSubida;
    private Boton btnBajada;

    public Piso(int numPiso){
        this.numPiso = numPiso;
        this.btnSubida = new Boton("Subida");
        this.btnBajada = new Boton("Bajada");
    }
}
