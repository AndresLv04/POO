import java.util.Arrays;

public class Impresion extends Producto{

    //Atributos
    private String color;
    private Foto[] fotos;
    final private int ipnColor = 1200; //Precio de impresiones a color no cambia
    final private int ipnByN = 800; //Precio de impresiones a blanco y negro no cambia
    
    //Constructor
    public Impresion(int num,String color, Foto[] fotos) {
        super(num);
        this.color = color;
        this.fotos = fotos;
    }

    //Método get y set
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

    //Método para calcular el precio de la cantidad de fotos a imprimir dependiendo el si es a color o no
    public double calcularPrecio(){
        int pTotal = 0;
        if (color.equalsIgnoreCase("Color")) {
            pTotal = ipnColor * fotos.length;
        }else if(color.equalsIgnoreCase("Blanco y negro")){
            pTotal = ipnByN * fotos.length;
        }
        return pTotal;
    }

    //Método para imprimir cada foto y el precio a pagar
    public void imprimir(){
        for (Foto foto : fotos)  foto.print();
        System.out.println("El precio a pagar por la impresión es: " + calcularPrecio());
    }




}
