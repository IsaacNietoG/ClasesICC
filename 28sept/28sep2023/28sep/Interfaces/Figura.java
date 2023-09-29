/**
 * Reemplazamos la superclase Figura por una interfaz.
 * Una interfaz se utiliza en lugar de una clase abstracta
 *  cuando no hay una implementación predeterminada a heredar.
 * NO hay variables de instancia, ni implementaciones de métodos.
 */
public interface Figura{
	/**
	 * Métodos de nuestra interfaz.
	 */
	public abstract double area();
	public abstract double volumen();
	public abstract String nombre();
	/**
	 * NOTA: Al implementar una interfaz, "firmamos" un contrato
	 *  con el compilador que establece:
	 * 			Definir todos los métodos especificados
	 * 			por la interfaz.
	 */
}