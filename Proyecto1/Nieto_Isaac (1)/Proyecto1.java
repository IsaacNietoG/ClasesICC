import java.util.Scanner;
import java.util.Random;

public class Proyecto1 {
    public static int repetir = 0;
    public static int victorias, derrotas, choice;
    public static int estadodeJuego;
    public static Scanner input = new Scanner(System.in);
    public static String peliculaCurrent = "";
    public static String displayString = "";
    public static char letra = ' ';
    public static String letrasEncontradas = " ";
    public static int strikes = 6;

    public static void main(String[] args) {
        String nameString;
        String choiceString;
        //Inicializado
        do {
            System.out.println("Bienvenido al juego de Ahorcado.");
            System.out.print("Inserte su nombre: ");
            nameString = input.next();
            //Main Menu
            do {
                do {
                    System.out.println("Bienvenido " + nameString + " que deseas hacer hoy?");
                    System.out.println("1. Jugar al ahorcado");
                    System.out.println("2. Ver estadisticas");
                    System.out.println("3. Salir");
                    choiceString = input.next();
                    validador(0, choiceString);
                } while (repetir == 1);
                switch (choice) {
                    case 1:
                        repetir = 1;
                        ahorcadoJuego();
                        break;
                    case 2:
                        scoreBoard(nameString);
                        repetir = 1;
                        break;
                    case 3:
                        repetir = 0;
                        break;
                }
                if (estadodeJuego == 1 && repetir == 1) {
                    depurarVariables();
                    System.out.println("Felicidades has ganado!!");
                    victorias++;
                } else if (estadodeJuego == 2 && repetir == 1) {
                    depurarVariables();
                    System.out.println("Has perdido!!");
                    derrotas++;
                }
            } while (repetir == 1);
        } while (repetir == 1);
    }

    public static void validador(int mode, String string) {
        if (mode == 0) {
            if (string.length() != 1) {
                System.out.println("Opcion invalida, intentar de nuevo");
                repetir = 1;
            }
            for (int i = 0; i < string.length(); i++) {
                if (!(Character.isDigit(string.charAt(i)))) {
                    System.out.println("Opcion invalida, intentar de nuevo");
                    repetir = 1;
                } else {
                    choice = Integer.parseInt(string);
                    repetir = 0;
                }
            }
        } else if (mode == 1) {
            if (string.length() != 1) {
                System.out.println("Opcion invalida, intentar de nuevo");
            } else {
                letra = string.charAt(0);
                buscadorLetras(letra);
            }
        }
    }

    public static void buscadorLetras(char letter) {
        boolean found = false;
        //Pre-verificado
        //Para no verificar y agregar una letra si esta ya fue encontrada
        //Ya que esto trae bugs
        for (int i = 0; i < letrasEncontradas.length(); i++) {
            if (letter == letrasEncontradas.charAt(i)) {
                return;
            }
        }
        for (int i = 0; i < peliculaCurrent.length(); i++) {
            if (peliculaCurrent.toLowerCase().charAt(i) == letter) {
                letrasEncontradas += letter;
                found = true;
                break;
            } else {
                found = false;
            }
        }
        if (!found) {
            strikes -= 1;
        }
        if (strikes == 0) {
            estadodeJuego = 2;
        }
    }

    public static void displayScreen() {
        //Generador de displayString
        boolean encontrado = false;
        displayString = "";
        for (int i = 0; i < peliculaCurrent.length(); i++) {
            encontrado = false;
            for (int j = 0; j < letrasEncontradas.length(); j++) {
                if (peliculaCurrent.toLowerCase().charAt(i) == letrasEncontradas.charAt(j)) {
                    displayString = displayString + peliculaCurrent.charAt(i);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                displayString = displayString + "_";
            }
        }
        //Generador del ahorcado
        String ahorcadoMuneco = "";
        for (int i = 6; i >= strikes; i--) {
            if (i == 5) {
                ahorcadoMuneco += "  0\n";
            }
            if (i == 4 && strikes == 4) {
                ahorcadoMuneco += "  |\n";
            }
            if (i == 3 && strikes == 3) {
                ahorcadoMuneco += "/ |\n";
            }
            if (i == 2) {
                ahorcadoMuneco += "/ | \\\n";
            }
            if (i == 1 && strikes == 1) {
                ahorcadoMuneco += " /\n";
            }
            if (i == 0) {
                ahorcadoMuneco += " / \\\n";
            }
        }
        //Impresion.
        System.out.println(ahorcadoMuneco);
        System.out.println("\n" + displayString);
        //Verificador de victoria
        if (displayString.equals(peliculaCurrent)) {
            estadodeJuego = 1;
        }
    }

    public static void ahorcadoJuego() {
        String intentoString = "";
        // Strings para las peliculas
        String pelicula1 = "Kung Fu Panda";
        String pelicula2 = "Espantatiburones";
        String pelicula3 = "Happy Feet";
        String pelicula4 = "Black Adam";
        String pelicula5 = "Fast and Furious";
        String pelicula6 = "The Fallout";
        String pelicula7 = "Guardians of The Galaxy";
        String pelicula8 = "The Covenant";
        String pelicula9 = "The Whale";
        String pelicula10 = "Martin Hache";
        // Randomizador
        Random generador = new Random();
        switch (generador.nextInt(10) + 1) {
            case 1:
                peliculaCurrent = pelicula1;
                break;
            case 2:
                peliculaCurrent = pelicula2;
                break;
            case 3:
                peliculaCurrent = pelicula3;
            case 4:
                peliculaCurrent = pelicula4;
                break;
            case 5:
                peliculaCurrent = pelicula5;
                break;
            case 6:
                peliculaCurrent = pelicula6;
                break;
            case 7:
                peliculaCurrent = pelicula7;
                break;
            case 8:
                peliculaCurrent = pelicula8;
                break;
            case 9:
                peliculaCurrent = pelicula9;
                break;
            case 10:
                peliculaCurrent = pelicula10;
                break;
        }
        //Display y juego
        estadodeJuego = 0;
        while (estadodeJuego == 0) {
            displayScreen();
            System.out.print("Inserta una letra..");
            intentoString = input.next();
            validador(1, intentoString.toLowerCase());
        }
    }

    public static void scoreBoard(String name) {
        System.out.println("Puntuaciones para el jugador: " + name);
        System.out.println("Juegos ganados: " + victorias);
        System.out.println("Juegos perdidos: " + derrotas);
        repetir = 1;
        System.out.print("Presione cualquier tecla para continuar...");
        input.next();
    }

    public static void depurarVariables() {
        estadodeJuego = 0;
        letrasEncontradas = " ";
        strikes = 6;
    }
}
