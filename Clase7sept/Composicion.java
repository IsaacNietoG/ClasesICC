public class Composicion{
	public static void main(String[] args){
		Fecha fn1 = new Fecha(5, 3,1986);
		Fecha fc1 = new Fecha(1, 8, 2023);

		Empleado e1 = new Empleado("Carlos ", "Rivera");
		e1.setFecha(fn1);

		System.out.println(e1.getNombre() + e1.getApellido());
		System.out.println("Su fecha de nacimiento es: "+fn1.formato1());
        System.out.println("Su fecha de nacimiento es: " + fn1.formato2());
        System.out.println("Su fecha de nacimiento es: " + fn1.formato3());
	}

	/**
	 * Como ejercicio, deben ponerle los siguientes formatos a la fecha:
	 * 1. aaaa-mm-dd
	 * 2. m/d/aaaa
	 * 3. Mes d, aaaa
	 */
}
