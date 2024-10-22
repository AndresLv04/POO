import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {
       
        // Creación de una cámara
        Camara camara1 = new Camara("Canon", "EOS 90D");

        // Creación de fotos
        Producto objFoto1 = new Foto(1, "MedioAmbiente.png", camara1);
        Producto objFoto2 = new Foto(1, "Evidencia.JPEG", camara1);

        // Arreglo de fotos para imprimir
        Foto[] objFotos = {(Foto) objFoto1, (Foto) objFoto2};

        // Creación de una impresión 
        Producto objImpresion1 = new Impresion(2, "Color", objFotos);

        // Creación de un cliente
        Cliente objCliente1 = new Cliente("Andres", 1222);

        // Creación de arreglo donde van estar los productos del cliente
        Producto[] objProductos = {objImpresion1};

        // Creación de un pedido con todo (el cliente, productos y fecha actual)

        Pedido objPedido1 = new Pedido(objCliente1, objProductos, new Date(), 111);

        // Imprimir las fotos e información de la impresión
        ((Impresion) objImpresion1).imprimir();
        System.out.println();
        
        // Imprimir de todo el pedido que realizo el cliente
        System.out.println(objPedido1.toString());
    }
}
