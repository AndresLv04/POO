package Botones;

public class BtnsAscensor extends PlantillaBtns{
    //Método que permite saber qué botón de piso fue presionado
    @Override
    public void presionar(int piso) {
        System.out.println("Presionado el piso " + piso);
        senalConfirmation();
    }
}
