import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {

        Camara camara1 = new Camara("Canon", "EOS 90D");

        //Creacion de fotos
        Producto objFoto1 = new Foto(1,"MedioAmbiente.png", camara1);
        Producto objFoto2 = new Foto(1, "Evidencia.JPEG",camara1);
        
        //Arreglo para almacenar las fotos creadas
        Foto[] objFotos = {(Foto) objFoto1,(Foto) objFoto2};
        

        //Creación de impresion 
        Producto objImpresion1 = new Impresion(2, "Color", objFotos);
        
        //Creación de cliente
        Cliente objCliente1  = new Cliente("Andres",1222);

        //Creacion de productos a imprimir
        Producto[] objProductos = {objImpresion1};

        //Creación del pedido con todo (su cliente, productos, fecha y n. de tarjeta)
        Pedido objPedido1 = new Pedido(objCliente1, objProductos, new Date(), 111);

        //Imprimir las fotos y el precio a pagar
        ((Impresion) objImpresion1).imprimir();
        System.out.println();

        //Mostrar todo el pedido
        //System.out.println(objPedido1.toString());

       
        
    }
    
}