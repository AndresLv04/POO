package Puertas;

public class PuertaPiso implements Puerta{

    //Métodos del comportamiento de las puertas de los pisos
    @Override
    public void abrirPuerta() {
        System.out.println("Abriendo puerta del piso ");
    }

    @Override
    public void cerrarPuerta() {
        System.out.println("Cerrando puerta del piso");
    }
}
