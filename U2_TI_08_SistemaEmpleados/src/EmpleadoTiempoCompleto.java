public class EmpleadoTiempoCompleto extends Empleado {
    private String beneficios;
    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios) {
        super(id,nombre,salarioBase);
        this.beneficios=beneficios;

    }
    
public String getBeneficios() {
    return beneficios;
}


public void setBeneficios(String beneficios) {
    this.beneficios = beneficios;
}
@Override
public double calcularSalario(){
    System.out.println("ID empleado:"+ getId());
    System.out.println("Nombre:"+ getNombre());
    System.out.println("Salario Base:"+ getSalarioBase());
    System.out.println("Beneficios:"+getBeneficios());
    return getSalarioBase();

}
}
