package Ejercicio1;

public abstract class Persona {
    protected String nombres;
    protected String apellidos;
    protected int edad;
    
    
    
    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }



    public abstract double pagar();


}
