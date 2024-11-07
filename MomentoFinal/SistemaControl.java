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

        System.out.print("¿En que piso estas?: ");
        int pisoActual = sc.nextInt();
        while(pisoActual < 0 || pisoActual >= pisos.length ){
            System.out.print("Piso no existe... por favor, ingresa un piso valido: ");
            pisoActual = sc.nextInt();
        }

        if(pisoActual == pisos.length - 1){
            System.out.println("Estas en el ultimo piso. Solo puedes presionar el botón bajar");
        } else if (pisoActual == 0) {
            System.out.println("Estas en el primer piso. Solo puedes presionar el botón subir");
        }else System.out.println("Subir o bajar");

        sc.nextLine(); //Permite limpiar la entrada
        boolean valida = false;

        do {
            
            String btn = sc.nextLine();
            if (btn.equalsIgnoreCase("subir") && pisoActual < pisos.length - 1){
                pisos[pisoActual].presionarBtnSubir(pisoActual);
                valida = true;

            } else if (btn.equalsIgnoreCase("bajar") && pisoActual > 0) {
                pisos[pisoActual].presionarBtnBajar(pisoActual);
                valida = true;

            }else{
                System.out.println("No puedes " + btn + " por que estas el piso " + pisoActual);
                System.out.println("Por favor, presiona el botón del piso");
            }
    
        } while (!valida);
        

        
        System.out.print("¿Que piso vas?: ");
        int pisoDestino = sc.nextInt();
        ascensor.psrBtnAscensor(pisoDestino);
    }

    public void manejarAscensor(){

    }
}