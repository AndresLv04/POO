import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {

        Camara camara1 = new Camara("Canon", "EOS 90D");

        Foto objFoto1 = new Foto(1, "MedioAmbiente.png",camara1);
        Foto obFoto2 = new Foto(1, "EquipoUCC.JPG",camara1);
        Foto objFoto3 = new Foto(1, "Evidencia.JPEG",camara1);
        
        Foto[] ipnFoto1 = {objFoto1};
        

        Impresion objImpresion1 = new Impresion(2, "Color", ipnFoto1);
        
        
        Cliente objCliente1  = new Cliente("Andres",1222);

        
        Producto[] objProductos = {objImpresion1};
        Pedido objPedido1 = new Pedido(objCliente1, objProductos, new Date(), 111);

        
        objImpresion1.imprimir();
        System.out.println();
        System.out.println(objPedido1.toString());
       
        
    }
    
}