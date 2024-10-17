public class Foto extends Producto{
    private String fichero;
    private Camara camara;
     
    public Foto(int num, String fichero, Camara camara){
        super(num);
        this.fichero = fichero;
        this.camara = camara;
    }

    public void print(){
        System.out.println("Imprimiento la foto: " + fichero + " foto desde la camara" + camara);
    }

    @Override
    public String toString() {
        return "fichero:" + fichero + " camara: " + camara ;
    }

    

    
}