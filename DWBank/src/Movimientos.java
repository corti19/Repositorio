import java.text.SimpleDateFormat;
import java.util.Date;


public class Movimientos {
    private static int contadorID = 1;
    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;


    public Movimientos(String tipo, double cantidad) {
        this.id = contadorID++;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha = sdf.format(new Date());
        this.tipo = tipo;
        this.cantidad = cantidad;
    }


    public void mostrarInfoMovimientos() {
        System.out.println("ID: " + id + " | Fecha: " + fecha + " | Tipo: " + tipo + " | Cantidad: " + cantidad + "€");
    }
}
