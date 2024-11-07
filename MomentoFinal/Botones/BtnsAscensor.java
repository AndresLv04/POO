package Botones;

public class BtnsAscensor extends Botones{
    //Método que permite saber qué botón de piso fue presionado
    //El parámetro es para saber en a que piso quiere ir
    @Override
    public void presionar(int piso) {
        System.out.println("Presionado el piso " + piso);
        senalConfirmation();
    }
}
