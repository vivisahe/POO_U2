public class Inventario {
    private Producto[]stock;

    //contructor
    public Inventario (int numstock){
   stock = new Producto[numstock];
    }

   
//metodo agregar
public boolean agregarProducto(Producto p){
    for(int i=0; i< stock.length; i++){
        if (stock[i]==null){
            stock[i]=p;
            return true;
        }
    }
return false;
}

//metodo eliminar 
public boolean eliminarProducto(String codigo){
 for (int i = 0; i < stock.length; i++) {
        if (stock[i] != null && stock[i].getCodigo().equals(codigo)) {
            stock[i] = null;
            return true;
        }
}
return false;
}

public Producto buscar(String codigo) {
        for (Producto p : stock) {
            if (p != null && p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public int totalProductos() {
        int total = 0;
        for (Producto p : stock) {
            if (p != null) {
                total += p.getCantidad();
            }
        }
        return total;
    }
}

