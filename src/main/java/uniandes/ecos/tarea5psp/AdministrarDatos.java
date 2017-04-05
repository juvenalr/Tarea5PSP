
package uniandes.ecos.tarea5psp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * clase que administra los conjuntos de datos
 * @author juvenal
 * @version 1.0 03/04/2017
 */
public class AdministrarDatos
{
    /**datos quemados 1 */
    private String datos1= "0, 1.1, 9";
    /**datos quemados 2 */
    public String datos2= "0, 1.1812, 10";
    /**datos quemados 3 */
    public String datos3= "0, 2.750, 30";
    
     /**Lista de Datosde datos*/
    private ArrayList<Dato> ListaDatos;
	
    /**objeto de tipo Calculo*/
    private Calculo calculos;
    
    /**
    * constructor de la clase
    */	
    public AdministrarDatos()
    {
	ListaDatos= new ArrayList<Dato>();
	calculos = new Calculo();
    }
    
    /**
     * Lee los valores desde un string
     * @param linea cadena de texto con la información 
     */
	
    public void leerDatos(String linea)
    {
                        						
        String[] valores= linea.split(",");
        
        try 
        {
	    Double limiteInferior= Double.parseDouble(valores[0]);
            Double limiteSuperior= Double.parseDouble(valores[1]);
            int gradosLibertad = Integer.parseInt(valores[2].trim());
            Dato nuevoDato = new Dato(limiteInferior,limiteSuperior,gradosLibertad );
            ListaDatos.add(nuevoDato);
	}
        catch(NumberFormatException ex)
        {
              System.out.println("Conjunto de Datos  No Cargado: "+ex);								
        }       
           
    }
    
     /**
     * pobla el array list de datos
     */
    public void poblarDatos()
    { 
	this.leerDatos(datos1);
        this.leerDatos(datos2);
        this.leerDatos(datos3);  			
          
    }
    
    public Map<String,ArrayList<String>> calcularPValorDatos()
    { int contador=0;
      Map<String,ArrayList<String>> mapValoresp = new HashMap<String,ArrayList<String>>();
      double pValor;
      poblarDatos();
      for (Dato pDato: ListaDatos)
      {
        contador = contador + 1 ;
       pValor = calculos.estimarValorP(pDato.getToX(),10,pDato.getGradosLibertad(),0.00001);
       String llave = "dato" +   Integer.toString(contador);
       ArrayList<String> valor = new ArrayList<String>();
       valor.add(Double.toString(pDato.getFromX()));
       valor.add(Double.toString(pDato.getToX()));
       valor.add(Integer.toString(pDato.getGradosLibertad()));
       valor.add(Double.toString(pValor));
       mapValoresp.put(llave, valor);

      }      
      return mapValoresp;
    }
}
