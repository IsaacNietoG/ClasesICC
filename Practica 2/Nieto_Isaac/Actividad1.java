import java.util.Scanner;

public class Actividad1 {
    public static double resultado = 0;
    public static void celsiusFahrenheit(String entrada){
        resultado = Double.parseDouble(entrada) * 9 / 5 + 32;
    }
    public static void fahrenheitCelsius(String entrada){
        resultado = (Double.parseDouble(entrada) - 32) * 5 / 9;
    }
    public static void kelvinCelsius(String entrada){
        resultado = Double.parseDouble(entrada) - 273.15;
    }
    public static void celsiusKelvin(String entrada){
        resultado = Double.parseDouble(entrada) + 273.15;
    }
    public static void fahrenheitKelvin(String entrada){
        resultado = (Double.parseDouble(entrada) - 32) * 5 / 9 + 273.15;
    }
    public static void kelvinFahrenheit(String entrada){
        resultado = (Double.parseDouble(entrada)-273.15) * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        char repetir = 'y';
        do {
            Scanner input = new Scanner(System.in);
            // Declaracion de variables
            repetir = ' ';
            char eleccion = ' ';
            String entradaString = "";
            // Explicacion al user
            do {
                System.out.println("Bienvenido al conversor de grados.");
                System.out.println("Este programa puede realizar las siguientes conversiones:");
                System.out.println("a) Celsius a Fahrenheit");
                System.out.println("b) Fahrenheit a Celsius");
                System.out.println("c) Kelvin a Fahrenheit");
                System.out.println("d) Celsius a Kelvin");
                System.out.println("e) Fahrenheit a Kelvin");
                System.out.println("f) Kelvin a Fahrenheit");
                System.out.print("Elija la opción que guste... ");
                eleccion = input.next().toLowerCase().charAt(0);
                if (eleccion != 'a' && eleccion != 'b' && eleccion != 'c' && eleccion != 'c' && eleccion != 'd'
                        && eleccion != 'e' && eleccion != 'f') {
                    System.out.println("Eleccion incorrecta, vuelva a intentar");
                    repetir = 'y';
                } else {
                    repetir = 'n';
                }
            } while (repetir == 'y');
            // Captura de datos
            do {
                System.out.print("Inserte el dato que desea convertir...");
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
            // Direccionamiento a metodo adecuado
            switch(eleccion){
                case 'a':
                    celsiusFahrenheit(entradaString);
                    break;
            case 'b':
                fahrenheitCelsius(entradaString);
                break;
            case 'c':
                kelvinCelsius(entradaString);
                break;
            case 'd':
                celsiusKelvin(entradaString);
                break;
            case 'e':
                fahrenheitKelvin(entradaString);
                break;
            case 'f':
                kelvinFahrenheit(entradaString);
                break;
            }
            //Retorno de resultado.
            System.out.println("El resultado de tu operación es: "+resultado);
            //Repetir?
            System.out.print("Desea repetir el programa para realizar otra operación? (y/n)...");
            repetir = input.next().toLowerCase().charAt(0);
        } while (repetir == 'y'); 
    }
}
