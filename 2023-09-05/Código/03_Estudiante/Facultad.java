/** 
 * Clase Facultad. 
 * Nos dice los atributos de la FC.
 * @author Miriam Torres Bucio.
 */
public class Facultad{
	/**
	 * Nombre de la Facultad.
	 */
	private String nombre;
	/**
	 * Número de alumnos.
	 */
	private int alumnos;
	/**
	 * Dirección de la Facultad.
	 */
	private Direccion direccion;
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
	 * Método get de número de alumnos.
	 */
  	public int getAlumnos(){
    	return alumnos;
  	}
  	/**
	 * Método set de número de alumnos.
	 */
  	public void setAlumnos(int alumnos){
    	this.alumnos = alumnos;
  	}
}