/**
 * Clase Areas que permite mostrar un ejemplo de sobrecarga
 * del método Area.
 * 
 * @author Rocío Aylin Huerta González
 * @version 1.0
 */
public class Areas{
	
	/**
	 * Creamos métodos con el mismo nombre, pero distintos parámetros.
	 */
	public void Area(double radio) {
		System.out.println("Área de un círculo: " + 3.14 * radio * radio);
	}

	public void Area(int base, int altura) {
		System.out.println("Área de un tríangulo: " + base * altura / 2);
	}

	/**
	 * Método main.
	 */
	public static void main(String[] args) {
		Areas figura = new Areas();
		figura.Area(8.2);
		figura.Area(10, 6);
	}
}