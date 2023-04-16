import java.util.Random;


public class Moneda {

private Random caraMoneda = new Random();

private String cara; 

public Moneda() {

this.cara = getCaraMoneda();
    
}

public String getCaraMoneda() {
    
     if(caraMoneda.nextBoolean() == true)
         
             return "Aguila";
     else

     return "Cara";

}

public String toString(int numeroMoneda) {

    return "La cara de la moneda No." + (1+numeroMoneda) + " es: " + getCaraMoneda();

}

    
}


