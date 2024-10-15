import java.util.Arrays;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int nTC;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int nTC) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.nTC = nTC;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getnTC() {
        return nTC;
    }

    public void setnTC(int nTC) {
        this.nTC = nTC;
    }

    @Override
    public String toString() {
        return "Pedido \n" +
                " Cliente: " + cliente +  
                " \n Productos:  " + Arrays.toString(productos) + 
                " \n Fecha: " + fecha
                + "\n numero de tarjet de credito: " + nTC;
    }
   
}
