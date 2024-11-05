package MomentoFinal.Botones;

public class BtnSubir extends PlantillaBtns {

    //Método para presionar el botón de subida en cualquiera de los pisos donde este botón
    //parámetro piso permite saber donde se presiono el botón
    @Override
    public void presionar(int piso) {
        System.out.println("Presionado botón de subida en el piso " + piso);
        senalConfirmation();
    }
}
