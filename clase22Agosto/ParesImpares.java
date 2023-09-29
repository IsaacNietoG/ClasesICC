import java.util.Scanner;

public class ParesImpares {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número para saber si es par o impar");
		int val = entrada.nextInt();

		if(val%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
 


	}

}


