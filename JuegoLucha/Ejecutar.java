package JuegoLucha;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre para el jugador 1");
        String jNombre1 = sc.nextLine();
        System.out.println("Nombre para el jugador 2");
        String jNombre2 = sc.nextLine();


        Personaje objGuerrero = new Guerrero(jNombre1);
        Personaje objMago = new Mago(jNombre2);

        JuegoLucha objJuego = new JuegoLucha(objGuerrero, objMago);
        objJuego.iniciarPelea();
        
    }
}
