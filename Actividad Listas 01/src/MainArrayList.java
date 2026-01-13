import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainArrayList {
    public static void main(String[] args) {
        Producto p1 = new Producto ("Teclado" ,25);
        Producto p2 = new Producto ("Ratón" ,30);
        Producto p3 = new Producto ("Torre" ,15);
        Producto p4 = new Producto ("Pantalla" ,17);
        Producto p5 = new Producto ("Micrófono" ,14);

        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
/*
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }


        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }

  */
        Iterator<Producto> it=productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }


        productos.remove(p3); //Por objeto
        productos.remove(1); //Por número
        productos.add(2,new Producto ("Memoria RAM", 15));
        System.out.println("-".repeat(20));
        it=productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        Collections.sort(productos);
        System.out.println("-".repeat(20));
        it=productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        productos.clear();

        System.out.println("-".repeat(20));
        it=productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

    }
}
