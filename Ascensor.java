import Botones.BtnsAscensor;
import Botones.PlantillaBtns;
import Puertas.Puerta;
import Puertas.PuertaAscensor;
import Puertas.PuertaPiso;

import java.util.Timer;
import java.util.TimerTask;

public class Ascensor {
    //Atributos
    private final Puerta puertaAscensor; //Puerta ascensor
    private final Puerta puertaPiso; //Puertas piso
    private final PlantillaBtns btnsAscensor; //Botones que están dentro del ascensor
    private int ubnActual; //Ubicación del ascensor
    private String estado; //Estado del ascensor si está subiendo, bajando o mantenimiento

    public Ascensor() {
        this.ubnActual = 1; //Inicializando ubicación desde el primer piso
        this.puertaAscensor = new PuertaAscensor();
        this.btnsAscensor = new BtnsAscensor();
        this.puertaPiso = new PuertaPiso();
        this.estado = "parado"; //Como todo ascensor inicia parado
    }

    //Método para mostrar donde esta ubicado el ascensor
    public void mostrarPisoAscensor() {
        System.out.println("El ascensor esta en el piso " + ubnActual + "\n");
    }

    //Método para mover el ascensor
    public void mover(int pisoDestino)  {
        try{

            //Condicional para saber mostrar el estado del ascensor
            if (pisoDestino > ubnActual) {
                estado = "subiendo";
            } else {
                estado = "bajando";
            }

            System.out.println("El ascensor está " + estado);

            //Este ciclo permite simular que el ascensor está subiendo o bajando
            while(pisoDestino != ubnActual) {
                if (pisoDestino > ubnActual){
                    ubnActual++;
                }else{
                    ubnActual--;
                }
                System.out.println("Ascensor en el piso " + ubnActual );
                Thread.sleep(2000);
            }

            System.out.println("El ascensor a llegado al piso " + ubnActual);
            Thread.sleep(1000);
            puertaAscensor.abrirPuerta();
            puertaPiso.abrirPuerta();
            Thread.sleep(1000);
            estado = "parado";
            System.out.println("Las puertas del ascensor y del piso " + ubnActual + " están abiertas.");
            Thread.sleep(4000);
            puertaPiso.cerrarPuerta();
            puertaAscensor.cerrarPuerta();

        }catch (InterruptedException e){
            System.out.println("El ascensor esta en el piso " + ubnActual);
        }



    }

    //Método para presionar los botones que están en del dentro del ascensor
    public void psrBtnAscensor(int pisoDestino) {
        btnsAscensor.presionar(pisoDestino);
        mover(pisoDestino);

    }



}
