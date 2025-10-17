import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Ejercicio 1: Escribe un programa que de los "Buenos días".
        System.out.println("Ejercicio01");

        System.out.println("Buenos dias");

        /*
       Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
        */

          System.out.println("Ejercicio02");

          double lado = 5;
          double area = lado*lado;
          System.out.println("Lado es: "+lado);
          System.out.println("Area es: "+area);

          /*
        Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
        */

        System.out.println("Ejercicio03");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del cuadrado");
        double lado2 = sc.nextDouble();

        double area2 = lado2*lado2;
        System.out.println("Lado es: "+lado2);
        System.out.println("Area es: "+area2);

        /*
        Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, prodcucto y división.
        */

        System.out.println("Ejercicio04");
        sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2 = sc.nextDouble();

        double suma = numero1+numero2;
        double resta = numero1-numero2;
        double multiplicacion = numero1*numero2;
        double division = numero1/numero2;

        System.out.println("La suma de:" + numero1 + "+" + numero2 + "=" +suma);
        System.out.println("La resta de:" + numero1 + "-" + numero2 + "=" +resta);
        System.out.println("La multiplicación de:" + numero1 + "*" + numero2 + "=" +multiplicacion);
        System.out.println("La división de:" + numero1 + "/" + numero2 + "=" +division);


        /*
        Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de la esfera que corresponde con dicho radio.
        */

        sc = new Scanner(System.in);
        System.out.println("Ejercicio05");

        System.out.println("Ingrese el radio");
        double radio = sc.nextDouble();

        double circulo = 2 * Math.PI * radio;
        System.out.println("Perimetro: " + circulo);
        double areaC = Math.PI * radio * radio;
        System.out.println("Area: " + areaC);
        double volumenE = (4.0/3.0) * Math.PI * Math.pow(areaC, 3);
        System.out.println("Volumen: " + volumenE);


        /*
        Ejercicio 6: Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado.
        */

        System.out.println("Ejercicio6");
        sc = new Scanner(System.in);

        System.out.println("Valor del producto sin descuento");
        double valorND = sc.nextDouble();
        System.out.println("Valor del producto con descuento");
        double valorD = sc.nextDouble();

        double descuento = ((valorND - valorD) / valorND) * 100;
        System.out.println("El descuento es:" + descuento + "%");


        /*
        Ejercicio 7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
        */

        System.out.println("Ejercicio7");
        sc = new Scanner(System.in);

        System.out.println("Distancia Millas");
        double ValorMillas = sc.nextDouble();
        System.out.println("Millas: " + ValorMillas);

        double metros = ValorMillas * 1852;
        System.out.println("La distancia equivalente en metros es: " + metros);


        /*
        Ejercicio 8: Escribe un programa que lee dos números y los visualiza en orden ascendente.
         */

        System.out.println("Ejercicio8");
        sc = new Scanner(System.in);

        System.out.println("Escribe valor del primer número");
        double ValorNumero1 = sc.nextDouble();
        System.out.println("Escribe valor del segundo número");
        double ValorNumero2 = sc.nextDouble();

        System.out.println("El orden ascendetente es: " + Math.min(ValorNumero1, ValorNumero2) +
                        " , " + Math.max(ValorNumero1, ValorNumero2));


        /*
        Ejercicio 9: Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
         */

        System.out.println("Ejercicio9");
        sc = new Scanner(System.in);

        System.out.println("Escribe Primer Número");
        double numer1 = sc.nextDouble();
        System.out.println("Escribe Segundo Número");
        double numer2 = sc.nextDouble();

        System.out.println("El mayor es: " + Math.max(numero1, numero2));
        System.out.println("Los números son iguales?: " + (numero1 == numero2));


         /*
        Ejercicio 10: Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
         */

        System.out.println("Ejercicio10");
        sc = new Scanner(System.in);

        System.out.println("Valor Primer número");
        double n1 = sc.nextDouble();
        System.out.println("Valor Segundo número");
        double n2 = sc.nextDouble();
        System.out.println("Valor Tercer número");
        double n3 = sc.nextDouble();

        double max = Math.max(Math.max(n1, n2), n3);
        System.out.println("El valor máximo es: " + max);


          /*
        Ejercicio 11: Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta
        producto y división. (Ten en cuenta la división por cero).
         */

        System.out.println("Ejercicio11");
        sc = new Scanner(System.in);


        System.out.println("Ingrese el primer numero");
        double umero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero (N0 puede ser cero)");
        double umero2 = sc.nextDouble();

        double sum = numero1+numero2;
        double rest = numero1-numero2;
        double multiplicacio = numero1*numero2;
        double divisio = numero1/numero2;

        System.out.println("La suma de:" + numero1 + "+" + numero2 + "=" +suma);
        System.out.println("La resta de:" + numero1 + "-" + numero2 + "=" +resta);
        System.out.println("La multiplicación de:" + numero1 + "*" + numero2 + "=" +multiplicacion);
        System.out.println("La división de:" + numero1 + "/" + numero2 + "=" +division);


         /*
        Ejercicio 12: Escribe un programa que lee 2 números y muestra el mejor.
         */

        System.out.println("Ejercicio12");
        sc = new Scanner(System.in);

        System.out.println("Escribe Primer Número");
        double nuero1 = sc.nextDouble();
        System.out.println("Escribe Segundo Número");
        double nuero2 = sc.nextDouble();

        System.out.println("El mayor es: " + Math.max(numero1, numero2));


        /*
        Ejercicio 13: Escribe un programa que lee un número y me dice si es positivo o negativo consideraremos
        cero como positivo.
         */

        System.out.println("Ejercicio13");
        sc = new Scanner(System.in);

        System.out.println("Valor Primer número");
        double nu1 = sc.nextDouble();

        System.out.println("El mayor es positivo?: " +(nu1 >=0));















    }
}