// Importa las clases necesarias.
import java.util.Scanner;
import static java.lang.System.*;   // Evita escribir la palabra System.

/**
 * PruebaCafetera.java Este programa permite probar las capacidades (métodos)
 * definidas en la clase CafeteraMejorada, sin depender de BlueJ. Se utiliza la
 * sentencia SWITCH para definir un menú de opciones, que corresponden a cada
 * uno de los métodos de CafeteraMejorada.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Septiembre 2023.
 */
public class PruebaCafeteraMejorada {

    /**
     * Este método convierte nuestros programas en aplicaciones, ya que permite
     * probar las capacidades de la clase CafeteraMejorada.
     * 
     * @param args Un arreglo de cadenas de caracter.
     */
    public static void main(String[] args) {

        // Definición de variables y objetos.
        int opcion; // Capturar (guardar) la opción de menú elegida.
        int cap, cant, respuesta;
        boolean enc;
        // La cafetera depende la elección del usuario null es un objeto que
        // existe, pero no está definido aún.
        CafeteraMejorada miCafetera = null;
        Scanner lector = new Scanner(in); // Interación con el usuario.

        // Definición del menú de opciónes. Se utiliza un método println por
        // cada uno de los métodos que tiene CafeteraMejorada.
        do {// A partir de este punto comienza la repetición
            out.println("1. Constructor por omisión.");
            out.println("2. Constructor que recibe 3 parámetros.");
            out.println("3. Constructor que recibe 2 parámetros.");
            out.println("4. getCantidad.");
            out.println("5. getCapacidad.");
            out.println("6. getEncendida.");
            out.println("7. setCapacidad.");
            out.println("8. setCantidad.");
            out.println("9. setEncendida.");
            out.println("10. vaciar.");
            out.println("11. llenar.");
            out.println("12. estaVacia.");
            out.println("13. estaLlena.");
            out.println("14. servirTaza.");
            out.println("15. servirCantidad.");
            out.println("16. toString.");
            out.println("17. Salir.");
            // Esta opción no es un método de CafeteraMejorada pero se requiere
            // para que el usuario sepa cómo finalizar el programa.

            out.println("\nEscribe una opción:");
            // Se utiliza "\n" para indicarle a println que queremos
            // explícitamente un salto de línea.
            opcion = lector.nextInt(); // Lectura de la opción del usuario

            // Una vez guardada la opción del usuario, se manda este valor al
            // switch, quien se encargará de determinar con cuál de los casos
            // definidos coincide. En caso de que el valor leído no corresponda
            // con ninguno de los CASE, se manda directamente a la opción
            // definida por omisión: default, la cual suele utilizarse para
            // manejo de errores.
            switch(opcion) {

                case 1: // Constructor por omisión.
                    miCafetera = new CafeteraMejorada();
                    out.println("¡Objeto por omisión creado!\n");
                    break;

                case 2: // Constructor de 2 parámetros.
                    out.println("Escribe un valor entero para la capacidad de café:");
                    cap = lector.nextInt();
                    if(cap < 0) {
                        out.println("La capacidad de la cafetera debe ser positiva");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    out.println("Escribe un valor entero para la cantidad de café:");
                    cant = lector.nextInt();
                    if(cant < 0 || cant > cap) {
                        out.println("La cantidad de café no puede ser negativa o mayor que la capacidad");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    miCafetera = new CafeteraMejorada(cap, cant);
                    out.println("¡Objeto a través de 2 parámetros creado!\n");
                    break;

                case 3: // Constructor de 3 parámetros.
                    out.println("Escribe un valor entero para la capacidad de café:");
                    cap = lector.nextInt();
                    if(cap < 0) {
                        out.println("¡La capacidad de café debe ser positiva!");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    out.println("Escribe un valor entero para la cantidad de café:");
                    cant = lector.nextInt();
                    if(cant < 0 || cant > cap) {
                        out.println("La cantidad de café no puede ser negativa o mayor que la capacidad:");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    out.println("Escribe true para encender o false para apagar la cafetera:");
                    enc = lector.nextBoolean();
                    miCafetera = new CafeteraMejorada(cap, cant, enc);
                    out.println("¡Objeto a través de 3 parámetros creado!\n");
                    break;

                case 4: // Método getCantidad.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    respuesta = miCafetera.getCantidad();
                    if(respuesta == -1) {
                        out.println("¡La cafetera está apagada!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    out.println("La cantidad de café es: " + respuesta + " ml.");
                    break;

                case 5: // Método getCapacidad.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    respuesta = miCafetera.getCapacidad();
                    if(respuesta == -1) {
                        out.println("¡La cafetera está apagada!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    out.println("La capacidad de la cafetera es: " + respuesta + " ml.");
                    break;

                case 6: // Método getEncendida.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    // Se consulta el estatus de la Cafetera, para dar un mensaje más claro.
                    if(miCafetera.getEncendida())
                        out.println("¡La cafetera está encendida!\n");
                    else
                        out.println("¡La cafetera está apagada!\n");
                    break;

                case 7: // Método setCapacidad.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break;
                    }
                    if(!miCafetera.getEncendida()) { // Verifica si está apagada la cafetera.
                        out.println("¡La cafetera está apagada!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    // Si no sucede nada de lo anterior, la cafetera está encendida.
                    out.println("Escribe un valor entero positivo para la capacidad:");
                    cap = lector.nextInt();
                    if(cap < 0 || cap < miCafetera.getCantidad()) {
                        out.println("La capacidad no puede ser negativa ni menor que la cantida de café actual.\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    // Si la capacidad es válida.
                    miCafetera.setCapacidad(cap);
                    break;

                case 8: // Método setCantidad.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    if(!miCafetera.getEncendida()) { // Verifica si está apagada la cafetera.
                        out.println("¡La cafetera está apagada!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    out.println("Escribe un valor entero positivo para la cantidad:");
                    cant = lector.nextInt();
                    if(cant < 0 || cant > miCafetera.getCapacidad()) {
                        out.println("La cantidad no puede ser negativa ni mayor que la capacidad de la cafetera.\n");
                        break;
                    }
                    // Si la cantidad es válida.
                    miCafetera.setCantidad(cant);
                    break;

                case 9: // Método setEncendida.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break;
                    }
                    out.println("Escribe true para encender o false para apagar la cafetera:");
                    enc = lector.nextBoolean();
                    miCafetera.setEncendida(enc);
                    break;

                case 10: // Método vaciar.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break;
                    }
                    if(miCafetera.getEncendida()) { // Se realiza la operación sólo si está encendida.
                        miCafetera.vaciar();
                        out.println("¡La cafetera ahora está vacía!\n");
                    } else
                        out.println("¡La cafetera está apagada!\n");
                    break;

                case 11: // Método llenar.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break;
                    }
                    if(miCafetera.getEncendida()) { // Se realiza la operación sólo si está encendida.
                        miCafetera.llenar();
                        out.println("¡La cafetera está llena!\n");
                    } else
                        out.println("¡La cafetera está apagada!\n");
                    break;

                case 12: // Método estaVacia.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break;
                    }
                    if(miCafetera.getEncendida()) { // Comprobar que la Cafetera está encendida.
                        if(miCafetera.estaVacia())
                            out.println("La caferera está vacía");
                        else
                            out.println("La cafetera tiene " + miCafetera.getCantidad() + " ml de café\n");
                    } else
                        out.println("¡La cafetera está apagada!\n");
                    break;

                case 13: // Método estaLlena.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break;
                    }
                    if(miCafetera.getEncendida()) { // Comprobar que la Cafetera está encendida.
                        if(miCafetera.estaLlena())
                            out.println("La cafetera está llena\n");
                        else
                            out.println("La cafetera tiene " + miCafetera.getCantidad() + " ml de café\n");
                    } else
                        out.println("¡La cafetera está apagada!\n");
                    break;

                case 14: // Método servirTaza.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break;
                    }
                    // Compruba si la Cafetera está encendida.
                    if(!miCafetera.getEncendida()) { // Verifica si está apagada la cafetera.
                        out.println("¡La cafetera está apagada!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    miCafetera.servirTaza();
                    break;

                case 15: // Método servirCantidad.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    // Compruba si la Cafetera está encendida.
                    if(!miCafetera.getEncendida()) { // Verifica si está apagada la cafetera.
                        out.println("¡La cafetera está apagada!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    out.println("Indica la cantidad de café a servir:");
                    cant = lector.nextInt();
                    if(cant < 0) {
                        out.println("La cantidad de café a servir no puede ser negativa\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    miCafetera.servirCantidad(cant);
                    break;

                case 16: // toString.
                    // Verificar que el objeto esté creado.
                    if(miCafetera == null) {
                        out.println("¡El objeto no ha sido creado!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    // Verifica si la Cafetera está encendida.
                    if(!miCafetera.getEncendida()) { // Verifica si está apagada la cafetera.
                        out.println("¡La cafetera está apagada!\n");
                        break; // Romper la ejecución del switch en caso de error.
                    }
                    out.println(miCafetera.toString() + "\n");
                    break;

                case 17: // Opción para finalizar el programa.
                    out.println("¡Hasta luego! ¡Vuelve pronto!");
                    break;

                default: // Se utiliza en caso de que "opcion" no esté en el intervalo [1,16].
                    out.println("Opción incorrecta, sólo se admiten valores en el intervalo [1-16]");

            } // Fin switch.
        } while(opcion != 17);
        // El programa termina con el valor de opcion = 16 y mientras eso no
        // suceda va a repitir el menú.
    
    } // Fin main.

} // Fin PruebaCafetera.