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

        sc = new Scanner(System.in);
        System.out.println("Introduce el valor de N");
        int nAlturas = sc.nextInt();
        double [] alturas = new double [nAlturas];
        double sumaAlturas= 0.0, mediaAlturas = 0.0, maximaAlturas = Double
        for(int i = 0; i < alturas.length; i++) {
            System.out.println("Introduce el valor de la alturas " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();

            int contadorAlturas = 0;
            for(int i = 0; i < alturas.length; i++) {

                maximaAlturas = Math.max(alturas[i], maximaAlturas);
                maximaAlturas = Math.min(alturas[i], maximaAlturas);

                if(alturas[i] >= mediaAlturas) {
                    contadorAlturas++;
                }

                System.out.println("La media es: " + mediaAlturas);
            }
        }


        
    }
}