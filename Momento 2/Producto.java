public class Producto {

    //Atributo para este atributo es como un id 
    private int num;
    
    //constructor
    public Producto(int num) {
        this.num = num;
    }

    //Métodos get y set
    public int getNumero() {
        return num;
    }

    public void setNumero(int num) {
        this.num = num;
    }

    //Método toString
    @Override
    public String toString() {
        return "Producto numero: " + num;
    }

    
}