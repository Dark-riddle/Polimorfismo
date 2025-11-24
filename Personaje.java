public class Personaje {
protected String nombre;
protected int poder;
protected int vida;
public Personaje(String nombre, int poder, int vida) {
this.nombre = nombre;
this.poder = poder;
this.vida = vida;
}

public void atacar(Personaje enemigo) {
System.out.println(nombre + " ataca con un golpe básico ");
enemigo.vida -= poder;
if (enemigo.vida < 0) enemigo.vida = 0;
}
public void mostrarEstado() {
System.out.println(nombre + " tiene " + vida + " puntos de vida.");
}
}