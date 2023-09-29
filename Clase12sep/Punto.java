public class Punto{
	/**
	 * Declaramos los atributos.
	 * Coordenadas del punto.
	 */
	protected int x,y;
	/**
	 * Constructor sin argumentos.
	 */
	public Punto(){
		/**
		 * Llamada implícita al constructor 
		 * de la superclase.
		 */
		establecePunto(0,0);
	}
	/**
	 * Consteructor.
	 */
	public Punto(int a, int b){
		/**
		 * Llamada implícita al constructor 
		 * de la superclase.
		 */
		establecePunto(a,b);
	}
	/**
	 * Establece las coordenadas X y Y del punto.
	 */
	public void establecePunto(int a, int b){
		x = a;
		y = b;
	}
	/**
	 * Método get() de la coordenada x.
	 */
	public int getX(){
		return x;
	}
	/**
	 * Método get() de la coordenada y.
	 */
	public int getY(){
		return y;
	}
	/**
	 * Método que regresa a los puntos como una
	 * representación de cadena.
	 */
	public String toString(){
		return "[" + x + "," + y + "]";
	}
}