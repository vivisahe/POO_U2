public class Motocicleta extends Vehiculo{
    private Boolean tieneCaja;
    public Motocicleta(String placa,String marca,Boolean tieneCaja){
        super(placa,marca);
        this.tieneCaja=tieneCaja;
    }

    public boolean gettieneCaja(){
        return tieneCaja;
    }

    public void settieneCaja(boolean tieneCaja){
        this.tieneCaja=tieneCaja;
    }

}
