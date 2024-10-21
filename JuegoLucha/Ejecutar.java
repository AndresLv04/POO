package JuegoLucha;

public class Ejecutar {
    public static void main(String[] args) {
    

        Personaje objGuerrero = new Guerrero("Andres");
        Personaje objMago = new Mago("Cano");

        JuegoLucha objJuego = new JuegoLucha(objGuerrero, objMago);
        objJuego.iniciarPelea();
        
    }
}
