/* ACLARACION:
   Las formulas del cilindro indicadas en el archivo de indicaciones de la practica eran incorrectas.
   Agrego entonces un metodo con formulas revisadas (programaCilindroRevisado) y coloco las formulas del ejercicio en el metodo
   programaCilindro. Para utilizar cualquiera de estos dos metodos, solo basta con cambiar la referencia a metodo en: Linea 89
   El metodo revisado viene por default.
 */
import java.util.Scanner;
public class Actividad3 {
    public static double programaCubo(int op, double a){
        double result=0;
        switch (op){
        case 1:
            result = 4*a*a;
            break;
        case 2:
            result = 6*a*a;
            break;
        case 3:
            result = a*a*a;
            break;
        }
        return result;
    }

    public static double programaCilindro(int op, double h, double r){
        double result =0;
        switch(op){
        case 1:
            result = 2*Math.PI*r*h;
            break;
        case 2:
            result = 2*Math.PI*(r+h);
            break;
        case 3:
            result = Math.PI*r*r;
            break;
        }
        return result;
    }

    public static double programaCilindroRevisado(int op, double h, double r) {
        double result = 0;
        switch (op) {
            case 1:
                result = 2 * Math.PI * r * h;
                break;
            case 2:
                result = (2 * Math.PI * r * h) + (2 * Math.PI * r * r);
                break;
            case 3:
                result = Math.PI * r * r * h;
                break;
        }
        return result;
    }

    public static double programaCono(int op, double h, double r, double g){
        double result=0;
        switch(op){
        case 1:
            result = Math.PI*r*g;
            break;
        case 2:
            result = Math.PI*r*(g+r);
            break;
        case 3:
            result = (Math.PI*r*r*h)/3;
            break;
        }
        return result;
    }
    public static void main(String[] args){
        //Declaracion de variables
        Scanner input = new Scanner(System.in);
        int figura=0,operacion=0;
        double x=0,y=0,z=0, resultado= 0;
        //Captura de eleccion
        do{
            System.out.println("Bienvenido al programa para calcular figuras.");
            System.out.println("Inserte la figura que desea operar hoy.");
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Cono");
            figura = input.nextInt();
        }
        while(figura >3 || figura <0);
        do {
            System.out.println("Inserte la operacion que desea calcular de la figura.");
            System.out.println("1. Area lateral");
            System.out.println("2. Area total");
            System.out.println("3. Volumen");
            operacion = input.nextInt();
        } while (operacion >3 || operacion <0);
        System.out.println("Capture los datos requeridos para realizar su operación.");
        System.out.println("Si es cubo, inserte el tamaño de la arista.");
        System.out.println("Si es cilindro, inserte la altura del cilindro, presione enter e inserte el radio de su base.");
        System.out.println("Si es cono, inserte la altura del mismo, un enter, radio del mismo, otro enter y, finalmente, su altura de inclinacion.");
        System.out.println(
                "Si alguno de los datos solicitados no es necesario para su operacion, puede sustituirlo con un 0");
        System.out.println("Datos requeridos para cada operacion:");
        System.out.println("Area lateral: unico dato en el cubo, todos los datos en el cilindro, segundo y tercer dato solicitado en el cono.");
        System.out.println("Area total: unico dato en el cubo, todos los datos en el cilindro, segundo y tercer dato solicitado en el cono.");
        System.out.println(
                "Volumen: unico dato en el cubo, todos los datos en el cilindro, primer y segundo dato solicitado en el cono.");
        // Captura de datos y envio  a metodos
        switch (figura){
        case 1:
            x = input.nextDouble();
            resultado = programaCubo(operacion, x);
            break;
        case 2:
            x = input.nextDouble();
            y = input.nextDouble();
            resultado = programaCilindroRevisado(operacion, x, y);
            break;
        case 3:
            x = input.nextDouble();
            y = input.nextDouble();
            z = input.nextDouble();
            resultado = programaCono(operacion, x, y, z);
            break;
        }
        //Impresion de resultado
        System.out.println("Su resultado es: "+resultado);
        // Repeticion
        /*
         * Creo que no hemos visto este metodo de repetir el programa, pero inferi que
         * se podia referenciar a un metodo desde dentro del mismo siempre que no
         * hagamos un
         * bucle. Observé que main() en Java pide como argumentos de entrada un array de
         * strings así que es lo que le estoy entregando
         */
        System.out.println("Desea repetir el programa?(Y/N)");
        char choice = input.next().toLowerCase().charAt(0);
        if (choice == 'y') {
            main(new String[] {});
        }
    }
}
