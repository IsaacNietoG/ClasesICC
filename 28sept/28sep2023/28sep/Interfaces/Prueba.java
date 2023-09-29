import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Prueba{
	public static void main(String[] args){
		Punto p = new Punto(7,11);
		Circulo ci = new Circulo(4,22,8);
		Cilindro cl = new Cilindro(10,3,10,10);

		Figura arreglo[] = new Figura[3];
		/**
		 * Asignamos el arreglo a las figuras.
		 */
		arreglo[0] = p;
		arreglo[1] = ci;
		arreglo[2] = cl;
		/**
		 * Hacemos una cadena con cada figura.
		 */
		String salida = 
			p.nombre() + " : " + p.toString() + "\n" +
			ci.nombre() + " : " + ci.toString() + "\n" +
			cl.nombre() + " : " + cl.toString();

		/**
		 * Hacemos un ciclo para la impresión de figuras.
		 */
		DecimalFormat df = new DecimalFormat( "#0.00" );
		for(int i = 0; i < arreglo.length; i++){
			salida += "\n\n" +
			arreglo[i].nombre() + ": " +
			arreglo[i].toString() +
			"\nArea = " +
			df.format(arreglo[i].area()) +
			"\nVolumen = " +
			df.format(arreglo[i].volumen());
		}
		JOptionPane.showMessageDialog(null, salida, "Polimorfismo usando interfaces", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}