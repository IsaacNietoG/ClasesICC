public class Herencia{
	public static void main(String[] args) {
		Punto refPunto, p;
		Circulo refCirculo, c;
    Cilindro refCilindro, cil;

		p = new Punto(30, 50);
		c = new Circulo(2.7, 120, 89);
    cil = new Cilindro(3.5, 4.5, 0,0);
		
    refCirculo = (Circulo) cil;
    System.out.println(refCirculo);

    refCirculo = (Cilindro)refCirculo;
    System.out.println(refCirculo);

  }
}
