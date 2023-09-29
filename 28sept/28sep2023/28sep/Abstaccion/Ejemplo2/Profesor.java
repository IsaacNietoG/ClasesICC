/**
 * Clase abstracta Profesor.
 * Nos dice el nombre, la dirección y número.
 */
public abstract class Profesor{
        /**
         * Atributos de un profesor.
         */
        protected String nombre;
        protected String direccion;
        protected int numero;

        /**
         * Constructor de un Profesor.
         */
        public Profesor(String nombre, String direccion, int numero){
                this.nombre = nombre;
                this.direccion = direccion;
                this.numero = numero;
        }

        public double pago(){
                System.out.println("El pago del profesor ");
                return 0.0;
        }

        public void correo(){
                System.out.println("Enviando el correo de pago (clase Profesor)"
                                + this.nombre + " " + this.direccion);
        }

        public String toString(){
                return nombre + " " + direccion + " " + numero;
        }

        public String getNombre(){
                return nombre;
        }

        public String getDireccion(){
                return direccion;
        }

        public void setDireccion(String direccion){
                this.direccion = direccion;
        }

        public int getNumero(){
                return numero;
        }
}
