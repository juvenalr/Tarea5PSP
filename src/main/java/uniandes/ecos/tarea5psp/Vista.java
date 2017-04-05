/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.ecos.tarea5psp;

import java.util.ArrayList;
import java.util.Map;

/**
 * clase qque se encarga de generar de mostrar los menus en pantalla
 * @author juvenal
 * @version 1.0 04/04/2017
 */
public class Vista 
{
    /**
     * genera un string a partir de una lista de resulatados
     * @param mapaIntervalos lista de resultados
     * @return cadena de texto
     */
     public String mostrarResultados(Map<String,ArrayList<String>> mapaIntervalos)
     {
         String encabezado = " <!DOCTYPE html> <html> <body>";
         String tablaInicio = "<table style=\"width:100%\">";
         String columnasEncabezado=  "<tr> <th>x</th> <th>dof</th> <th>pValue</th>  </tr>";
         String valores ="";
         for (Map.Entry<String,ArrayList<String>> dato : mapaIntervalos.entrySet())
         {
          valores = valores + " <tr> "  + "<td>x= " + dato.getValue().get(1) + "</td>"  + "<td>"+ dato.getValue().get(2) + "</td>" + "<td>" + dato.getValue().get(3) + "</td> </tr>";
         
         }
         
         return encabezado + tablaInicio +columnasEncabezado +valores + " </table> </body> </html>";
         
         
     }
     
}
