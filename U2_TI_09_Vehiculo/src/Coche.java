public class Coche extends Vehiculo {
    private int numPuertas;
    public Coche (String placa,String marca,int numPuertas){
        super(placa,marca,numPuertas);
        this.numPuertas=numPuertas;

    }
    public int getnumPuertas(){
        return numPuertas;
    }
    public void setnumPuertas(int numPuertas){
        this.numPuertas=numPuertas;
    }


}
