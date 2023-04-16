import java.util.Scanner;

public class App {
  
    private Scanner  leer = new Scanner(System.in);

    private Lista lista = new Lista();

    private int numeroMonedas;

    public static void main(String[] args) throws Exception {
       
      App app =new App();

      app.recolectarMonedas();

    }

   public void recolectarMonedas(){

   
    System.out.println("Cuantas monedas va lanzar:");

    numeroMonedas = leer.nextInt();

     lista.generarMonedas(numeroMonedas);
     
     lista.mostrarlista();

   }

}
