import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 12.

        Scanner sc = new Scanner(System.in);
        int[] numeros14 = new int[10];
        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== MaENÚ =====");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción: ");

            String opcion = sc.nextLine();

            switch (opcion.toLowerCase()) {
                case "a":
                    System.out.println("\nValores actuales del array:");
                    for (int i = 0; i < numeros14.length; i++) {
                        System.out.println("Posición " + i + ": " + numeros14[i]);
                    }
                    break;

                case "b":
                    System.out.print("Introduce un valor entero: ");
                    int valor = sc.nextInt();

                    System.out.print("Introduce una posición (0-9): ");
                    int posicion = sc.nextInt();

                    sc.nextLine();

                    if (posicion >= 0 && posicion < numeros14.length) {
                        numeros14[posicion] = valor;
                        System.out.println("Valor introducido correctamente.");
                    } else {
                        System.out.println("⚠Posición no válida. Debe estar entre 0 y 9.");}
                    break;

                case "c":
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}