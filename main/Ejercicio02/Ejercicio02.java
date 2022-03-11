

package actividad03.main.Ejercicio02;

import static actividad03.operaciones.Valores.*;

import actividad03.introduceDatos.Pregunta;
import static actividad03.operaciones.OperacionesLinkia.convertirLinkiaCoins;

import static actividad03.operaciones.aritmeticas.Operaciones.*;
import static actividad03.operaciones.geometricas.Operaciones1.*;
import java.io.IOException;

public class Ejercicio02 {


  public static void main(String args[]) throws IOException {
      
        int opcion_apg;
      
           
        do{
            
        System.out.println("1. Calcular linkiaCoins: "  );  
        System.out.println("2. Muestra el numero Pi: "  );
        System.out.println("3. Valor absoluto de un numero: "  );
        System.out.println("4. Genera un valor aleatorio: "  ); 
        System.out.println("5. Logaritmo de un numero: "  );
        System.out.println("6. Potencia de un numero: "  );
        System.out.println("7. Calcular seno de un numero: "  );
        System.out.println("8. Calcular coseno de un numero: "  );
        System.out.println("0. Finalizar el programa\n "  ); 
        
        System.out.println("Introduce la opción que quieres: \n"  );
        
         try {
                opcion_apg = Pregunta.pideEntero("Opción elegida:");
                if(opcion_apg <0 || opcion_apg >8){
                    
                    System.out.println("El valor debe ser entre 0 y 8 \n"); 
                }
            }catch (Exception e) {
                opcion_apg = -1;
              System.out.println("El valor debe ser numerico \n");
            }
        
        
       switch (opcion_apg){
     
       
           case 0:
               
                System.out.println("\nFin del programa\n");
               
           break;
           
           
           case 1:
               
                convertirLinkiaCoins();
                
                
                
           break;    
            
          
           case 2:
  
                numeroPi();
                
               
                
           break;
           
           case 3:
               
               muestraValorAbsoluto();
             
               
           break; 
           
           case 4:
               
              muestraValorAleatorio();
               
          
              
           break; 
           
           case 5:
               
           
               vistaLoga();
              
               
           break; 
           
           case 6:
               
               
               vistaPotencia();
               
               
           break;
           
           case 7:
               
               
               pideSeno();
               
               
           break;  
           
           case 8:
               
               
               pideCoseno();
               
                
           break;    
                
           }      
                
        }while (opcion_apg !=0); 
            
    }  

    }

    
    
       
      
      
        
        
        
    
    

