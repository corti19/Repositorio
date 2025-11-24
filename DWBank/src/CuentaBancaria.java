public class CuentaBancaria {

    private String iban;
    private String titular;
    private double saldo;

    private final double LIMITE_HACIENDA = 3000;
    private final double LIMITE_NEGATIVO = -50;

    private Movimientos[] movimientos = new Movimientos[100];
    private int contadorMovimientos = 0;

    public CuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
    }

    public String getIBAN() { return iban; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public boolean validarIBAN() {
        return iban.matches("^[A-Z]{2}[0-9]{22}$");
    }

    private void registrarMovimiento(String tipo, double cantidad) {
        if (contadorMovimientos < 100) {
            movimientos[contadorMovimientos++] = new Movimientos(tipo, cantidad);
        }
    }

    // Ingreso
    public void ingreso(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        saldo += cantidad;
        registrarMovimiento("Ingreso", cantidad);

        if (cantidad > LIMITE_HACIENDA) {
            System.out.println("AVISO: Notificar a hacienda");
        }
    }

    // Retirada
    public void retirada(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        if (saldo - cantidad < LIMITE_NEGATIVO) {
            System.out.println("No se puede retirar, superaría el límite de -50€.");
            return;
        }

        saldo -= cantidad;
        registrarMovimiento("Retirada", cantidad);

        if (saldo < 0) {
            System.out.println("AVISO: Saldo negativo");
        }

        if (cantidad > LIMITE_HACIENDA) {
            System.out.println("AVISO: Notificar a hacienda");
        }
    }

    // Mostrar movimientos
    public void mostrarMovimientos() {
        if (contadorMovimientos == 0) {
            System.out.println("No hay movimientos.");
            return;
        }

        for (int i = 0; i < contadorMovimientos; i++) {
            movimientos[i].mostrarInfoMovimientos();
        }
    }
}

