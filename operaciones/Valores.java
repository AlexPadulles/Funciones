
package actividad03.operaciones;


import actividad03.introduceDatos.Pregunta;
import java.lang.Math;
import java.io.IOException;


public class Valores {
    
    
    public static void numeroPi() throws IOException{ //muestra el numero PI
        
       double numeropi;
       
       numeropi = Math.PI;
       
       System.out.println("El nuemro Pi es :"+ numeropi);
    
      
    }
        

    public static void muestraValorAbsoluto()throws IOException{ // muestra el valor absoluto del numero introducido
        
        
       double  valorab,total ;
        
       valorab = Pregunta.pideDouble("Introduce el valor para valor absoluto :");
       
       total = Math.abs(valorab);
       
       System.out.println("El valor absoluto de "+ valorab +" es de :"+ total);
               
      
       }
    
      public static void muestraValorAleatorio() throws IOException{ //muestra un valor aleatorio del numero introducido como maximo
        
        int valorale = 0, APG = 0;
       
        System.out.println("\nEscribe un numero entero para que salga por pantalla un valor aleatorio; ");
        
        APG = Pregunta.pideEntero("");
       
        valorale = (int) (Math.random()*APG+1);
     
             
        System.out.println("\nEl valor aleatorio es: "+ valorale);
    }
}

