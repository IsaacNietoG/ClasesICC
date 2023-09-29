/** 
 * Clase Estudiante. 
 * Nos dice los atributos de un estudiante.
 * @author Miriam Torres Bucio.
 */
public class Estudiante{
	/**
	 * Nombre del estudiante.
	 */
	private String nombre;
	/**
	 * Carrera del estudiante.
	 */
	private String carrera;
	/**
	 * Número de cuenta del estudiante.
	 */
	private int cuenta;
	/**
	 * Dirección de la facultad del estudiante.
	 */
	private Direccion direccion;
	/**
	 * Constructor de los atributos del estudiante.
	 */
	public Estudiante(String nombre, String carrera, int cuenta){
		super();
		this.nombre = nombre;
		this.carrera = carrera;
		this.cuenta = cuenta;
	}
	/**
	 * Método get de Dirección.
	 */
	public Direccion getDireccion(){
		return direccion;
	}
	/**
	 * Método set de Dirección.
	 */
	public void setDireccion(Direccion direccion){
		this.direccion = direccion;
	}
	/**
	 * Método get de nombre.
	 */
	public String getNombre(){
    	return nombre;
  	}
  	/**
	 * Método set de nombre.
	 */
  	public void setNombre(String nombre){
    	this.nombre = nombre;
  	}
  	/**
	 * Método get de la carrera.
	 */
	public String getCarrera(){
    	return carrera;
  	}
  	/**
	 * Método set de la carrera.
	 */
  	public void setCarrera(String carrera){
    	this.carrera = carrera;
  	}
  	/**
	 * Método get de número de cuenta.
	 */
  	public int getCuenta(){
    	return cuenta;
  	}
  	/**
	 * Método set de número de cuenta.
	 */
  	public void setCuenta(int cuenta){
    	this.cuenta = cuenta;
  	}
}