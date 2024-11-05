import java.util.Scanner;

public class SistemaControl {
    private Ascensor ascensor = new Ascensor();
    private Piso[] pisos;
    private Scanner sc;

    public SistemaControl(){
        this.ascensor = new Ascensor();
        this.pisos = new Piso[5];
        this.sc = new Scanner(System.in);

        //For que permite crear los pisos  y enlazarlos al ascensor
        for(int i = 1; i < pisos.length; i++){
            pisos[i] = new Piso(ascensor);

        }
    }

    public void manejarSolicitud(){
        ascensor.mostrarPisoAscensor();

        System.out.println("Subir o bajar");
        String btn = sc.nextLine();


        System.out.print("¿En que piso estas?: ");
        int pisoActual = sc.nextInt();
        while(pisoActual < 0 || pisoActual > pisos.length ){
            System.out.print("Piso no existe... por favor, ingresa un piso valido: ");
            pisoActual = sc.nextInt();
        }


        if (btn.equalsIgnoreCase("subir") && pisoActual < pisos.length){
            pisos[pisoActual].presionarBtnSubir(pisoActual);
        } else if (btn.equalsIgnoreCase("bajar") && pisoActual < pisos.length) {
            pisos[pisoActual].presionarBtnBajar(pisoActual);
        }else{
            System.out.println("Piso incorrecto");
        }

        System.out.print("¿Que piso vas?: ");
        int pisoDestino = sc.nextInt();
        ascensor.psrBtnAscensor(pisoDestino);
    }

    public void manejarAscensor(){

    }
}

