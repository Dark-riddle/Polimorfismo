

public class BatallaPolimorfica {
    
public static void main(String[] args) {
    
    Personaje[] luchadores = {
new Heroe("Goku", 30, 100),
new Villano("Freezer", 25, 120),
new Heroe("Vegeta", 28, 100),
new Villano("broly", 40, 130),
new Saiyajin("Gohan", 50, 130),
new Villano("Cell", 20, 110),

};
System.out.println(" ¡Comienza la batalla polimórfica! \n");

for (int i = 0; i < luchadores.length - 1; i++) {
Personaje atacante = luchadores[i];
Personaje enemigo = luchadores[i + 1];

atacante.atacar(enemigo);
enemigo.mostrarEstado();
System.out.println("--------------------------");
}
System.out.println(" ¡Fin de la batalla!");
}
}
