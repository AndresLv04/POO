package JuegoLucha;

public abstract class Personaje {
    protected String nombre;
    protected int puntosVida;
    protected int MAX_DANO;
    protected int MIN_DANO;

    
    public Personaje(String nombre, int MAX_DANO, int MIN_DANO) {
        this.nombre = nombre;
        this.puntosVida = 100;
        this.MAX_DANO = MAX_DANO;
        this.MIN_DANO = MIN_DANO;
    }


    public String getNombre() {
        return nombre;
    }


    public int getPuntosVida() {
        return puntosVida;
    }

    public void recibirDanos(int dano){
        this.puntosVida -= dano;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
    }

    public boolean estaVivo(){
        return this.puntosVida > 0;
    }
    
    public abstract void atacar(Personaje oponente); //Cada personaje tendra un ataque diferente
}
