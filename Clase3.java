import java.util.Scanner;
/*public class Ejeplos {
    public static void main(String[] args){
	Scanner entrada = new Scanner(System.in);
	System.out.println("Como te llamas?");
	String nombre = entrada.nextLine();
	System.out.println(nombre);
    }
    }*/
public class Ejeplos {
    /* public static void main(String[] args){
	Scanner entrada = new Scanner(System.in);
	double lado = entrada.nextDouble();
	double volumen = lado*lado*lado;
	System.out.println(volumen);
	}*/
    public static void main(String[] args){
	Scanner entrada = new Scanner(System.in);
	System.out.println("Programa que calcula el radio de una esfera");
	double radio = entrada.nextDouble();
	double volumen = (4.0/3.0)*Math.PI*Math.pow(radio,3);
	System.out.println(volumen);
	}
}
