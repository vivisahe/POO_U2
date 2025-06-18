public class App {
    public static void main(String[] args) throws Exception {

        //Declaracion de array
        Garage[] garage1=new Garage[4];

        //Instancias
        Coche coche1=new Coche("VIVI11", "Mazda",4 );
        Coche coche2 = new Coche("ZURI21", "Ford", 2);
        Motocicleta moto1 = new Motocicleta("LIZZ24", "Vento", false);
        Motocicleta moto2 = new Motocicleta("DANI06", "Suzuki", true);

        garage1.estacionar(coche1);

        



    }
}
