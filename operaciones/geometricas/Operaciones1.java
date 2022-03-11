
package actividad03.operaciones.geometricas;

import actividad03.introduceDatos.Pregunta;
import java.io.IOException;

public class Operaciones1 {

    
  public static void pideSeno() throws IOException{
      
     double senoAPG = 0.0;
     
     senoAPG = Pregunta.pideDouble("Introduce el valor para calcular el seno :");
      
     
     senoAPG = Math.sin(senoAPG);
     
     
     System.out.println("El valor del seno del numero introducido es: "+ senoAPG);
     
    
      
  } 
  
  
  public static void pideCoseno() throws IOException{
      
      
   
     double cosenoAPG = 0.0;
     
     cosenoAPG = Pregunta.pideDouble("Introduce el valor para calcular el coseno :");
      
     
     cosenoAPG = Math.sin(cosenoAPG);
     
     
     System.out.println("El valor del seno del numero introducido es: "+ cosenoAPG);  
      
      
      
  }
   
    
}
