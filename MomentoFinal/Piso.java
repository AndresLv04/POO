import Botones.*;
import Puertas.Puerta;
import Puertas.PuertaPiso;

public class Piso {
    //Atributos
    private PlantillaBtns btnSubir; //Botón de subida
    private PlantillaBtns btnBajar; //Botón de bajada
    private Puerta puertaPiso; //Puerta del piso
    private Ascensor ascensor; //Ascensor


    //Constructor
    //El parámetro ascensor permitirá saber de que cual ascensor se esta utilizando
    public Piso(Ascensor ascensor) {
        this.btnSubir = new BtnSubir();
        this.btnBajar = new BtnBajar();
        this.puertaPiso = new PuertaPiso();
        this.ascensor = ascensor;
    }

    //Método getters y setters
    public PlantillaBtns getBtnSubir() {
        return btnSubir;
    }

    public PlantillaBtns getBtnBajar() {
        return btnBajar;
    }

    public Puerta getPuertaPiso() {
        return puertaPiso;
    }

    //Método para presionar botón de subida que tiene cada piso
    //El parámetro pisoSolicitado es para saber en qué piso se está solicitando el ascensor para subir
    public void presionarBtnSubir(int pisoSolicitado){
        btnSubir.presionar(pisoSolicitado);
        ascensor.mover(pisoSolicitado);
    }

    //Método para presionar el botón de bajada que tiene cada piso
    //El parámetro pisoSolicitado es para saver en qué piso se está solicitando el ascensor para bajar
    public void presionarBtnBajar(int pisoSolicitado){
        btnBajar.presionar(pisoSolicitado);
        ascensor.mover(pisoSolicitado);
    }

}
