package Botones;

public class BtnSubir extends Botones {

    //Método para presionar el botón de subida en cualquiera de los pisos donde este botón
    //parámetro piso permite saber donde se presiono el botón
    @Override
    public void presionar(int piso) {
        System.out.print("Presionado botón de subida en el piso " + piso);
        senalConfirmation();
    }
}
