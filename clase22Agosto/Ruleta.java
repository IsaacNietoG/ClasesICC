import java.util.Random;
import java.util.Scanner;

public class Ruleta {
	
	public static void main(String[] args) {
		
		Random aleatorios = new Random();
		Scanner entrada = new Scanner(System.in);

		//Preguntamos al usuario
		System.out.println("¿Qué crees que saldrá en la ruleta?");
		System.out.println("1-34, 33 es 0 verde, 34 es 00 verde");

		int opcionUsuario= entrada.nextInt();

		//Generar el valor de la ruleta
		int numero = aleatorios.nextInt(34)+1;
		String color="";

		if(numero==33) {
			System.out.println("La ruleta sacó 0 verde");

		} else if(numero==34) {
			System.out.println("La ruleta sacó 00 verde");

			
		} else {

			if(numero%2==1) {
				color="Negro";
			} else {
				color="Rojo";
			}

			System.out.println("La ruleta sacó " + numero + " " + color);
		}


		if(opcionUsuario==numero) {
			System.out.println("Haz ganado");
		} else {
			System.out.println("Perdiste!");
		}


	}

}


