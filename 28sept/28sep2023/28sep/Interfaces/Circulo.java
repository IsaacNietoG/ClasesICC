/**
 * Clase Circulo que hereda de la clase Punto.
 */
public class Circulo extends Punto{
	/**
	 * Atributo de un círculo.
	 */
	protected double radio;
	/**
	 * Constructor vacío.
	 */
	public Circulo(){
		setRadio(0);
	}
	/**
	 * Constructor con parámetros.
	 */
	public Circulo(double r, int a, int b){
		/**
		 * Llamamos al constructor de nuestra superclase.
		 */
		super(a,b);
		setRadio(r);
	}
	/**
	 * Establecemos el radio del círculo.
	 */
	public void setRadio(double r){
		radio = (r >= 0 ? r : 0);
	}
	/**
	 * Obtenemos el radio del círculo.
	 */
	public double getRadio(){
		return radio;
	}
	/**
	 * Calculamos el área del Círculo.
	 */
	public double area(){
		return Math.PI * radio * radio;
	}
	/**
	 * Salida del círculo.
	 */
	public String toString(){
		return "Centro: " + super.toString() + "; Radio = " + radio;
	}
	/**
	 * Devolvemos el nombre de la clase.
	 */
	public String nombre(){
		return "Clase círculo";
	}
}