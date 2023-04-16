import java.util.ArrayList;



public class Lista {

 private ArrayList <Moneda> lista;

   public Lista(){
   
    lista = new ArrayList<Moneda>();

  }


  public void almacenarlista(Moneda caraMoneda){

     lista.add(caraMoneda);

  }

  public void generarMonedas(int numeroMonedas){

    Moneda monedaGenerada = new Moneda();
    
    for(int i=0;i<numeroMonedas;i++){
    
    almacenarlista(monedaGenerada);
    
    }
    
    
    }

  public void mostrarlista(){

      for(int numeroMoneda=0;numeroMoneda<lista.size();numeroMoneda++){

         Moneda listaMonedas = lista.get(numeroMoneda);

          System.out.println(listaMonedas.toString(numeroMoneda));
      
  }  

 }
    
    
}
