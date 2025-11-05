import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Juego: Piedra, Papel o Tijera ===");
        System.out.println("Reglas:");
        System.out.println(" - Escribe 'piedra', 'papel' o 'tijera' para jugar.");
        System.out.println(" - Escribe 'salir' para terminar la partida.");

        // Variable para guardar la elección del jugador
        String jugador = "";

        // Bucle para repetir el juego hasta que el jugador escriba "salir"
        while (true) {
            System.out.print("\nTu jugada: ");
            jugador = sc.nextLine().toLowerCase(); // Convertimos a minúsculas para que no haya errores

            // Si el jugador quiere salir, se rompe el bucle
            if (jugador.equals("salir")) {
                System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                break;
            }

            // Se comprueba si se ha escrito una jugada válida
            if (!jugador.equals("piedra") && !jugador.equals("papel") && !jugador.equals("tijera")) {
                System.out.println("Entrada no válida. Debes escribir piedra, papel o tijera.");
                continue; // vuelve al inicio del bucle
            }

            // Se genera una jugada aleatoria
            int aleatorio = random.nextInt(3); // número entre 0 y 2
            String ordenador = "";

            if (aleatorio == 0) {
                ordenador = "piedra";
            } else if (aleatorio == 1) {
                ordenador = "papel";
            } else {
                ordenador = "tijera";
            }

            // Se muestra la jugada
            System.out.println("El ordenador ha elegido: " + ordenador);

            // Con esto se compara la jugada
            if (jugador.equals(ordenador)) {
                System.out.println("Empate.");
            } else if ((jugador.equals("piedra") && ordenador.equals("tijera")) ||
                    (jugador.equals("papel") && ordenador.equals("piedra")) ||
                    (jugador.equals("tijera") && ordenador.equals("papel"))) {
                System.out.println("¡Has ganado!");
            } else {
                System.out.println("Has perdido.");
            }
        }

        // Se cierra el scanner
        sc.close();
    }
}
