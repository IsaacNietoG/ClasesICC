/**
 * Clase que nos permite acceder a la clase abstracta.
 */
public class Pago extends Profesor{
        /**
         * Pago del profesor.
         */
        private double pago;
        /**
         * Constructor de nuestra clase.
         */
        public Pago(String nombre, String direccion, int numero, double pago){
                /**
                 * Mandamos a llamar el constructor de la clase padre.
                 */
                super(nombre, direccion, numero);
                setPago(pago);
        }

        public void correo(){
                System.out.println("Método correo de la clase Pago");
                System.out.println("Correo enviado al profesor " + getNombre()
                                + " con sueldo " + getPago());
        }

        public double getPago(){
                return pago;
        }

        public void setPago(double nuevoPago){
                if (nuevoPago >= 0.0)
                        pago = nuevoPago;
        }

        public double pago(){
                System.out.println("El pago del sueldo a "
                                                + getNombre());
                return pago/52;
        }
}