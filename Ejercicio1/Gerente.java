package Ejercicio1;

public class Gerente extends Persona {

    private int ventas;
    final private double salario = 1200000;
    final private double pVenta = 10000;

    public Gerente(String nombres, String apellidos, int edad, int ventas) {
        super(nombres, apellidos, edad);
        this.ventas = ventas;
    }

    @Override
    public double pagar() {
        double pagar = (pVenta * ventas) + salario;
        return pagar;
    }
    
}
