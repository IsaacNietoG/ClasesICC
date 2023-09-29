// Importa las clases necesarias.
import java.util.Scanner;
import static java.lang.System.*; // Evita escribir la palabra System.

/**
 * CalculadoraComplejo.java Clase que implementa las caracter�sticas de
 * Complejo, para construir una calculadora. Se ilustra el uso se switch
 * anidados para lograr crear submen�s de opciones. Se exploran los m�todos
 * equals y toString
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Septiembre 2023.
 */
public class CalculadoraComplejo {

    public static void main(String[] args) {
        // Definici�n de variables u objetos.
        Scanner lector = new Scanner(in);
        double r, i; // Para leer la parte real y la parte imaginaria.
        // Se definen ambos Complejos en null, porque no sabemos cu�les
        // elegir� el usuario.
        Complejo c1 = null;
        Complejo c2 = null;
        int opcion, op, cual; // Para leer las opciones del men� y submen�
        
        // Men� principal
        do {
            out.println("1. M�todos constructores");
            out.println("2. M�todos de acceso (GET)");
            out.println("3. M�todos modificadores (SET)");
            out.println("4. M�todos calculadores");
            out.println("5. Salir");

            // Leer la opci�n elegida por el usuario
            out.println("\nEscribe tu opci�n:");
            opcion = lector.nextInt(); // Leemos la opci�n del usuario para el men� principal
            
            switch (opcion) {

                case 1: // 1. M�todos constructores
                    do {
                        out.println("1. Constructor por omision");
                        out.println("2. Constructor por par�metros");
                        out.println("3. Salir men� constructores");
                        out.println("\nEscribe una opci�n:");
                        op = lector.nextInt(); // Leer la elecci�n del usuario (submen� 1)
                        switch (op) {
                            case 1: // 1.1 Constructor por omision
                                out.println("�Qu� complejo quieres definir (Escribe 1 o 2)?");
                                cual = lector.nextInt(); // Leemos la opci�n correspondiente al n�mero Complejo a crear
                                if (cual == 1) { // Sea crea el Complejo 1
                                    c1 = new Complejo();
                                    System.out.println("Complejo 1 creado!\n");
                                }
                                if (cual == 2) { // Sea crea el Complejo 2
                                    c2 = new Complejo();
                                    System.out.println("Complejo 2 creado!\n");
                                }
                                break;
                            case 2: // 1.2 Constructor por par�metros
                                out.println("Qu� complejo quieres definir (1 o 2)?");
                                cual = lector.nextInt(); // Leemos la opci�n correspondiente al n�mero Complejo a crear
                                if (cual == 1) { // Sea crea el Complejo 1 (por par�metros)
                                    out.println("Escribe la parte real:");
                                    r = lector.nextDouble();
                                    out.println("Escribe la parte imaginaria:");
                                    i = lector.nextDouble();
                                    c1 = new Complejo(r, i);
                                    System.out.println("Complejo 1 creado!\n");
                                }
                                if (cual == 2) { // Sea crea el Complejo 2 (por par�metros)
                                    out.println("Escribe la parte real:");
                                    r = lector.nextDouble();
                                    out.println("Escribe la parte imaginaria:");
                                    i = lector.nextDouble();
                                    c2 = new Complejo(r, i);
                                    System.out.println("Complejo 2 creado!\n");
                                }
                                break;
                            case 3: // 1.3 Salir men� constructores
                                out.println("Saliendo del men� de Constructores...\n");
                                break;
                            default: // Control de errores
                                out.println("Opci�n incorrecta. Solo se permiten valores de 1 a 3\n");
                        }// Fin switch
                    } while (op != 3);
                    break;

                case 2: // 2. M�todos de acceso (GET)
                    // Comprobar que ya se hayan definido ambos Complejos, evitar error
                    // NULLPOINTEREXCEPTION
                    if (c1 == null && c2 == null) { // Si no se han definido los objetos
                        out.println("No se han creado los objetos c1 y/o c2\n");
                        break; // Salimos del men� de m�todos de Acceso
                    }
                    do {// Si ya se crearon, se despliega el men� correspondiente
                        out.println("1. Obtener parte real (GETA)");
                        out.println("2. Obtener parte imaginaria (GETB)");
                        out.println("3. Salir men� m�todos de acceso");

                        out.println("\nEscribe tu opci�n");
                        op = lector.nextInt(); // Leer la elecci�n del usuario (submen� 2)
                        switch (op) {
                            case 1: // 2.1 Obtener parte real (GETA)
                                out.println("De qu� complejo quieres leer la parte real (1 o 2)?");
                                cual = lector.nextInt(); // Leemos la opci�n correspondiente al n�mero Complejo a tomar
                                                         // en
                                                         // cuenta
                                if (cual == 1) // Se eligi� el Complejo 1
                                    out.println("La parte real de c1 es: " + c1.getA() + "\n");
                                if (cual == 2) // Se eligi� el Complejo 2
                                    out.println("La parte real de c2 es: " + c2.getA() + "\n");
                                break;
                            case 2: // 2.2 Obtener parte imaginaria (GETB)
                                out.println("De qu� complejo quieres leer la parte imaginaria (1 o 2)?");
                                cual = lector.nextInt(); // Leemos la opci�n correspondiente al n�mero Complejo a tomar
                                                         // en
                                                         // cuenta
                                if (cual == 1) // Se eligi� el Complejo 1
                                    out.println("La parte imaginaria de c1 es: " + c1.getB() + "\n");
                                if (cual == 2) // Se eligi� el Complejo 2
                                    out.println("La parte imaginaria de c2 es: " + c2.getB() + "\n");
                                break;
                            case 3: // 2.3 Salir men� m�todos de acceso
                                out.println("Saliendo del men� de m�todos de acceso\n");
                                break;
                            default: // Control de errores
                                out.println("Opci�n incorrecta. Solo se permiten valores de 1 a 3\n");
                        }// Fin switch
                    } while (op != 3);
                    break;

                case 3: // 3. M�todos modificadores (SET)
                    // Comprobar que ya se hayan definido ambos Complejos, evitar error
                    // NULLPOINTEREXCEPTION
                    if (c1 == null && c2 == null) { // Si no se han definido los objetos
                        out.println("No se han creado los objetos c1 y/o c2\n");
                        break; // Salimos del men� de m�todos modificadores
                    }
                    do { // Si ya se crearon, se despliega el men� correspondiente
                        out.println("1. Modificar parte Real (SETA)");
                        out.println("2. Modificar parte Imaginaria (SETB)");
                        out.println("3. Salir men� m�todos modificadores");

                        out.println("Escribe tu opci�n");
                        op = lector.nextInt(); // Leer la elecci�n del usuario (submen� 3)
                        switch (op) {
                            case 1: // 3.1 Modificar parte Real (SETA)
                                out.println("De qu� complejo quieres modificar la parte real (1 o 2)?");
                                cual = lector.nextInt(); // Leemos la opci�n correspondiente al n�mero Complejo a tomar
                                                         // en
                                                         // cuenta
                                if (cual == 1) { // Se eligi� modificar el Complejo 1
                                    out.println("Escribe el nuevo valor de la parte real:");
                                    r = lector.nextDouble();
                                    c1.setA(r);
                                    out.println();
                                }
                                if (cual == 2) { // Se eligi� modificar el Complejo 2
                                    out.println("Escribe el nuevo valor de la parte real:");
                                    r = lector.nextDouble();
                                    c2.setA(r);
                                    out.println();
                                }
                                break;
                            case 2: // 3.2 Modificar parte Imaginaria (SETB)
                                out.println("De qu� complejo quieres modificar la parte imaginaria (1 o 2)?");
                                cual = lector.nextInt(); // Leemos la opci�n correspondiente al n�mero Complejo a tomar
                                                         // en
                                                         // cuenta
                                if (cual == 1) { // Se eligi� modificar el Complejo 1
                                    out.println("Escribe el nuevo valor de la parte imaginaria:");
                                    r = lector.nextDouble();
                                    c1.setB(r);
                                    out.println();
                                }
                                if (cual == 2) { // Se eligi� modificar el Complejo 2
                                    out.println("Escribe el nuevo valor de la parte imaginaria:");
                                    r = lector.nextDouble();
                                    c2.setB(r);
                                    out.println();
                                }
                                break;
                            case 3: // 3.3 Salir men� m�todos modificadores
                                out.println("Saliendo del men� GET\n");
                                break;
                            default: // Control de errores
                                out.println("Opci�n incorrecta. Solo se permiten valores de 1 a 3\n");
                        }// Fin switch
                    } while (op != 3);
                    break;

                case 4: // 4. M�todos calculadores
                    // Comprobar que ya se hayan definido ambos Complejos, evitar error
                    // NULLPOINTEREXCEPTION
                    if (c1 == null && c2 == null) { // No se han definido los objetos
                        out.println("No se han creado los objetos c1 y/o c2\n");
                        break; //// Salimos del men� de m�todos calculadores
                    }
                    do { // Si ya se crearon, se despliega el men� correspondiente
                        out.println("1. Sumar 2 n�meros Complejos");
                        out.println("2. Restar 2 n�meros Complejos");
                        out.println("3. Multiplicar 2 n�meros Complejos");
                        out.println("4. Dividir 2 n�meros Complejos");
                        out.println("5. Conjugado de un n�mero Complejo");
                        out.println("6. Saber si dos n�meros Complejos son iguales (equals)");
                        out.println("7. Convertir un n�mero Complejo a cadena (toString)");
                        out.println("8. Salir calculadores");

                        out.println("\nEscribe una opci�n:");
                        op = lector.nextInt(); // Leer la elecci�n del usuario (submen� 4)
                        switch (op) {
                            case 1: // 4.1 Sumar 2 n�meros Complejos
                                out.println("La suma de c1 y c2 es: " + c2.sumar(c1) + "\n");
                                break;
                            case 2: // 4.2 Restar 2 n�meros Complejos
                                out.println("La resta de c1 y c2 es: " + c1.restar(c2) + "\n");
                                break;
                            case 3: // 4.3 Multiplicar 2 n�meros Complejos
                                out.println("La multiplicaci�n de c1 y c2 es: " + c1.multiplicar(c2) + "\n");
                                break;
                            case 4: // 4.4 Dividir 2 n�meros Complejos
                                // En el video no se indic�, pero se debe asegurar que el Complejo 2, no sea: 0
                                // + 0i
                                if (c2.equals(new Complejo(0, 0))) // Si C2 == 0 + 01
                                    out.println(
                                            "No se puede efectuar la divisi�n, el denominador no puede ser 0 + 0i\n");
                                else // Si se puede dividir
                                    out.println("La divisi�n de c1/c2 es: " + c1.dividir(c2) + "\n");
                                break;
                            case 5: // 4.5 Conjugado de un n�mero Complejo
                                out.println("Cual objeto quieres conjugar (1 o 2)");
                                cual = lector.nextInt(); // Leemos la opci�n correspondiente al n�mero Complejo a tomar
                                                         // en
                                                         // cuenta
                                if (cual == 1) // Se eligi� conjugar el Complejo 1
                                    out.println("El conjugado de c1 es: " + c1.conjugado() + "\n");
                                if (cual == 2) // Se eligi� conjugar el Complejo 2
                                    out.println("El conjugado de c2 es: " + c1.conjugado() + "\n");
                                break;
                            case 6: // 4.6 Saber si dos n�meros Complejos son iguales (equals)
                                if (c1.equals(c2))
                                    out.println("c1 y c2 son iguales\n");
                                else
                                    out.println("c1 y c2 son diferentes\n");
                                break;
                            case 7: // 4.7 Convertir un n�mero Complejo a cadena (toString)
                                out.println("Cu�l objeto quieres imprimir (1 o 2)");
                                cual = lector.nextInt(); // Leemos la opci�n correspondiente al n�mero Complejo a tomar
                                                         // en
                                                         // cuenta
                                if (cual == 1) // Se eligi� convertir al Complejo 1
                                    out.println("El Complejo 1 es: " + c1 + "\n");
                                if (cual == 2) // Se eligi� convertir al Complejo 1
                                    out.println("El Complejo 2 es: " + c2 + "\n");
                                break;
                            case 8: // 4.8 Salir del men� de m�todos calculadores
                                out.println("Saliendo del men� de m�todos calculadores\n");
                                break;
                            default: // Control de errores
                                out.println("Opci�n incorrecta. Solo se permiten valores de 1 a 8");
                        }// Fin switch
                    } while (op != 8);
                    break;

                case 5: // Salir del men� principal
                    out.println("Saliendo del men� principal, �Hasta luego!");
                    break;

                default: // Control de errores
                    out.println("�Opci�n incorrecta! Solo se permiten valores de 1 a 5");
            
            }// Fin switch.

        } while (opcion != 5);

    } // Fin main.

} // Fin CalculadoraComplejo.