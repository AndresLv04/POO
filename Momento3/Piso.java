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

    //Método getters y setters
    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public Boton getBtnSubida() {
        return btnSubida;
    }

    public void setBtnSubida(Boton btnSubida) {
        this.btnSubida = btnSubida;
    }

    public Boton getBtnBajada() {
        return btnBajada;
    }

    public void setBtnBajada(Boton btnBajada) {
        this.btnBajada = btnBajada;
    }
    
}
