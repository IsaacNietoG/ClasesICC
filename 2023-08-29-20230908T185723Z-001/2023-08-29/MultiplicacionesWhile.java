// Importa las clases necesarias.
import java.util.Scanner;

/**
 * Clase MultiplicacionesWhile.java
 * Programa que nos imprime las tablas de multiplicar según la entrada del
 * usuario con un ciclo while.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Agosto 2023.
 */
public class MultiplicacionesWhile {

    /**
     * Método main (el cual es el punto inicial de la JVM para comenzar con la
     * ejecución de un programa de Java).
     */
    public static void main(String[] args) {

        // Declaración de variables.
        int tabla, cantidad;
        Scanner lector;

        // Creamos el Scanner.
        lector = new Scanner(System.in);

        // Mensaje donde pedimos la tabla a calcular al usuario.
        System.out.println("Introduce el número de la tabla a calcular:");

        // Guardamos el número a evaluar.
        tabla = lector.nextInt();

        // Mensaje donde pedimos las veces que queremos calcular la tabla.
        System.out.println("Ingresa las veces que quieres calcular la tabla:");

        // Guardamos el número a evaluar.
        cantidad = lector.nextInt();
        
//        // Inicialización de la variable contadora.
//        int i = 0;
//        // Iteramos con un ciclo while.
//        while(i < cantidad) {
//          System.out.println(tabla + " x " + i + " = " + tabla*i);
//          // Actualización del contador
//        }
        
        // // Inicialización de la variable contadora.
         int i = 1;
         // Iteramos con un ciclo while.
         while(i <= cantidad){
             System.out.println(tabla + " x " + i + " = " + tabla*i);
             // Actualización del contador
             i++;
         }

        // Cerramos el Scanner.
        lector.close();

    } // Fin main.

} // Fin MultiplicacionesWhile.