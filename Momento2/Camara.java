public class Camara {

    //Atributos
    private String marca;
    private String modelo;

    //Constructor
    public Camara(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    //Método toString
    @Override
    public String toString() {
        return "marca: " + marca + " con el modelo: " + modelo;
    }  

    
}
