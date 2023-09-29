public class Circulo extends Punto{
	/**
	 * Declaramos variables.
	 */
	protected double radio;
	/**
	 * Constructor sin argumentos.
	 */
	public Circulo(){
		/**
		 * Llamada implícita al constructor 
		 * de la superclase.
		 */
		estableceRadio(0);
	}
	/**
	 * Constructor.
	 */
	public Circulo(double r, int a, int b){
		/**
		 * Llama al constructor de la superclase.
		 */
		super(a,b);
		estableceRadio(r);
	}
	/**
	 * Establecemos el radio del Círculo.
	 */
	public void estableceRadio(double r){
		radio = (r > 0.0 ? r : 0.0);
	}
	/**
	 * Obtenemos el radio del círculo.
	 * Método get().
	 */
	public double getRadio(){
		return radio;
	}
	/**
	 * Calculamos el área del círculo.
	 */
	public double area(){
		return Math.PI*radio*radio;
	}
	/**
	 * Método toString.
	 */
	public String toString(){
		return "Centro = " + "[" + x + ", " + y + "]" + 
				"; Radio = " + radio;
	}
}