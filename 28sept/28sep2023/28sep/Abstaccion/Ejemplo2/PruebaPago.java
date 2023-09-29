/**
 * Clase donde hacemos la prueba.
 */
public class PruebaPago{
        /**
         * Método main.
         */
        public static void main(String[] args){
                /**
                 * Instanciamos al profesor usando al Pago.
                 */
                Profesor p = new Pago("Verónica","Ecatepec",20,10000.0);
                Pago pago = new Pago("Ulises", "Tlatelolco", 34, 90000.0);
                System.out.println("Usamos el método del correo usando la "
                                + "referencia de la clase Profesor \n");
                p.correo();

                System.out.println(" \nUsamos el método del correo usando la "
                                + "referencia de la clase Sueldo \n");
                pago.correo();
        }
}