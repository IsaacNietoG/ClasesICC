// Importa las clases necesarias.
import java.util.Scanner;

/**
 * Clase CiclosAnidados.java
 * Programa que nos imprime los contadores de dos ciclos anidados.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Agosto 2023.
 */
public class CiclosAnidados {

    /**
     * Método main (el cual es el punto inicial de la JVM para comenzar con la
     * ejecución de un programa de Java).
     */
    public static void main(String[] args) {

        // Declaración de variables.
        int cantidad1, cantidad2;
        Scanner lector;

        // Creamos el Scanner.
        lector = new Scanner(System.in);

        // Mensaje donde pedimos las veces que queremos iterar el for externo.
        System.out.println("Ingresa el valor de la variable cantidad1:");

        // Guardamos el número a evaluar.
        cantidad1 = lector.nextInt();
        
        // Mensaje donde pedimos las veces que queremos iterar el for interno.
        System.out.println("Ingresa el valor de la variable cantidad2:");

        // Guardamos el número a evaluar.
        cantidad2 = lector.nextInt();
        
        // Iteramos con dos ciclos for.
        for(int i = 1; i <= cantidad1; i++) {
            for(int j = 1; j <= cantidad2; j++) {
                // if(j % 2 == 0)
                System.out.println("Valor de i: " + i + " valor de j: " + j);
            }
        }
        
        // Cerramos el Scanner.
        lector.close();

    } // Fin main.

} // Fin CiclosAnidados.