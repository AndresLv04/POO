import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {

        Camara camara1 = new Camara("Canon", "EOS 90D");



        Producto objFoto1 = new Foto(1,"MedioAmbiente.png", camara1);
        Producto objFoto2 = new Foto(1, "Evidencia.JPEG",camara1);
        
        Foto[] objFotos = {(Foto) objFoto1,(Foto) objFoto2};
        

        Producto objImpresion1 = new Impresion(2, "Color", objFotos);
        
        
        Cliente objCliente1  = new Cliente("Andres",1222);

        
        Producto[] objProductos = {objImpresion1};
        Pedido objPedido1 = new Pedido(objCliente1, objProductos, new Date(), 111);

        
        ((Impresion) objImpresion1).imprimir();
        System.out.println();
        System.out.println(objPedido1.toString());

       
        
    }
    
}