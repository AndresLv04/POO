package Interface1;

public class Ejecutar {
    public static void main(String[] args) {
        Cuadrado cuadra = new Cuadrado(3);
        Circulo circulo = new Circulo(3);
        System.out.println(cuadra.calcularArea());
        cuadra.dibujar();
        System.out.println();
        System.out.println(circulo.calcularArea());
        circulo.dibujar();
        circulo.rotar();

    }
}
