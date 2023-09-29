import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        char repetir = 'n';
        do {
            // Declaracion de variables
            Scanner input = new Scanner(System.in);
            int valorBase = 0;
            String entradaString;
            do {
                // Soliciud de valor de base
                System.out.println("Bienvenido al generador de piramides");
                System.out.println("Inserte el numero cuyo valor quiere que tome la base horizontal");
                entradaString = input.next();
                // Validacion de entrada
                entradaString = entradaString.trim();
                if (entradaString.isBlank() || entradaString.isEmpty()) {
                    System.out.println("Entrada invalida, intentalo de nuevo");
                    repetir = 'y';
                }
                for (int i = 0; entradaString.length() > i; i++) {
                    char iter = entradaString.charAt(i);
                    if (Character.isDigit(iter)) {
                        repetir = 'n';
                    } else {
                        System.out.println("Entrada invalida, intentalo de nuevo");
                        repetir = 'y';
                        break;
                    }
                }
            } while (repetir == 'y');
            //Calculo
            valorBase = Integer.parseInt(entradaString);
            int i=1;
            int j=1;
            while (i <= valorBase/2){
                for(j=1;j<=valorBase;j++){
                    if(j<=i || j>valorBase-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
                i++;
            }
            //Repeticion
            System.out.println("Desea repetir el programa? (y/N)");
            repetir = input.next().toLowerCase().charAt(0);
    } while (repetir == 'y');

    }
}
