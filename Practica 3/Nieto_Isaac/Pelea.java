import java.util.Scanner;
import java.util.Random;

public class Pelea {
    public static Scanner inputScanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int repetir = 0;
    public static String errorOpcion = "Marca una opcion valida!";
    public static String separador = "--------------------------------------------------";

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("                                  ,'\\");
            System.out.println("    _.----.        ____         ,'  _\\   ___    ___     ____");
            System.out.println("_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.");
            System.out.println("\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |");
            System.out.println(" \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |");
            System.out.println("   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |");
            System.out.println("    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |");
            System.out.println("     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |");
            System.out.println("      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |");
            System.out.println("       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |");
            System.out.println("        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |");
            System.out.println("                                `'                            '-._|");
            System.out.print("\n\n\n\n");
            System.out.println("1. Comenzar juego...");
            System.out.println("2. Salir...");
            String preOpcion = inputScanner.next();
            for (int i = 0; i < preOpcion.length(); i++) {
                if (i >= 1) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else if (!Character.isDigit(preOpcion.charAt(i))) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else {
                    repetir = 0;
                    opcion = Integer.parseInt(preOpcion);
                }
            }
            switch (opcion) {
                case 1:
                    calculoVelocidad();
                    break;
                case 2:
                    repetir = 0;
                    break;
                default:
                    repetir = 1;
                    System.out.println(errorOpcion);
            }
        } while (repetir == 1);
    }

    public static void calculoVelocidad() {
        Charizard player1 = new Charizard(random.nextInt(100));
        Torterra player2 = new Torterra(random.nextInt(100));
        System.out.println(separador);
        System.out.println("La velocidad de los pokemones ha sido calculada aleatoriamente...");
        if (player1.getSpeed() > player2.getSpeed()) {
            System.out.println("El jugador 1 (Charizard) inicia!!");
            pelea(player1, player2);
        } else {
            System.out.println("El jugador 2 (Torterra) inicia!!");
            pelea(player2, player1);
        }
    }

    public static void pelea(Pokemon pokemon, Pokemon pokemon2) {
        while (pokemon.getEvital() > 0 && pokemon2.getEvital() > 0) {
            System.out.println(separador);
            System.out.println("Es turno de: " + pokemon.nombre);
            System.out.println("Informacion: \n" + pokemon);
            opciones(pokemon, pokemon2);
            System.out.println("Es turno de: " + pokemon2.nombre);
            System.out.println("Informacion: \n" + pokemon2);
            opciones(pokemon2, pokemon);
        }
        if (pokemon.getEvital() > pokemon2.getEvital()){
            System.out.println(separador);
            System.out.println("El pokemon " + pokemon.getNombre() + " ha ganado!!");
            System.out.println(pokemon.getNombre() + " gana " + pokemon2.backpack.getMonedas() + " monedas!!");
            int monedas = pokemon2.backpack.getMonedas();
            pokemon2.backpack.setMonedas(0);
            pokemon.backpack.setMonedas(pokemon.backpack.getMonedas()+monedas);
            System.out.println(separador);
        }else{
            System.out.println(separador);
            System.out.println("El pokemon " + pokemon2.getNombre() + " ha ganado!!");
            System.out.println(pokemon2.getNombre() + " gana " + pokemon.backpack.getMonedas() + " monedas!!");
            int monedas = pokemon.backpack.getMonedas();
            pokemon.backpack.setMonedas(0);
            pokemon2.backpack.setMonedas(pokemon2.backpack.getMonedas() + monedas);
            System.out.println(separador);
        }
    }

    public static void opciones(Pokemon pokemon, Pokemon contrario) {
        int opcion = 0;
        do {
            System.out.println("Opciones:");
            System.out.println("1. Ataques");
            System.out.println("2. Mochila");
            String preOpcion = inputScanner.next();
            for (int i = 0; i < preOpcion.length(); i++) {
                if (i >= 1) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else if (!Character.isDigit(preOpcion.charAt(i))) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else {
                    repetir = 0;
                    opcion = Integer.parseInt(preOpcion);
                }
            }
            switch (opcion) {
                case 1:
                    if (pokemon instanceof Torterra) {
                        menuTorterra((Torterra)pokemon, contrario);
                    } else {
                        menuCharizard((Charizard)pokemon, contrario);
                    }
                    repetir = 0;
                    break;
                case 2:
                    menuConsumibles(pokemon);
                    repetir = 0;
                    break;
                default:
                    repetir = 1;
                    System.out.println(errorOpcion);
            }
        } while (repetir == 1);
    }

    public static void menuTorterra(Torterra pokemon, Pokemon contrario) {
        do {
            System.out.println(separador);
            System.out.println("Ataques de Torterra:");
            System.out.println("1. Hoja Afilada\nDaño base: 50 pts.");
            System.out.println("Energia: " + pokemon.getEnergiaAtaque(1));
            System.out.println("2. Mordisco\nDaño base: 24 pts.");
            System.out.println("Energia: " + pokemon.getEnergiaAtaque(2));
            System.out.println("3. Planta Feroz\nDaño base: 50 pts.");
            System.out.println("Energia: " + pokemon.getEnergiaAtaque(3));
            System.out.println("4. Roca Afilada\nDaño base: 90 pts.");
            System.out.println("Energia: " + pokemon.getEnergiaAtaque(4));
            String preOpcion = inputScanner.next();
            int opcion = 0;
            for (int i = 0; i < preOpcion.length(); i++) {
                if (i >= 1) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else if (!Character.isDigit(preOpcion.charAt(i))) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else {
                    repetir = 0;
                    opcion = Integer.parseInt(preOpcion);
                }
            }
            System.out.println(separador);
            switch (opcion) {
                case 1:
                    pokemon.hojaAfilada(contrario);
                    break;
                case 2:
                    pokemon.mordisco(contrario);
                    break;
                case 3:
                    pokemon.plantaFeroz(contrario);
                    break;
                case 4:
                    pokemon.rocaAfilada(contrario);
                    break;
                default:
                    repetir = 1;
                    System.out.println(errorOpcion);
            }
            System.out.println(separador);
        } while (repetir == 1);
    }

    public static void menuCharizard(Charizard pokemon, Pokemon contrario) {
                do {
            System.out.println("Ataques de Charizard:");
            System.out.println("1. Colmillo Igneo\nDaño base: 24 pts.");
            System.out.println("Energia: " + pokemon.getEnergiaAtaque(1));
            System.out.println("2. Giro Fuego\nDaño base: 28 pts.");
            System.out.println("Energia: " + pokemon.getEnergiaAtaque(2));
            System.out.println("3. Calcinacion\nDaño base: 54 pts.");
            System.out.println("Energia: " + pokemon.getEnergiaAtaque(3));
            System.out.println("4. Patada Ignea\nDaño base: 45 pts.");
            System.out.println("Energia: " + pokemon.getEnergiaAtaque(4));
            String preOpcion = inputScanner.next();
            int opcion = 0;
            for (int i = 0; i < preOpcion.length(); i++) {
                if (i >= 1) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else if (!Character.isDigit(preOpcion.charAt(i))) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else {
                    repetir = 0;
                    opcion = Integer.parseInt(preOpcion);
                }
            }
            System.out.println(separador);
            switch (opcion) {
                case 1:
                    pokemon.colmilloIgneo(contrario);
                    break;
                case 2:
                    pokemon.giroFuego(contrario);
                    break;
                case 3:
                    pokemon.calcinacion(contrario);
                    break;
                case 4:
                    pokemon.patadaIgnea(contrario);
                    break;
                default:
                    repetir = 1;
                    System.out.println(errorOpcion);
            }
            System.out.println(separador);
        } while (repetir == 1);
    }

    public static void menuConsumibles(Pokemon pokemon){
        do{
        System.out.println(separador);
        System.out.println("Consumibles disponibles:");
        System.out.println("1. Oran berry");
        System.out.println("Restaura 200pts de salud del pokemon");
        System.out.println("Disponibles: "+ pokemon.backpack.getOranBerry());
        System.out.println("2. Elixir");
        System.out.println("Restaura toda la energia de los movimientos del pokemon");
        System.out.println("Disponibles: "+ pokemon.backpack.getElixir());
        String preOpcion = inputScanner.next();
        System.out.println(separador);
            int opcion = 0;
            for (int i = 0; i < preOpcion.length(); i++) {
                if (i >= 1) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else if (!Character.isDigit(preOpcion.charAt(i))) {
                    repetir = 1;
                    System.out.println(errorOpcion);
                    break;
                } else {
                    repetir = 0;
                    opcion = Integer.parseInt(preOpcion);
                }
            }
            switch (opcion) {
                case 1:
                    System.out.println(pokemon.consumir(1));
                    break;
                case 2:
                    System.out.println(pokemon.consumir(2));
                    break;
                default:
                    repetir = 1;
                    System.out.println(errorOpcion);
            }
        } while (repetir == 1);
    }
}
