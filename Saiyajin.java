public class Saiyajin extends Heroe {

public Saiyajin(String nombre, int poder, int vida) {
super(nombre, poder, vida);
}
@Override
public void atacar(Personaje enemigo) {
System.out.println(nombre + " Lanzar un Kamehameha triple !#@ ");
enemigo.vida -= poder * 3; 
if (enemigo.vida < 0) enemigo.vida = 0;
vida -=15;
if (enemigo.vida < 0) enemigo.vida = 0;
}
}