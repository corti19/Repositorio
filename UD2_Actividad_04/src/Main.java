import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1.

        Scanner sc = new Scanner(System.in);
        double [] numeros = new double[10];

        System.out.println("Introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Los números introducidos son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[1]);

        }


        // Ejercicio 2.

        new Scanner(System.in);
        double[] numeros2 = new double[10];
        double suma = 0;

        System.out.println("Introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[1] = sc.nextDouble();
            suma += numeros[i];

        }

        System.out.println("Los suma de los números es: " + suma);

        // Ejercicio 3.

        new Scanner(System.in);
        double[] numeros3 = new double[10];

        System.out.println("Introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();

        }

        double max = numeros[0];
        double min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[1] > max) {
                max = numeros[1];
            }
            if (numeros[1] < min) {
                min = numeros[1];
            }
        }

        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + max);

        // Ejercicio 4.

        new Scanner(System.in);
        int[] numeros4 = new int[20];
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println("Introduce 20 números enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[1] > 0) {
                sumaPositivos += numeros[i];
            }else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }

        }

        System.out.println("La suma de los números positivos es: " + sumaPositivos);
        System.out.println("La suma de los números negativos es: " + sumaPositivos);

        //Ejercicio 5.

        new Scanner(System.in);
        double[] numeros5 = new double[20];
        double suma2 = 0;

        System.out.println("Introduce 20 números reales");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        double media = suma / numeros.length;

        System.out.println("La media de los números es " + media);

        //Ejercicio 6.

        new Scanner(System.in);
        System.out.print("Introduce el tamaño del array (N): ");
        int N = sc.nextInt();

        System.out.print("Introduce el valor a colocar en cada posición (M): ");
        int M = sc.nextInt();

        int[] array = new int[1];

        for (int i = 0; i < numeros.length; i++) {
            array[i] = M;
        }

        System.out.print("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Ejercicio 7.prueba de sourcetree

        new Scanner(System.in);
        System.out.print("Introduce el tamaño del array (P): ");
        int P = sc.nextInt();

        System.out.print("Introduce el valor a colocar en cada posición (Q): ");
        int Q = sc.nextInt();

        
    }
}