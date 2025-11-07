import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== MaENÚ =====");
            System.out.println("1. Modificar colección");
            System.out.println("2. Estadísticas de la colección");
            System.out.println("3. Ampliar valor de la colección");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            String opcion = sc.nextLine();

            switch (opcion.toLowerCase()) {
                case "0":
                    System.out.println("\nValores actuales del array:");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Posición " + i + ": " + numeros[i]);
                    }
                    break;

                case "1":
                    System.out.print("Introduce el útimo valor: ");
                    int valor = sc.nextInt();

                    System.out.print("Introduce un valor específico: ");
                    int posicion = sc.nextInt();

                    sc.nextLine();

                    if (posicion >= 0 && posicion < numeros.length) {
                        numeros[posicion] = valor;
                        System.out.println("Valor introducido correctamente.");
                    } else {
                        System.out.println("Escogiste una posición");
                    }
                    break;

                case "2":

                    System.out.println("\nEscoja una opción:");
                    System.out.println("a. Suma de todos los valores");
                    System.out.println("b. Media de todos los valores");
                    System.out.println("c. Max de la colección");
                    System.out.println("d. Min de la colección");

                switch (opcion.toLowerCase()) {
                    case "a":

                        int suma = 0;
                        for (int i = 0; i < numeros.length; i++) {
                            numeros[i] = sc.nextInt();
                            suma += numeros[i];
                        }
                        break;

                    case "b":

                        int media = suma / numeros.length;
                        System.out.println("La media es " + media);
                        break;

                    case "c":

                        int max = Integer.MIN_VALUE;

                        for (int i = 0; i < numeros.length; i++) {
                            numeros[i] = sc.nextInt();
                        }

                        for (int i = 1; i < numeros.length; i++) {
                            max = Math.max(numeros[i], max);
                        }
                        break;

                    case "d":

                        int min = Integer.MIN_VALUE;

                        for (int i = 0; i < numeros.length; i++) {
                            numeros[i] = sc.nextInt();
                        }

                        for (int i = 1; i < numeros.length; i++) {
                            min = Math.max(numeros[i], min);
                        }
                        break;

                    default:
                }

                case "3":

                case "4":
                    System.out.println("Saliste");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida compañero.");
            }
        }
    }
}