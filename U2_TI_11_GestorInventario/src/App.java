public class App {
    public static void main(String[] args) throws Exception {
                Inventario miInventario =new Inventario(3);

                Producto p1 = new Producto("VSH", "Collar", 1);
                Producto p2 = new Producto("ZRA", "Aretes", 1);
                Producto p3 = new Producto("DAM", "Anillos", 1);
                Producto p4 = new Producto("LFI", "Esclavas", 1);

                System.out.println("Agregar:"+miInventario.agregarProducto(p1));
                System.out.println("Agregar:"+miInventario.agregarProducto(p2));
                System.out.println("Agregar:"+miInventario.agregarProducto(p3));
                System.out.println("Agregar:"+miInventario.agregarProducto(p4));
               

                miInventario.buscar("VSH");
                miInventario.buscar("LFI");

                System.out.println("Elimina VSH: "+miInventario.eliminarProducto("VSH"));
                System.out.println("Busca VSH: "+miInventario.buscar("VSH"));


                System.out.println("Total de productos:"+ miInventario.totalProductos());

    }
}
