package ClaseAbstracta;

public class Ejecutar {
    public static void main(String[] args) {
        Cuadrado cuadra = new Cuadrado(2,2,3);
        Circulo circulo = new Circulo(3,2,3);
        System.out.println(cuadra.calcularArea());
        System.out.println(circulo.calcularArea());

    }
}
