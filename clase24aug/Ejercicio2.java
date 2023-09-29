import static java.lang.System.*;
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        int eleccion = 0;
        double area=0;
        Scanner entrada = new Scanner(System.in);
        do{
            out.println("Que area de figura deseas calcular?");
            out.println("1. Circulo");
            out.println("2. Cuadrado");
            out.println("3. Triangulo");
            eleccion = entrada.nextInt();
        }
        while((eleccion <1)||(eleccion >3));
        double lado = 0;
        switch(eleccion){
        case 1:
            double radio=0;
            out.println("Cual es el valor del radio?");
            radio = entrada.nextDouble();
            area = Math.PI*radio*radio;
            out.println("El area de tu figura es"+area);
            break;
        case 2:
            out.println("Cual es el valor del lado?");
            lado = entrada.nextDouble();
            area = lado*lado;
            out.println("El area de tu figura es:"+area);
            break;
        case 3:
            out.println("Cual es el valor del lado?");
            lado = entrada.nextDouble();
            area = (lado*lado)/2;
            out.println("El area de tu figura es:"+area);
            break;
        }
    }
}
