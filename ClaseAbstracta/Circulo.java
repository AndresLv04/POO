package ClaseAbstracta;

public class Circulo extends Figura{

    private double radio;

    

    public Circulo() {
        
    }



    public Circulo( double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }



    @Override
    public double calcularArea() {
        final double pi = 3.14;
        double resultado = pi*radio *radio;
        return resultado;
    }

    
}