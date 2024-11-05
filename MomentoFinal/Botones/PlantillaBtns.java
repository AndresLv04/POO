package Botones;

//Clase que será la plantilla para los botones tanto los del piso como los del ascensor
public abstract class PlantillaBtns {

    //Método qué muestra la señal de confirmación que un botón fue presionado
    public void senalConfirmation(){
        System.out.println("Emitiendo sonido y luz encendida");
    }

    //Método para apagar la señal de confirmación de la luz
    public void senalConfirmationApagada(){
        System.out.println("Apagada luz");
    }

    //Método abstracto que permite representar la acción que fue presionado
    //los diferentes botones que están el piso y dentro del ascensor
    //El parámetro es para saber en qué piso se presionó y luego saber que piso quiere ir
    public abstract void presionar(int piso);



}
