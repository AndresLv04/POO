import java.util.Random;

import Botones.BtnsAscensor;
import Botones.Botones;
import Puertas.Puerta;
import Puertas.PuertaAscensor;
import Puertas.PuertaPiso;

public class Ascensor {
    //Atributos
    private int ubnAscensor; //Ubicación del ascensor
    private Botones btnsAscensor; //Botones que están dentro del ascensor
    private String estado; //Estado del ascensor si está subiendo, bajando o parado
    private Puerta puertaAscensor; //Puerta ascensor
    private Puerta puertaPiso; //Puertas piso

    public Ascensor() {
        this.ubnAscensor = 0; //Inicializando ubicación desde el primer piso
        this.puertaAscensor = new PuertaAscensor();
        this.btnsAscensor = new BtnsAscensor();
        this.puertaPiso = new PuertaPiso();
        this.estado = "parado"; //Como todo ascensor inicia parado
    }

    //Método para mostrar donde esta ubicado el ascensor
    public void mostrarPisoAscensor() {
        Random random = new Random();
        ubnAscensor = random.nextInt(4) + 0;
        System.out.println("\n El ascensor esta " + estado + " en el piso " + ubnAscensor + "\n");
    }

    //Método para mover el ascensor
    public void mover(int pisoDestino)  {
        try{

            //Condicional para saber mostrar el estado del ascensor
            if (pisoDestino > ubnAscensor) {
                estado = "subiendo";
            } else {
                estado = "bajando";
            }

            System.out.println("El ascensor está " + estado);

            //Este ciclo permite simular que el ascensor está subiendo o bajando
            while(pisoDestino != ubnAscensor) {
                if (pisoDestino > ubnAscensor){
                    ubnAscensor++;
                }else{
                    ubnAscensor--;
                }
                System.out.println("Ascensor en el piso " + ubnAscensor );
                Thread.sleep(2000);
            }

            System.out.print("El ascensor a llegado al piso " + ubnAscensor + " ");
            btnsAscensor.senalConfirmationApagada();
            Thread.sleep(1000);
            puertaAscensor.abrirPuerta();
            puertaPiso.abrirPuerta();
            Thread.sleep(1000);
            estado = "parado";
            System.out.println("Las puertas del ascensor y del piso " + ubnAscensor + " están abiertas.");
            Thread.sleep(5000);
            puertaPiso.cerrarPuerta();
            puertaAscensor.cerrarPuerta();
            System.out.println("Las puertas del ascensor y del piso " + ubnAscensor + " están cerradas.");


        }catch (InterruptedException e){
            System.out.println("El ascensor esta en el piso " + ubnAscensor);
        }



    }

    //Método para presionar los botones que están en del dentro del ascensor
    public void psrBtnAscensor(int pisoDestino) {
        btnsAscensor.presionar(pisoDestino);
        mover(pisoDestino);
    }

    public void mostrarBtns(){
        System.out.println("  Pisos: ");
        System.out.println("---------");
        System.out.println("|   0   |");
        System.out.println("---------");
        System.out.println("|   1   |");
        System.out.println("---------");
        System.out.println("|   2   |");
        System.out.println("---------");
        System.out.println("|   3   |");
        System.out.println("---------");
        System.out.println("|   4   |");
        System.out.println("---------");

    }


}

