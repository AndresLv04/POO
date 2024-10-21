package JuegoLucha;

import java.util.Random;

public class Mago extends Personaje{

    public Mago(String nombre) {
        super(nombre, 60, 1);
        
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((60 - 1) + 1) + 1;
        oponente.recibirDanos(dano);
        System.out.println(this.getNombre() + " ataca con una bola de fuego a " + oponente.getNombre() + " causando " + dano + " de daño");
    }
    
}
