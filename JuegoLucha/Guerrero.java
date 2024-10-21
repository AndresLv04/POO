package JuegoLucha;

import java.util.Random;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, 40, 5);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((40 - 5) + 1) + 5;
        oponente.recibirDanos(dano);
        System.out.println(this.getNombre() + " ataca con una lanza a " + oponente.getNombre() + " causando " + dano + " de daño");
    }
    
}
