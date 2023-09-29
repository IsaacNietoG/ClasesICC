/**
 * Clase Composicion.
 * Nos ilustra como funciona la composición de objetos en java.
 * @author Miriam Torres Bucio.
 */
public class Composicion{
	/**
	 * Método main.
	 */
	public static void main(String[] args){
		/**
		 * Creamos dos objetos de tipo dirección.
		 */
		Direccion d1 = new Direccion("calle pirules", 65);
		Direccion d2 = new Direccion("calle universidad", 12);

		/**
		 * Creamos a un estudiante.
		 * Le asignamos una dirección.
		 */
		Estudiante e = new Estudiante("Mónica", "CC", 31325432);
		e.setDireccion(d1);

		/**
		 * Creamos una facultad.
		 * Le asignamos una dirección.
		 */
		Facultad f = new Facultad();
		f.setNombre("Ciencias");
		f.setDireccion(d2);

		/**
		 * Imprimimos la información.
		 */
		System.out.println(e.getDireccion().getCalle());
		System.out.println(f.getDireccion().getCalle());

	}
}