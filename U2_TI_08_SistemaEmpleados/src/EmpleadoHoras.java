public class EmpleadoHoras extends Empleado{
    private int horasTrabajadas;
      public EmpleadoHoras(String id, String nombre, double  salarioBase, int horasTrabajadas) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;

    }
    

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
 @Override
    public double calcularSalario(){
    System.out.println("ID empleado:"+ getId());
    System.out.println("Nombre:"+ getNombre());
    System.out.println("Salario Base:"+ getSalarioBase());
    System.out.println("Horas trabajadas:"+horasTrabajadas);
    System.out.println("Salario Final:"+getSalarioBase()*getHorasTrabajadas());
    return getSalarioBase()*horasTrabajadas;
    }
}
