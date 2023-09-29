import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {
        //Declaracion de variables
        int a = 0, b = 0, c = 0;
        String x2, x1;
        boolean flagComplejos = false;
        Scanner input = new Scanner(System.in);
        //Recoleccion de datos
        System.out.println("Bienvenido al programa para calcular la formula general.");
        System.out.println("Inserte los datos a,b y c de su ecuación, todos separados por un Enter.");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        //Evaluacion de implicacion de numeros complejos.
        if ((b * b - (4 * a * c)) < 0) {
            flagComplejos = true;
        }
        //Calculo
        if (flagComplejos) {
            x1 = -b +"+"+ Math.sqrt(-(b * b - 4 * a * c)) + "i" + " / " + 2 * a;
            x2 = -b + "-"+ Math.sqrt(-(b * b - 4 * a * c)) + "i" + " / " + 2 * a;
        } else {
            x1 = Double.toString((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
            x2 = Double.toString((-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);
        }
        //Retorno de resultados
        System.out.println("Tus resultados son:");
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
        // Repeticion
        /*
         * Creo que no hemos visto este metodo de repetir el programa, pero inferi que
         * se podia referenciar a un metodo desde dentro del mismo siempre que no
         * hagamos un
         * bucle. Observé que main() en Java pide como argumentos de entrada un array de
         * strings así que es lo que le estoy entregando
         */
        System.out.println("Desea repetir el programa?(Y/N)");
        char choice = input.next().charAt(0);
        if (choice == 'Y') {
            main(new String[] {});

        }
    }
}
