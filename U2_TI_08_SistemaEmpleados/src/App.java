public class App {
     public static void main(String[] args) {

        //instancias
        EmpleadoTiempoCompleto empTC = new EmpleadoTiempoCompleto("VSH1105","Viviana",1000.00,"\nVacaciones\nPrestaciones");
        EmpleadoHoras empPH  = new EmpleadoHoras("ZRA2106","Zurisaddai",500.0,10);

       empTC.calcularSalario();
       System.out.println("----------");
       empPH.calcularSalario();
    }
}
