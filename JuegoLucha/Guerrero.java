package JuegoLucha;

import java.util.Random;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, 47, 10);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((47 - 10) + 1) + 10;
        oponente.recibirDanos(dano);
        System.out.println(this.getNombre() + " ataca con una lanza a " + oponente.getNombre() + " causando " + dano + " de daño");
    }
    
}
