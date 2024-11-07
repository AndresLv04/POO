package Botones;

public class BtnBajar extends Botones{

    //Método para presionar el botón de bajada en cualquiera de los pisos donde este botón
    @Override
    public void presionar(int piso) {
        System.out.println("Presionado botón de bajar en el piso " + piso);
        senalConfirmation();
    }
}
