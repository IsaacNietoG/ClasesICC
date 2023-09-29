// Importa las clases necesarias.
import java.util.Scanner;

/**
 * Clase Meses.java
 * Programa que nos dice el mes según la entrada del usuario.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Agosto 2023.
 */
public class Meses {

    /**
     * Método main (el cual es el punto inicial de la JVM para comenzar con la
     * ejecución de un programa de Java).
     */
    public static void main(String[] args) {

        // Declaración de variables.
        int mes;
        Scanner lector;

        // Creamos el Scanner.
        lector = new Scanner(System.in);

        // Mensaje donde pedimos el mes al usuario.
        System.out.println("Introduce el número de un mes:");

        // Guardamos el número a evaluar.
        mes = lector.nextInt();

        // Decisión con la estructura de control switch.
        switch(mes) {
            case 1:
                System.out.print("Enero");
            case 2:
                System.out.print("Febrero");
            case 3:
                System.out.print("Marzo");
            case 4:
                System.out.print("Abril");
            case 5:
                System.out.print("Mayo");
                break;
            case 6:
                System.out.print("Junio");
                break;
            case 7:
                System.out.print("Julio");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Septiembre");
                break;
            case 10:
                System.out.print("Octubre");
                break;
            case 11:
                System.out.print("Noviembre");
                break;
            case 12:
                System.out.print("Diciembre");
                break;
            default:
                System.out.print("Mes erróneo");
        }

        System.out.println(".");

        // Cerramos el Scanner.
        lector.close();

    } // Fin main.

} // Fin Meses.