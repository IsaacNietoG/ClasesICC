/**
 * Clase Dirección.
 * Nos da los atributos de la dirección de la FC.
 */
public class Direccion{
    /**
     * Nombre de la calle
     */
    private String calle;
    /**
     * Número de facultad.
     */
    private int numero;
    /**
     * Constructor de la clase Dirección.
     */
    public Direccion(String calle, int numero) {
        super();
        this.calle = calle;
        this.numero = numero;
    }
    /**
     * Método get de la calle.
     */
    public String getCalle() {
        return calle;
    }
    /**
     * Método set de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    /**
     * Método get del número.
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Método set de la calle.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    } 
  
}
