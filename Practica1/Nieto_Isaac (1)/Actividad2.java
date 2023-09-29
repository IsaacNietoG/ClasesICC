import java.util.Scanner;
public class Actividad2 {
    public static String gradosARadianes(int estilo, String entrada){
        String resultado;
        double resultadoDouble;
        resultadoDouble = Double.parseDouble(entrada)*Math.PI/180;
        if (estilo==2){
            resultado = resultadoDouble/Math.PI + "π radianes";
        }
        else{
            resultado = resultadoDouble + "radianes";
        }
        return resultado;
    }
    public static String radianesAGrados(int estilo, String entrada){
        String resultado;
        double resultadoDouble;
        if (estilo==2){
            String[] splitter = entrada.split("/");
            resultadoDouble = Double.parseDouble(splitter[0]) / Double.parseDouble(splitter[1]) * 180;
        }
        else{
            resultadoDouble = Double.parseDouble(entrada) * 180 / Math.PI;
        }
        resultado = resultadoDouble + "grados";
        return resultado;
    }
    public static void main(String[] args){
        //Declaracion de variables
        Scanner input = new Scanner(System.in);
        int eleccionUso=0;
        int eleccionVisual=0;
        String entradaString, salidaString="";

        //Solicitud de eleccion al usuario
        do{
            System.out.println("Bienvenido al conversor de radianes<=>grados.");
            System.out.print("Escoja la operacion que va a hacer hoy.\n 1. Grados a radianes\n 2. Radianes a grados\n");
            eleccionUso = input.nextInt();
            System.out.print("Escoja la notacion con la que desea introducir y recibir sus datos en radianes\n 1. Formato decimal. (n.n)\n 2. Formato fraccionario. (a/b π radianes)\n ");
            eleccionVisual = input.nextInt();
        }
        while ((eleccionUso>2 && eleccionUso<1)&&(eleccionVisual>2 && eleccionVisual<1));
        //Request datos
        System.out.print("Inserte el dato a convertir.");
        entradaString = input.next();
        //Llamada a respectivo metodo
        switch(eleccionUso){
        case 1:
            salidaString = gradosARadianes(eleccionVisual, entradaString);
            break;
        case 2:
            salidaString = radianesAGrados(eleccionVisual, entradaString);
            break;
        }
        //Impresion de resultado
        System.out.println("Tu resultado es: "+salidaString);
    }}
