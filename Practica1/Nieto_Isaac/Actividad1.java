import java.util.Scanner;

public class Actividad1{
    public static double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
    public static int checkEntrada(String entrada){
        if (entrada.split(",").length!=1){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Declaracion de variables
        String index="";
        int checker=0;
        //Pedir variables al usuario
        System.out.println("Capture los datos de los cinco puntos que desea evaluar.");
        System.out.println("Formato: x,y");
        String provisional = input.nextLine();
        String[] splitter = provisional.split(",");
        x1 = Integer.parseInt(splitter[0]);
        y1 = Integer.parseInt(splitter[1]);
        provisional = input.nextLine();
        splitter = provisional.split(",");
        x2 = Integer.parseInt(splitter[0]);
        y2 = Integer.parseInt(splitter[1]);
        provisional = input.nextLine();
        splitter = provisional.split(",");
        x3 = Integer.parseInt(splitter[0]);
        y3 = Integer.parseInt(splitter[1]);
        provisional = input.nextLine();
        splitter = provisional.split(",");
        x4 = Integer.parseInt(splitter[0]);
        y4 = Integer.parseInt(splitter[1]);
        provisional = input.nextLine();
        splitter = provisional.split(",");
        x5 = Integer.parseInt(splitter[0]);
        y5 = Integer.parseInt(splitter[1]);
        //Calculos de distancias
        double p1p2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double p1p3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double p1p4 = Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));
        double p1p5 = Math.sqrt(Math.pow(x5 - x1, 2) + Math.pow(y5 - y1, 2));
        double p2p3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double p2p4 = Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2));
        double p2p5 = Math.sqrt(Math.pow(x5 - x2, 2) + Math.pow(y5 - y2, 2));
        double p3p4 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double p3p5 = Math.sqrt(Math.pow(x5 - x3, 2) + Math.pow(y5 - y3, 2));
        double p4p5 = Math.sqrt(Math.pow(x5 - x4, 2) + Math.pow(y5 - y4, 2));
        //Evaluacion de distancias
        double menorDist=0;
        if (p1p2 <= p1p3 && p1p2 <= p1p4 && p1p2 <= p1p5 && p1p2 <= p2p3 && p1p2 <= p2p4 && p1p2 <= p2p5 && p1p2 <= p3p4
            && p1p2 <= p3p5 && p1p2 <= p4p5){
            menorDist = p1p2;
            index = index+"P1 - P2 ";
        }
        if (p1p3 <= p1p2 && p1p3 <= p1p4 && p1p3 <= p1p5 && p1p3 <= p2p3 && p1p3 <= p2p4 && p1p3 <= p2p5 && p1p3 <= p3p4
                && p1p3 <= p3p5 && p1p3 <= p4p5) {
            menorDist = p1p3;
            index = index+"P1 - P3 ";
        }
        if (p1p4 <= p1p2 && p1p4 <= p1p3 && p1p4 <= p1p5 && p1p4 <= p2p3 && p1p4 <= p2p4 && p1p4 <= p2p5 && p1p4 <= p3p4
                && p1p4 <= p3p5 && p1p4 <= p4p5) {
            menorDist = p1p4;
            index = index+"P1 - P4 ";
        }
        if (p1p5 <= p1p2 && p1p5 <= p1p3 && p1p5 <= p1p4 && p1p5 <= p2p3 && p1p5 <= p2p4 && p1p5 <= p2p5 && p1p5 <= p3p4
                && p1p5 <= p3p5 && p1p5 <= p4p5) {
            menorDist = p1p5;
            index = index+"P1 - P5 ";
        }
        if (p2p3 <= p1p2 && p2p3 <= p1p3 && p2p3 <= p1p4 && p2p3 <= p1p5 && p2p3 <= p2p4 && p2p3 <= p2p5 && p2p3 <= p3p4
                && p2p3 <= p3p5 && p2p3 <= p4p5) {
            menorDist = p2p3;
            index = index+"P2 - P3 ";
        }
        if (p2p4 <= p1p2 && p2p4 <= p1p3 && p2p4 <= p1p4 && p2p4 <= p1p5 && p2p4 <= p2p3 && p2p4 <= p2p4 && p2p4 <= p2p5
                && p2p4 <= p3p5 && p2p4 <= p4p5) {
            menorDist = p2p4;
            index = index+"P2 - P4 ";
        }
        if (p2p5 <= p1p2 && p2p5 <= p1p3 && p2p5 <= p1p4 && p2p5 <= p1p5 && p2p5 <= p2p3 && p2p5 <= p2p4 && p2p5 <= p3p4
                && p2p5 <= p3p5 && p2p5 <= p4p5) {
            menorDist = p2p5;
            index = index+"P2 - P5 ";
        }
        if (p3p4 <= p1p2 && p3p4 <= p1p3 && p3p4 <= p1p4 && p3p4 <= p1p5 && p3p4 <= p2p3 && p3p4 <= p2p4 && p3p4 <= p2p5
                && p3p4 <= p3p5 && p3p4 <= p4p5) {
            menorDist = p3p4;
            index = index+ "P3 - P4 ";
        }
        if (p3p5 <= p1p2 && p3p5 <= p1p3 && p3p5 <= p1p4 && p3p5 <= p1p5 && p3p5 <= p2p3 && p3p5 <= p2p4 && p3p5 <= p2p5
                && p3p5 <= p3p4 && p3p5 <= p4p5) {
            menorDist = p3p5;
            index = index+ "P3 - P5 ";
        }
        if (p4p5 <= p1p2 && p4p5 <= p1p3 && p4p5 <= p1p4 && p4p5 <= p1p5 && p4p5 <= p2p3 && p4p5 <= p2p4 && p4p5 <= p2p5
                && p4p5 <= p3p4 && p4p5 <= p3p5) {
            menorDist = p4p5;
            index = index+ "P4 - P5 ";
        }
        // Retorno de resultados
        System.out.println("Los puntos con la menor distancia entre si son: "+index +"Con una distancia de:"+ menorDist);
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
