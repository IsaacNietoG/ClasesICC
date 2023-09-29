/**
 * Clase CafeteraMejorada.java
 * Programa que ilustra el concepto de Clase y los distintos métodos que en ella
 * se pueden encontrar. La abstracción de una Cafetera en este problema implica
 * que tienen una capacidad de almacenamiento, una cantidad de café y si se
 * encuentra encendida o no.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Septiembre 2023.
 */
public class CafeteraMejorada {

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
   public CafeteraMejorada() {
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
   public CafeteraMejorada(int cap, int cant, boolean enc) {
      cantidad = cant; // La cantidad de café que determine el usuario.
      capacidad = cap; // La capacida de la cafetera que determine el usuario.
      encendida = enc; // El encendido o apagado depende del usuario.
   }

   /**
    * Constructor por parámetros. Permite inicializar el estado de un objeto a
    * partir los requerimientos del usuario. Solo se permite definir la cantidad
    * de café y la capacidad de la cafetera; la cafetera se crea con el estado
    * de apagada.
    * Importante: No se debe perder de vista que aunque son los requerimientos
    * del usuario, el estado del objeto debe ser consistente.
    *
    * @param cap Entero que indica la capacidad de la Cafetera.
    * @param cant Entero que indica la cantidad de café en la Cafetera.
   */
   public CafeteraMejorada(int cap, int cant) {
      // La capacidad de la cafetera que indique el usuario.
      capacidad = (cap > 0) ? cap : 2000;

      // La cantidad de café que determine el usuario.
      cantidad = (cant > 0 && cant <= capacidad) ? cant : 0;
      
      // El valor de apagado está dado por defecto.
      encendida = false;
   }   

   /**
    * Método de acceso para el atributo cantidad.
    * 
    * @return int La cantidad actual de café en la Cafetera.
    */
   public int getCantidad() {
      if(encendida) {
         return cantidad;
      } else {
         return -1;
      }
   }

   /**
    * Método de acceso para el atributo Capacidad.
    * 
    * @return int La capacidad de la Cafetera.
    */
   public int getCapacidad() {
      if(encendida) {
         return capacidad;
      } else {
         return -1;
      }
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
    * para la capacidad, debe estar encendida.
    * 
    * @param cap Entero que indica la nueva capacidad de la Cafetera
    */
   public void setCapacidad(int cap) {
      if(encendida) {
         if(cap > 0) {
            capacidad = cap;
         } else {
            System.out.println("La capacidad no puede ser cero o negativa.");
         }
      } else {     
         System.out.println("No puedo, la Cafetera está apagada.");
      }
   }

   /**
    * Método modificador para la cantidad, debe estar encendida.
    * 
    * @param cap Entero que indica la nueva cantidad de la Cafetera.
    */
   public void setCantidad(int cant) {
      if(encendida) {
         if(cant > 0 && cant <= capacidad) {
            cantidad = cant;
         } else {
            System.out.println("La cantidad no puede ser negativa o mayor " +
                              "que la capacidad de la Cafetera.");
         }
      } else {
         System.out.println("No puedo, la Cafetera está apagada.");
      }
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

   /**
    * Método para saber si una Cafetera está llena, debe estar prendida.
    * @return boolean True si esta llena, False en caso contrario o en caso de
    * que la Cafetera está apagada.
   */
   public boolean estaLlena() {
      if(encendida) {
         return capacidad == cantidad;

         // // Operador ternario.
         // return (capacidad == cantidad) ? true : false;
         
         // // Decisión con estructura if-else.
         // if(capacidad == cantidad) {
         //    return true;
         // } else {
         //    return false;
         // }
      } else {
         System.out.println("No puedo, la Cafetera está apagada.");
         return false;
      }

   }

   /**
    * Método para saber si la Cafetera está vacía, debe estar encendida.
    * @return boolean True si está vacía, False en caso contrario o si la 
    * Cafetera está apagada.
    */
   public boolean estaVacia() {
      if(encendida) {
         return capacidad == 0;

         // return capacidad == 0;
      } else {
         System.out.println("No puedo, la Cafetera está apagada.");
         return false;
      }
   }

   /**
    * Método para llenar la Cafetera, debe estar prendida.
    */
   public void llenar() {
      if(encendida) {
         cantidad = capacidad;
      } else {
         System.out.println("No puedo, la Cafetera está apagada.");
      }
   }

   /**
    * Método para vaciar la Cafetera, debe estar prendida.
    */
   public void vaciar() {
      if(encendida) {
         cantidad = 0;
      } else {
         System.out.println("No puedo, la Cafetera está apagada.");
      }
   }

   /**
    * Método para vaciar la Cafetera, debe estar prendida.
   */
   public void servirTaza() {
      if(encendida) {
         if(!estaVacia() && cantidad >= 150) {
            cantidad -= 150;

            // cantidad = cantidad - 150;
         } else {
            System.out.println("No puedo, no hay café suficiente.");
         }
      } else {
         System.out.println("No puedo, la Cafetera está apagada.");
      }
   }

   /**
    * Método para servir una cantidad de café, debe estar prendida.
    * @param cant La cantidad de café a servir.
    */
   public void servirCantidad(int cant) {
      if(encendida) {
         if(!estaVacia() && cantidad >= cant) {
            cantidad -= cant;
   
            // cantidad = cantidad - cant;
         } else {
            cantidad = 0;
         }         
      } else {
         System.out.println("No puedo, la Cafetera está apagada.");
      }
   }
   
   /**
    * Este m?todo permite convertir un objeto en una cadena de caracter
    * @return String La cadena con las caracter?sticas de la Cafetera
    */
   public String toString(){
      String cadena;
      cadena = "Cafetera\nCapacidad = " + capacidad + " ml\n" +
            "Cantidad = " + cantidad + " ml\n";
      if(encendida)
         return cadena + "La cafetera est? encendida";
      else
         return cadena + "La cafetera est? apagada";
   }

} // Fin CafeteraMejorada.