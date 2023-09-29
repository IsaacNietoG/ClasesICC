/**
 * Clase Cafetera.java
 * Programa que ilustra el concepto de Clase y los distintos métodos que en ella
 * se pueden encontrar. La abstracción de una Cafetera en este problema implica
 * que tienen una capacidad de almacenamiento, una cantidad de café y si se
 * encuentra encendida o no.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Septiembre 2023.
 */
public class Cafetera {

   // Atributos de clase.
   // Se debe asegurar encapsulación, por eso se usa private.
   private int cantidad;
   private int capacidad;
   private boolean encendida;

   /**
    * Constructor por omisión. Inicializa el estado de un objeto en un estado
    * consistente (válido) para el problema. La inicialización de los atributos
    * de clase corre a cargo del programador.
    */
   public Cafetera() {
      capacidad = 1000;    // Capacidad de 1 litro.
      cantidad = 0;        // No cuenta actualmente con café.
      encendida = false;   // Está apagada.
   }

   /**
    * Constructor por parámetros. Permite inicializar el estado de un objeto a
    * partir los requerimientos del usuario. IMPORTANTE: No se debe perder de
    * vista que aunque son los requerimientos del usuario, el estado del objeto
    * debe ser consistente.
    * 
    * @param cap  Entero que indica la capacidad de la Cafetera.
    * @param cant Entero que indica la cantidad de café en la Cafetera.
    * @param enc  True significa que Cafetera está encendida.
    */
   public Cafetera(int cap, int cant, boolean enc) {
      cantidad = cant; // La cantidad de café que determine el usuario.
      capacidad = cap; // La capacida de la cafetera que determine el usuario.
      encendida = enc; // El encendido o apagado depende del usuario.
   }

   /**
    * Método de acceso para el atributo cantidad.
    * 
    * @return int La cantidad actual de café en la Cafetera.
    */
   public int getCantidad() {
      return cantidad;
   }

   /**
    * Método de acceso para el atributo Capacidad.
    * 
    * @return int La capacidad de la Cafetera.
    */
   public int getCapacidad() {
      return capacidad;
   }

   /**
    * Método de acceso para el atributo encendida.
    * 
    * @return boolean True si está encendida, false en caso contrario.
    */
   public boolean getEncendida() {
      return encendida;
   }

   /**
    * Método modificador (permite cambiar el estado de un atributo de clase)
    * para la capacidad.
    * 
    * @param cap Entero que indica la nueva capacidad de la Cafetera
    */
   public void setCapacidad(int cap) {
      capacidad = cap;
   }

   /**
    * Método modificador para la cantidad.
    * 
    * @param cap Entero que indica la nueva cantidad de la Cafetera.
    */
   public void setCantidad(int cant) {
      cantidad = cant;
   }

   /**
    * Método modificador para cambiar el estado de la Cafetera, de encendido a
    * apagado o visceversa.
    * 
    * @param enc true si se desea encender, false en caso contrario.
    */
   public void setEncendida(boolean enc) {
      encendida = enc;
   }

} // Fin Cafetera.