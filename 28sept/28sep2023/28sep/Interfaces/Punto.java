/**
 * La clase Punto extiende de Object e implemeta 
 *  a la interfaz Figura.
 */
public class Punto extends Object implements Figura{
	/**
	 * Coordenadas del punto.
	 */
	protected int x, y;
	/**
	 * Constructor sin argumentos.
	 */
	public Punto(){
		setPunto(0,0);
	}
	/**
	 * Constructor con argumentos.
	 */
	public Punto(int a, int b){
		setPunto(a,b);
	}
	/**
	 * Establecemos las coordenadas x y y.
	 */
	public void setPunto(int a, int b){
		x = a;
		y = b;
	}
	/**
	 * Obtenemos la coordenada de X.
	 */
	public int getX(){
		return x;
	}
	/**
	 * Obtenemos la coordenada de Y.
	 */
	public int getY(){
		return y;
	}
	/**
	 * Hacemos la representación del punto.
	 */
	public String toString(){
		return "[" + x + "," + y + "]";
	}
/**
 * Aquí, satisfacemos el requerimiento de la implementación para los tres
 *  métodos definidos en la interfaz.
 */
	/**
	 * Devolvemos el área.
	 */
	public double area(){
		return 0.0;
	}
	/**
	 * Devolvemos el volumen.
	 */
	public double volumen(){
		return 0.0;
	}
	/**
	 * Devolvemos el nombre de la clase.
	 */
	public String nombre(){
		return "Clase Punto";
	}
}