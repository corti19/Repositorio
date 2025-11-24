import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el IBAN: ");
        String iban = sc.nextLine();

        System.out.print("Introduce el titular: ");
        String titular = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);

        if (!cuenta.validarIBAN())
        {
            System.out.println("IBAN no válido. Programa finalizado.");
            return;
        }

        int opcion;
        do {
            System.out.println("\n===== MENÚ DAWBANK =====");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("IBAN: " + cuenta.getIBAN());
                    System.out.println("Titular: " + cuenta.getTitular());
                    System.out.println("Saldo: " + cuenta.getSaldo() + "€");
                    break;

                case 2:
                    System.out.println("IBAN: " + cuenta.getIBAN());
                    break;

                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;

                case 4:
                    System.out.println("Saldo: " + cuenta.getSaldo() + "€");
                    break;

                case 5:
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    cuenta.ingreso(ingreso);
                    break;

                case 6:
                    System.out.print("Cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirada(retiro);
                    break;

                case 7:
                    cuenta.mostrarMovimientos();
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        sc.close();
    }
}

