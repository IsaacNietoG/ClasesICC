import java.util.Scanner;
public class Actividad2 {
    public static void main(String[] args){
        //Declaracion de variables
        String stringMain=" ";
        String stringSearch = " ";
        //Solicitud de strings
        // Aqui no coloco ninguna restriccion porque las Strings pueden tener cualquier caracter.
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al buscador de cadenas");
        System.out.println("Inserte la cadena principal, es decir,");
        System.out.println("en la que quiere buscar la mayor subcadena.");
        System.out.print("Cadena principal...");
        stringMain = input.next();
        System.out.println("\nAhora inserta la cadena de donde quieres obtener las subcadenas...");
        stringSearch = input.next();
        //Calculo
        String resultado="";
        for (int i = 0; i< stringMain.length();i++){
            for(int j = i+1;j<=stringMain.length(); j++){
                String matchActual = stringMain.substring(i, j);
                if (stringSearch.contains(matchActual)&& matchActual.length()>resultado.length()){
                    resultado = matchActual;
                }
            }
        }
        if (resultado.length()==0){
            System.out.println("Ninguna coincidencia fue encontrada.");
        }
        else{
            System.out.println("La coincidencia mas larga encontrada fue: " + resultado);
        }
    }
    
}
