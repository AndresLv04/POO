package Momento3;

public class BtnSubida extends Boton {

    //Método para presionar el botón de subida y saber que fue presionado
    @Override
    public void presionar() {
        System.out.println("El boton de subida a sido presionado");
        iluminar();
        sonido();
    }

    //Método para hacer la simulación que el botón de subida esta iluminda lo que significa que fue presionado
    
    @Override
    public void iluminar() {
        System.out.println("El botón se subida esta iluminado");
    }
    
}
