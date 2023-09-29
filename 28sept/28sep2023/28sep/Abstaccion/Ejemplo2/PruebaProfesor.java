/**
 * Clase que explica las instancias de una clase abstracta.
 */
public class PruebaProfesor{
        /**
         * Método main.
         */
        public static void main(String[] args){
                Profesor p = new Profesor("Martin Miranda","M. Sosa",333);
                System.out.println("Usamos el método del correo usando la"
                                + "referencia de la clase Profesor");
                p.correo();
                /**
                 * ERROR: Una clase abstracta no puede ser instanciada.
                 */

        }
}