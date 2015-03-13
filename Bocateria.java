import java. util.ArrayList;
/**
 * Write a description of class Bocateria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bocateria
{
    
    private String primeraPersonaEnCola;
    private int facturacionActual;
    private ArrayList<Integer> clientesDespachados ;
    private static final int PRECIO_BOCADILLO = 5;

    /**
     * Constructor for objects of class Bocateria
     */
    public Bocateria(String primeraPersonaEnCola, int facturacionActual)
    {
        // initialise instance variables
        this.primeraPersonaEnCola = primeraPersonaEnCola;
        this.facturacionActual = facturacionActual;
        clientesDespachados = new ArrayList<Integer>();
        
    }
    
    
    public void llegaNuevoClienteALaCola()
    {
    
    }
}
