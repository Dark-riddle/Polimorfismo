public class Heroe extends Personaje {
public Heroe(String nombre, int poder, int vida) {
super(nombre, poder, vida);
}
@Override
public void atacar(Personaje enemigo) {
System.out.println(nombre + " lanza un Kamehameha ");
enemigo.vida -= poder * 2; 
if (enemigo.vida < 0) enemigo.vida = 0;
}
}
