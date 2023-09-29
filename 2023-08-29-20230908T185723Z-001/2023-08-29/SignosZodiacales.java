// Importa las clases necesarias.
import java.util.Scanner;

/**
 * Clase SignosZodiacales.java Creamos un programa para calcular los signos
 * zodiacales: A partir del día y número del mes de nacimiento, vamos a calcular
 * el signo zodiacal del usuario.
 * 
 * @author Sánchez Morales Rodrigo Alejandro.
 * @version Agosto 2023.
 */
public class SignosZodiacales {

    /**
     * Método main (el cual es el punto inicial de la JVM para comenzar con la
     * ejecución de un programa de Java).
     */
    public static void main(String[] args) {

        // Declaración de variables.
        int dia;
        int mes;
        Scanner lector1;
        Scanner lector2;

        // Creamos el Scanner.
        lector1 = new Scanner(System.in);
        lector2 = new Scanner(System.in);

        // Mensaje donde pedimos al usuario su día de nacimiento con un mensaje amistoso
        System.out.println("Hola, ingresa el dia en el que naciste: ");
        // Guardamos el dia de nacimiento.
        dia = lector1.nextInt();

        // Mensaje donde pedimos al usuario su mes de nacimiento con un mensaje amistoso
        System.out.println("Ingresa el numero del mes en el que naciste: ");
        // Guardamos el mes de nacimiento.
        mes = lector1.nextInt();

        // Mensaje parcial del resultado que se continuará enseguida.
        System.out.print("Naciciste el dia " + dia + " del mes " + mes +
                         " por lo que" + 
                         " tu signo " + 
                         "zodiacal es: " + " ");

        if ((dia > 22 && mes == 12) || (dia <= 20 && mes == 1)) {
            System.out.println("Capricornio");
        } else {
            if ((dia > 21 && mes == 6) || (dia <= 19 && mes == 2)) {
                System.out.println("Acuario");
            } else {
                if ((dia > 20 && mes == 2) || (dia <= 20 && mes == 3)) {
                    System.out.println("Picis");
                } else {
                    if ((dia > 21 && mes == 3) || (dia <= 19 && mes == 4)) {
                        System.out.println("Aries");
                    } else {
                        if ((dia > 20 && mes == 4) || (dia <= 20 && mes == 5)) {
                            System.out.println("Tauro");
                        } else {
                            if ((dia > 21 && mes == 5) || (dia <= 21 && mes == 6)) {
                                System.out.println("Geminis");
                            } else {
                                if ((dia > 22 && mes == 6) || (dia <= 23 && mes == 7)) {
                                    System.out.println("Cancer");
                                } else {
                                    if ((dia > 24 && mes == 7) || (dia <= 23 && mes == 8)) {
                                        System.out.println("Leo");
                                    } else {
                                        if ((dia > 24 && mes == 8) || (dia <= 22 && mes == 9)) {
                                            System.out.println("Virgo");
                                        } else {
                                            if ((dia > 23 && mes == 9) || (dia <= 22 && mes == 10)) {
                                                System.out.println("Libra");
                                            } else {
                                                if ((dia > 23 && mes == 10) || (dia <= 22 && mes == 11)) {
                                                    System.out.println("Escorpion");
                                                } else {
                                                    {
                                                        System.out.println("Sagitario");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

                // if (dia >= 22 && mes == 12 || dia <= 22 && mes == 1) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es capricornio.");
        // }
        // if (dia >= 21 && mes == 1 || dia <= 19 && mes == 2) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es acuario.");
        // }
        // if (dia >= 20 && mes == 2 || dia <= 20 && mes == 3) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es picis.");
        // }
        // if (dia >= 21 && mes == 3 || dia <= 19 && mes == 4) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es aries.");
        // }
        // if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es tauro.");
        // }
        // if (dia >= 21 && mes == 5 || dia <= 21 && mes == 6) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es geminis.");
        // }
        // if (dia >= 22 && mes == 6 || dia <= 23 && mes == 7) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es cancer.");
        // }
        // if (dia >= 24 && mes == 7 || dia <= 23 && mes == 8) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es leo.");
        // }
        // if (dia >= 24 && mes == 8 || dia <= 22 && mes == 9) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es virgo.");
        // }
        // if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es libra.");
        // }
        // if (dia >= 23 && mes == 10 || dia <= 22 && mes == 11) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es escorpio.");
        // }
        // if (dia >= 23 && mes == 11 || dia <= 20 && mes == 12) {
        //     System.out.println("Si naciste el " + dia + " del mes " + mes + ", tu signo zodiacal es sagitario.");
        // }
        // switch (mes) {
        //     case 1:
        //         if (día > 21) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres acuario");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres capricornio");
        //         }
        //         break;
        //     case 2:
        //         if (día > 19) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres piscis");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres acuario");
        //         }
        //         break;
        //     case 3:
        //         if (día > 20) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres aries");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres piscis");
        //         }
        //         break;
        //     case 4:
        //         if (día > 19) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres tauro");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres aries");
        //         }
        //         break;
        //     case 5:
        //         if (día > 21) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres géminis");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres tauro");
        //         }
        //         break;
        //     case 6:
        //         if (día > 20) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres cáncer");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres géminis");
        //         }
        //         break;
        //     case 7:
        //         if (día > 22) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres leo");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres cáncer");
        //         }
        //         break;
        //     case 8:
        //         if (día > 21) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres virgno");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres leo");
        //         }
        //         break;
        //     case 9:
        //         if (día > 22) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres libra");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres virgo");
        //         }
        //         break;
        //     case 10:
        //         if (día > 22) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres escorpión");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres libra");
        //         }
        //         break;
        //     case 11:
        //         if (día > 21) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres sagitario");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres escorpión");
        //         }
        //         break;
        //     case 12:
        //         if (día > 21) {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres capricornio");
        //         } else {
        //             System.out.println("Si naciste el " + día + " del " + mes + ", eres sagitario");
        //         }
        //         break;
        //     default:
        //         System.out.println("Ingresa un mes correcto.");
        //         break;
        // }

        // Cerramos el Scanner.
        lector1.close();
        lector2.close();

    } // Fin main.

} // Fin CalculaBeca .