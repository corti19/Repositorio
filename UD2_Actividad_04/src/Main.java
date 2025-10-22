import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1.

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        /* System.out.println(Arrays.toString(numerosReales)); <-Esto hace lo mismo */


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
        double[] numerosReales = new double[10];

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        System.out.println("Introduce 10 números reales:");
        for (int i = 0; i < numerosReales.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosReales[i] = sc.nextDouble();

        }

        for (int i = 1; i < numeros.length; i++) {
            max = Math.max(numerosReales[i], max);
            min = Math.min(numerosReales[i], min);

        }

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
            } else if (numeros[i] < 0) {
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

        //Ejercicio 7.

        new Scanner(System.in);
        System.out.print("Introduce el tamaño del array (P): ");
        int P = sc.nextInt();

        System.out.print("Introduce el valor a colocar en cada posición (Q): ");
        int Q = sc.nextInt();

        int tamanho = Math.abs(Q - P) + 1;
        int[] array2 = new int[tamanho];

        if (P <= Q) {
            for (int i = 0; i < tamanho; i++) {
                array[i] = P + i;
            }

        }else {
            for (int i = 0; i < tamanho; i++) {
                array[i] = P + i;
            }
        }
     System.out.print("El arreglo generado es: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        //Ejercicio 8.

        sc = new Scanner(System.in);
        double [] numeros3 = new double [100];
        for(int i = 0; i < numeros3.length; i++) {
            numeros3 [i] = Math.random();
        }

        System.out.println("Introduce el valor de R (entre 0 y 1)");
        double r = sc.nextDouble();
        int contadorMayores = 0, contadorMenores = 0;
        for(int i = 0; i < numeros3.length; i++) {
            if(numeros3 [i] >= r) {
                contadorMayores++;
            }

            else {
                contadorMenores++;
            }
        }

        System.out.println("Los numeros mayores que r son; " + contadorMayores);
        System.out.println("Los numeros menores que r son; " + contadorMenores);

        //Ejercicio 9.

        sc = new Scanner(System.in);
        int [] numeros6 = new int [100];

        for(int i = 0; i < numeros6.length; i++) {
            numeros6 [i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Introduce el valor de N");
        int nBuscar = sc.nextInt();

        for(int i = 0; i < numeros6.length; i++) {
            if(numeros6[i] == nBuscar) {
                System.out.println("Aparece en la posición; " + i);
            }
        }

        //Ejercicio 10.


        //Ejercicio 11.

        sc = new Scanner(System.in);
        int[] array9 = new int[100];
        int[] array10 = new int[100];

        for (int i = 0; i < 100; i++) {
            array9[i] = i +1;
        }

        for (int i = 0; i < 100; i++) {
            array10[i] = array9[99-1];
        }

        System.out.println("Array 9 (1 al 100);");
        for (int i = 0; i < 100; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println("\n\nArray 10 (orden inverso):");

        for (int i = 0; i < 100; i++) {
            System.out.println(array10[i] + " ");
        }

        //Ejercicio 12.

        new Scanner(System.in);
        int[] numeros14 = new int[10];
        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== MENÚ =====");
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
        //Ejercicio 13.

        new Scanner(System.in);

        System.out.print("Introduce el valor inicial (V): ");
        int V = sc.nextInt();

        System.out.print("Introduce el incremento (I): ");
        int I = sc.nextInt();

        System.out.print("Introduce la cantidad de valores (N): ");
        int N1 = sc.nextInt();

        int[] secuencia = new int[N1];

        for (int i = 0; i < N1; i++) {
            secuencia[i] = V + (I * i);
        }

        System.out.println("\nLa secuencia aritmética generada es:");
        for (int i = 0; i < N1; i++) {
            System.out.print(secuencia[i]);
            if (i < N1 - 1) {
                System.out.print(", ");
            }
        }

        //Ejercicio 14.

        int tamanho2 = 0;
        for (int i = 1; i <= 10; i++) {
            tamanho2 += i;
        }

        int[] secuencia2 = new int[tamanho2];
        int indice = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                secuencia2[indice] = i;
                indice++;
            }
        }
        
        System.out.println("Secuencia generada:");
        for (int i = 0; i < secuencia2.length; i++) {
            System.out.print(secuencia2[i] + " ");
        }


    }
}

