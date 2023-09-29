/**
 * Clase Cilindro que extiende de Circulo.
 */
public class Cilindro extends Circulo{
	protected double altura;
	/**
	 * Constructor vacío.
	 */
	public Cilindro(){
		setAltura(0);
	}
	/**
	 * Constructor con parámetros.
	 */
	public Cilindro(double h, double r, int a, int b){
		/**
		 * Llamamos al constructor de nuestra superclase.
		 */
		super(r,a,b);
		setAltura(h);
	}
	/**
	 * Establece la altura del cilindro.
	 */
	public void setAltura(double h){
		altura = (h >= 0 ? h : 0);
	}
	/**
	 * Obtiene altura del cilindro.
	 */
	public double getAltura(){
		return altura;
	}
	/**
	 * Método que determina el área del cilindro.
	 */
	public double area(){
		return 2 * super.area() + 2 * Math.PI * radio * radio;
	}
	/**
	 * Método que determina el volumen del cilindro.
	 */
	public double volumen(){
		return super.area() * altura;
	}
	/**
	 * Salida del cilindro.
	 */
	public String toString(){
		return super.toString() + "Altura = " + altura;
	}
	/**
	 * Devolvemos el nombre de la clase.
	 */
	public String nombre(){
		return "Clase cilindro";
	}
}