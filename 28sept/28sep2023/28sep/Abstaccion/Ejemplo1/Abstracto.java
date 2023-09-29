/**
 * Clase abstracta.
 * Clase que no se puede instanciar directamente.
 * Se utiliza como base para otras clases.
 */
public abstract class Abstracto{
    /**
     * Método abstracto.
     * NO TIENEN IMPLEMENTACIÓN.
     * Se implementan por las clases que heredan a la 
     * clase abstracta.
     */
    public abstract void aprobado();
    /**
     * Método que sí hace algo.
     */
    public void institucion(){
        System.out.println("El alumno estudia en la Facultad de Ciencias, UNAM");
    }
}
