
public class Foto extends Producto{
    private String fichero;
     
    public Foto(int num, String fichero){
        super(num);
        this.fichero = fichero;
    }

    public void print(){
        System.out.println("Imprimiento la foto: " + fichero);
    }

    @Override
    public String toString() {
        return "fichero:" + fichero;
    }

    

    
}