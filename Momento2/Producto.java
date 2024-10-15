public class Producto {

    private int num;
    

    public Producto(int num) {
        this.num = num;
    }

    public int getNumero() {
        return num;
    }

    public void setNumero(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Producto numero: " + num;
    }

    
}