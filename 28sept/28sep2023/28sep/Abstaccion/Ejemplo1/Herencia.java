/**
 * Clase en donde se encuentra nuestro main.
 */
public class Herencia{
    public static void main(String[] args){
        /**
         * NO podemos instanciar a la clase ABSTRACTA.
         * En su lugar, instanciamos a sus clases hijas.
         */
        Actuario a1 = new Actuario();
        a1.aprobado();
        a1.institucion();

        Computologo c1 = new Computologo();
        c1.aprobado();
        c1.institucion();
    }
}
