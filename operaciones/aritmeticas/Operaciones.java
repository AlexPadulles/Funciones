
package actividad03.operaciones.aritmeticas;

import actividad03.introduceDatos.Pregunta;
import java.io.IOException;


public class Operaciones { // La clase que nos servira para el punto 6 con 2 constructor
                           // y con varias funciones
      
    private double // aqui declaramos las variables para luego darles su valor en los dos constructores
            logi,
            vl,
            logaAPG,
            x,
            y,
            potenciaAPG;
    
 
  public Operaciones()throws IOException {  //El primer constructor para la funcion del logaritmo
      
      
      logi = Pregunta.pideDouble("Introduce un valor para el logaritmo :");
      
     
      
  }
  
  public Operaciones(String pl)throws IOException { // Esta es el segundo constructor para la funcion de las potencias
      
      
     x = Pregunta.pideDouble("Introduce el primer valor para la potencia :");
      
     y = Pregunta.pideDouble("Introduce el valor del exponente :");
     
    
  }
  
     
    public double muestraLogaritmo() throws IOException{ //Con este getter hacemos la operacion para obtener el valor
      
    
        
        logi = Math.log(logi);
        
        logaAPG = logi;      
       
        return logaAPG;
       
    
       }
    
    public double valor(){  //Esta funcion muestra el valor que le da el usuario
        
        
        vl=logi;
        
        return vl;
    }
    
    public double elevarPotencia() {  // Esta funcion se encarga de elevar la potencia 
    
    
        potenciaAPG = Math.pow(x,y);
        
        
        return potenciaAPG;
    
    
    }  
    
    public static void vistaLoga() throws IOException { // Este setter nos muestra en el main el resultado del logaritmo
    
    Operaciones Micalc = new Operaciones();
        
               System.out.println("\nEl valor del logaritmo de "+ Micalc.valor()+" es; "
                       
                       + Micalc.muestraLogaritmo());
               
               System.out.println("\n");
    
    
    
}
    public static void vistaPotencia()throws IOException{ // Este setter muestra en el main el resultado de la potencia
        
    
    
     Operaciones potenAPG = new Operaciones("APG");
             
             System.out.println("\nEl valor de la potencia es :\n" 
                     
                     + potenAPG.elevarPotencia());
               
             System.out.println("\n");
    
    }
   }
