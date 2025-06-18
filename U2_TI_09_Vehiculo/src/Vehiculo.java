public abstract class Vehiculo {
    private String placa;
    private String marca;
    
    //constructor
    public Vehiculo (String placa,String marca){
        this.placa=placa;
        this.marca=marca;

    }

    //getters y setters
    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }


}
