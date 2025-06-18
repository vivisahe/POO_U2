public class Garage {
    private Vehiculo[] espacios;

    //Constructor
    public Garage(int numEspacios){
        espacios = new Vehiculo[numEspacios];
    }

    // metodo estacionar 
    public boolean estacionar(Vehiculo v)  {
        for (int i =0; i<espacios.length; i++){
            if (espacios[i]== null){
                espacios[i]= v;
                return true;
            }
        }
        return false;
    }

    //metodo retira
   public boolean retirar(String placa) {
    for (int i = 0; i < espacios.length; i++) {
        if (espacios[i] != null && espacios[i].getplaca().equals(placa)) {
            espacios[i] = null;
            return true;
        }
    }
    return false;
}
//metodo contar vehiculos
public int contarvehiculos(){
    int numVehiculos =0;
   for (int i=0; i<espacios.length; i++){
    if(espacios[i]!=null){
        numVehiculos++;
    }
   }
   return numVehiculos;
}

    }


