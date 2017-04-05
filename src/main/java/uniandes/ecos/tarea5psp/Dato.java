
package uniandes.ecos.tarea5psp;

/**
 * representa a un nodo de una lista vinculada
 * @author juvenal
 * @version 1.0 03/04/2017
 */
public class Dato 
{
    /**valor del límite inferior*/
    private double fromX;
    
    /**valor del límite superior*/
    private double toX;
    
     /**grados de libertad*/
    private int gradosLibertad;
    
    /**
     * Constructor de la clase
     * @param xi limite inferior
     * @param xs limite superio
     * @param gl grados de libertad
     */
    public Dato(double xi, double xs, int gl)
    {
      this.fromX =xi;
      this.toX=xs;
      this.gradosLibertad= gl;
    }
    
    /**
     * Obtiene el valor del limite inferior
     * @return valor limite inferio
     */
    public double getFromX() 
    {
        return fromX;
    }

    /**
     * Obtiene el valor del limite superio
     * @return valor limite superior
     */
    public double getToX() 
    {
        return toX;
    }

    /**
     * Obtiene el valor del limite superio
     * @return valor limite superior
     */
    public int getGradosLibertad() 
    {
        return gradosLibertad;
    }
    
    
    
}
