package Interface1;

public class Cuadrado implements Figura, Dibujable{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    } 
    


    @Override
    public double calcularArea() {

        double resutado = lado * lado;
        return resutado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando el cuadrado..");
    }
}