
public class Producto {
    //declarcion de variables
    private String codigo;
    private String nombre;
    private int cantidad;

    //contructor
    public Producto (String codigo,String nombre, int cantidad){
        this.codigo=codigo;
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

//getters & setters

public String getCodigo(){
    return codigo;
}

//validar que el codigo no este vacio
public void setCodigo(String codigo){
    if(codigo != null){

        this.codigo=codigo;
    }
    else {System.out.println("El codigo esta vacion");}
}

public String getNombre(){
    return nombre;
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

public int getCantidad(){
    return cantidad;
}

public void setCantidad(int cantidad){
    this.cantidad=cantidad;
}

}
