
package actividad03.operaciones;
import static actividad03.introduceDatos.Pregunta.pideDouble;
import java.io.IOException;


public class OperacionesLinkia {

    public static void convertirLinkiaCoins() throws IOException { //el valor que nos introducen se multiplica por 1.5
        
        double dou, resultadoAPG; 
      
            dou = pideDouble("Intruduce el valor; ");
           
            resultadoAPG = dou *1.5;
            
            System.out.println("El valor de LinkiaCoin es :" + resultadoAPG); 
            
                }
    } 


