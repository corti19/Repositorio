import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n Ejercicio 1");
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");

        edad = entrada.nextInt();
        if (edad >=18) {
            System.out.println("Eres mayor de edad");
        }

        System.out.println("\n Ejercicio 2");
        Scanner sc = new Scanner(System.in);
        int Edad;
        System.out.println("Ingrese su edad");

        Edad = sc.nextInt();
        if (Edad >=18) {
            System.out.println("Eres mayor de edad");
        } else if ( Edad <=17 && Edad >= 0) {
            System.out.println("Eres menor de edad");
        }
        else{
            System.out.println("La edad no tiene sentido");
        }

        System.out.println("\n Ejercicio 3");
        sc = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.println("Numero:" + i);
        }

        System.out.println("\n Ejercicio 4");
        sc = new Scanner(System.in);
        for (int i = 0; i <= 200; i +=2) {
            System.out.println("Numero:" + i);
        }

        System.out.println("\n Ejercicio 5");
        sc = new Scanner(System.in);
        for (int i = 2; i <= 200; i++)
            if(1 % 2 == 0){
                System.out.println("Numero:" + i);
            }

        System.out.println("\n Ejercicio 6");
        sc = new Scanner(System.in);
        int max;
        System.out.print("Introduce el numero:");
        max = sc.nextInt();
        for (int i = 1; i <= max; i++) {
            System.out.println("Numero:" + i);
        }


        System.out.println("\n Ejercicio 7");
        sc = new Scanner(System.in);
        int nota;
        System.out.println("Introduce tu calificacion entre el 0 y el 10");
        nota = sc.nextInt();
        if (nota <= 3) {
            System.out.println("Muy deficiente");
        } else if (nota <= 5) {
            System.out.println("Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Sobresaliente");
        }

        System.out.println("\n Ejercicio 8");
        sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Error: el número debe ser positivo.");
        } else {
            int factorial = 1;

            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + N + " es: " + factorial);

        }

        System.out.println("\n Ejercicio 9");
        sc = new Scanner(System.in);

        System.out.println("Introduce los segundos: ");
        int = segundos = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int = segundos = sc.nextInt();
        System.out.println("Introduce las horas: ");
        int = segundos = sc.nextInt();

        System.out.println("La hora actual es: " + horas + ":" + minutos + ":" + segundos);

        segundos ++;
        if(segundos >= 60) {

            minutos ++,
                    segundos = 0;
            if(minutos >= 60) {
                horas ++;
                minutos = 0;
                if(horas >= 23) {
                    horas = 0;
                }
            }
        }

        System.out.println("La hora modificada es: " + horas + ":" + minutos + "." + segundos);

        System.out.println("\n Ejercicio 10");
        sc = new Scanner(System.in);

        boolean hayNegativos = false;
        for(int i = 0, i < 10; i++) {
            System.out.println("Introduce un número distinto de cero: ");
            double n = sc.nextDouble();
            if( n < 0) {
                hayNegativos = true;
            }
        }

        System.out.println("Hay números negativos: " + hayNegativos);

        System.out.println("\n Ejercicio 11");
        sc = new Scanner(System.in);

        int nPositivos = 0;
        int nNegatvios = 0;
        for(int i = 0, i < 10; i++){
            System.out.println("Introduce un número distinto de cero: ");
            double n = sc.nextDouble();
            if (n < 0) {
                nNegatvios++;
            }
            if (n > 0) {
                nPositivos++;
            }
        }
        System.out-println("Hay" + nNegativos + "números negativos y hay " nPositivos + "números positivos");

        System.out.println("\n Ejercicio 12");
        sc = new Scanner(System.in);

        int numero = 0;
        int numerosNegativos = 0;
        int numerosPositivos = 0;
        do {
            System.out.println("Introduce un número distinto de cero o cero para parar: ");
            numero = sc.nextInt()
            if(numero < 0);
            {
                numerosNegativos++;
            }
            if(numero > 0);
            {
                numerosPositivos++;
            }
        } while(numero != 0);

        System.out.println("Hay" + numerosNegativos + "números negativos y hay" + numerosPositivos + "números positivos");

        System.out.println("\n Ejercicio 13");
        sc = new Scanner(System.in);

        int suma = 0;
        int multiplica = 1;
        for(int i = 1; i <= 10; i++) {
            suma = suma + 1;
            multiplica = multiplica * 1;
        }
        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
        System.out.println("La multiplicación de los 10 primeros números naturales es: " + multiplicación);
    }
}