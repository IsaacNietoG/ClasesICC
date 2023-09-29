import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {

 public static void main(String[] args) {

  boolean jugar = true;
  int tiradaJugador = 0;
  int tiradaComputadora = 0;
  Random aleatorio = new Random();
  Scanner lector = new Scanner(System.in);

  while (jugar) {

   System.out.println("Elige tu tirada:");
   System.out.println("0 -> Piedra.");
   System.out.println("1 -> Papel.");
   System.out.println("2 -> Tijeras.");
   tiradaJugador = lector.nextInt();
   tiradaComputadora = aleatorio.nextInt(3);

   if (tiradaComputadora == tiradaJugador) {
    System.out.println("¡Es un empate!");
   } else {
    
    // PIEDRA
    if (tiradaComputadora == 0) {
     if (tiradaJugador == 1) {
      System.out.println("Gana el jugador");
     } else {
      System.out.println("¡Gana la computadora!");
     }
    }

    // PAPEL
    if (tiradaComputadora == 1) {
     if (tiradaJugador == 0) {
      System.out.println("¡Gana la computadora!");
     } else {
      System.out.println("Gana el jugador");
     }
    }

    // TIJERAS
    if (tiradaComputadora == 2) {
     if (tiradaJugador == 0) {
      System.out.println("Gana el jugador");
     } else {
      System.out.println("¡Gana la computadora!");
     }
    }

    jugar = false;
   }

  }

  System.out.println("Tirada de la computadora: " + tiradaComputadora);
  System.out.println("Tirada del jugador: " + tiradaJugador);

  lector.close();
 }

}
