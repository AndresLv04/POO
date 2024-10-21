package ClaseAbstracta;

public abstract class Figura {
    
    protected double x; //Posición en x
    protected double y; //Posición en y


    
    public Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public abstract double calcularArea();
}
