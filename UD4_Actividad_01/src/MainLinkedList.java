import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {


        Producto p1 = new Producto("Teclado", 25);
        Producto p2 = new Producto("Ratón", 30);
        Producto p3 = new Producto("Torre", 15);
        Producto p4 = new Producto("Pantalla", 17);
        Producto p5 = new Producto("Micrófono", 14);

        LinkedList<Producto> productos = new LinkedList<Producto>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

        productos.remove(p3); //Por objeto
        productos.remove(1); //Por número
        productos.add(2, new Producto("Memoria RAM", 15));
        System.out.println("-".repeat(20));
        it = productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        Collections.sort(productos);
        System.out.println("-".repeat(20));
        it = productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        productos.clear();

        System.out.println("-".repeat(20));
        it = productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }


    }

}
