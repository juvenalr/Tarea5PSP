
package uniandes.ecos.tarea5psp;

import java.util.ArrayList;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;
/**
 * clase qque se encarga de generar de mostrar los menus en pantalla
 * @author juvenal
 * @version 1.0 04/04/2017
 */
public class Controlador
{
     /**Objeto de la clase AdministrarDatos que se encarga de los procesos y calculo*/ 
  public AdministrarDatos adminDatos;
  
  /**Objeto de la clase vista que mustra los menus en pantalla*/
  public Vista menus;
  /**
   * Constructo de la clase
   */
  public Controlador()
  {
	  adminDatos= new AdministrarDatos();
	  menus=new Vista();
  }
  /**
   * Metodo principal
   * @param args 
   */
  public static void main(String[] args) 
   {
       Controlador control = new Controlador();
       Map<String,ArrayList<String>> intervalos= control.adminDatos.calcularPValorDatos();
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");

        get("/pValor", (req, res) -> 
            {
                return control.menus.mostrarResultados(intervalos);
                
            }
        );
   }
    
}
