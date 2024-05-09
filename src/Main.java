import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //============= (1) instancias de productos ============================

        Chair chair1 = new Chair(10,"silla1",500000L,true);
        Chair chair2 = new Chair(5,"silla2",220000L,false);

        Desk desk1 = new Desk(4,"escritorio1",150000L,75.5f,150f);
        Desk desk2 = new Desk(1,"escritorio2",150000L,80f,200.2f);

        Notebook notebook1 = new Notebook(20,"notebook1",600000L,"Dell",1000);
        Notebook notebook2 = new Notebook(12,"notebook2",1200000L,"Apple",2000);

        Printer printer1 = new Printer(15,"impresora1",150000L,"HP",10000);
        Printer printer2 = new Printer(8,"impresora2",300000L,"Dell",15000);

        // =========================== (3) Crear una instancia de cada clase y agregarla a un List.
        // =========================== Luego recorrerlo mostrando por pantalla el tipo de instancia que es.

        Shop shop = new Shop();
        shop.addProducts(chair1);
        shop.addProducts(notebook1);
        shop.addProducts(desk2);
        shop.addProducts(printer1);
        shop.addProducts(printer2);
        shop.addProducts(notebook2);
        shop.addProducts(chair2);
        shop.addProducts(desk1);

        shop.listProducts();

        System.out.println(chair1.aplicarDecuento(20));
        System.out.println(printer1.aplicarDecuento(50));


        shop.actualizarPrecios();

        shop.listProducts();




    }
}
