import java.util.Scanner;

public class Clase22{
    public static void main(String[] args){
        double promedio;
        String porcentaje="";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte el promedio a calcular");
        promedio = entrada.nextDouble();
        if(promedio <= 10 && promedio >= 9) porcentaje = "50%"; else
        if(promedio < 9 && promedio >=8) porcentaje = "30%"; else
        if(promedio < 8 && promedio >=7) porcentaje = "10%"; else
        porcentaje = "0%";
        if(porcentaje != "0%"){
            System.out.println("Tu beca es del "+porcentaje);
        }
        else{
            System.out.println("No tienes derecho a beca");
        }
    }
}
