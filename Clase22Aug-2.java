import java.util.Random;
import java.util.Scanner;

public class Ruleta{
    public static void main(String[] args){
        Random aleatorios = new Random();
        Scanner entrada = new Scanner(System.in);

        int numero = aleatorios.nextInt(34) + 1;
        String color = "";
        System.out.println("Que crees que saldrá?");
        System.out.println("1-34, 33 es verde, 34 es 00 verde");
        int eleccion = entrada.nextInt();
        if (numero==33){
            System.out.println("La ruleta saco 0 verde");
        }
        else if(numero==34){
            System.out.println("La ruleta sacó 00 verde");
        }
        else {
            if(numero%2==1){
                color = "Negro";
                System.out.println("La ruleta sacó " + numero + " " + color);
            }
            else{
                color = "Rojo";
                System.out.println("La ruleta sacó " + numero + " " + color);
            }
        }System.out.println("La ruleta sacó " + numero + " " + color);
    }
}
