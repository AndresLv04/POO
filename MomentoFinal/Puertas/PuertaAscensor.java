package Puertas;

public class PuertaAscensor implements Puerta {

    //Método del comportamiento de la puerta del ascensor, tanto de abrir como de cerrar
    @Override
    public void abrirPuerta() {
        System.out.println("Abriendo puerta del ascensor ") ;
    }

    @Override
    public void cerrarPuerta() {
        System.out.println("Cerrando puerta ascensor");
    }
}
