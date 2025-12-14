public class Villano extends Personaje {
public Villano(String nombre, int poder, int vida) {
super(nombre, poder, vida);
}
@Override
public void atacar(Personaje enemigo) {
System.out.println(nombre + "lanza un Rayo de la Muerte ");
enemigo.vida -= poder * 1.5; 
if (enemigo.vida < 0) enemigo.vida = 0;
}

}
