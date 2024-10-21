package Interface1;

public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    

    public Circulo() {
        
    }



    public Circulo( double radio) {
        
        this.radio = radio;
    }



    @Override
    public double calcularArea() {
        final double pi = 3.14;
        double resultado = pi*radio *radio;
        return resultado;
    }



    @Override
    public void rotar() {
        System.out.println("Hola, esoy rotando un circulo...");
    }



    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un circulo");
    }

    
}