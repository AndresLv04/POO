public class Foto extends Producto{

    //Atributos
    private String fichero;
    private Camara camara;
     
    //Constructor
    public Foto(int num, String fichero, Camara camara){
        super(num);
        this.fichero = fichero;
        this.camara = camara;
    }

    //Método para mostrar información de la foto
    public void print(){
        System.out.println("Imprimiento la foto: " + fichero + " foto desde la camara" + camara);
    }

    @Override
    public String toString() {
        return "fichero:" + fichero + " camara: " + camara ;
    }
}
