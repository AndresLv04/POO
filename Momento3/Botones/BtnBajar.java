package Momento3.Botones;

public class BtnBajar extends Boton{

   
   //Método para presionar el boton de bajada y saber que fue presionado
    @Override
    public void presionar() {
        System.out.println("El boton de bajada a sido presionado");
        iluminar();
        sonido();
    }

    //Método para iluminar el boton de bajada lo que indica que este fue presionado
    @Override
    public void iluminar() {
        System.out.println("El boton de bajada esta iluminado");
    }

}