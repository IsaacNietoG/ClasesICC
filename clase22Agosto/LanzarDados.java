import java.util.Random;

public class LanzarDados {

	//Métodos estáticos
	public static void imprimeDados(int valDado) {

		char symbol='0';
		//Instrucción switch
		switch(valDado) {
			case 1:
				symbol = '\u2680';
				break;
			case 2:
				symbol = '\u2681';
				break;
			case 3:
				symbol = '\u2682';
				break;
			case 4:
				symbol = '\u2683';
				break;
			case 5:
				symbol = '\u2684';
				break;
			case 6:
				symbol = '\u2685';
				break;

		}

		System.out.println(symbol + " ");


	}


	
	public static void main(String[] args) {

		Random aleatorios = new Random();
	
		int dado1 = aleatorios.nextInt(6)+1;
		int dado2 = aleatorios.nextInt(6)+1;			

		int suma=dado1+dado2;

		imprimeDados(dado1);
		imprimeDados(dado2);
		System.out.println();
		
		System.out.println("La suma fue " + suma);


	}


}
