import java.util.Arrays;

public class Impresion extends Producto{
    private String color;
    private Foto[] fotos;
    final private int ipnColor = 1200;
    final private int ipnByN = 800;
    
    public Impresion(int num,String color, Foto[] fotos) {
        super(num);
        this.color = color;
        this.fotos = fotos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Foto[] getFotos() {
        return fotos;
    }

    public void setFotos(Foto[] fotos) {
        this.fotos = fotos;
    }

    

    @Override
    public String toString() {
        return "Impresion color: " + color + ", fotos:" + Arrays.toString(fotos);
    }

    public double calcularPrecio(){
        int pTotal = 0;
        if (color.equalsIgnoreCase("Color")) {
            pTotal = ipnColor * fotos.length;
        }else if(color.equalsIgnoreCase("Blanco y negro")){
            pTotal = ipnByN * fotos.length;
        }
        return pTotal;
    }

    public void imprimir(){
        for (Foto foto : fotos)  foto.print();
        System.out.println("El precio a pagar por la impresión es: " + calcularPrecio());
    }




}
