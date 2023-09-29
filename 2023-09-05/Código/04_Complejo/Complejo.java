/**
 * Complejo.java
 * Clase que ilustra la construcci�n de objetos de tipo Complejo
 * (en forma bon�mica). Se muestra c�mo utilizar objetos Complejo dentro de la
 * misma clase que se est� construyendo.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Septiembre 2023.
 */
public class Complejo {

   // Atributos de clase.
   // Se debe asegurar encapsulación, por eso se usa private.
   private double a;
   private double b;

   /**
    * Constructor por omisi�n, se crea el Complejo: 1 + 3i
    */
   public Complejo() {
      a = 1;
      b = 3;
   }

   /**
    * Constructor por par�metros. Permite construir cualquier n�mero Complejo en
    * forma bin�mica.
    * 
    * @param a La parte real del n�mero Complejo
    * @param b La parte imaginaria del n�mero Complejo
    */
   public Complejo(double a, double b) {
      this.a = a;
      this.b = b;
   }

   /**
    * M�todo que permite conocer el valor de la parte real del n�mero Complejo
    * 
    * @return duble La parte real del n�mero Complejo
    */
   public double getA() {
      return a;
   }

   /**
    * M�todo que permite conocer el valor de la parte imaginaria del n�mero
    * Complejo
    * 
    * @return duble La parte imaginaria del n�mero Complejo
    */
   public double getB() {
      return b;
   }

   /**
    * M�todo que permite modificar la parte real del n�mero Complejo
    * 
    * @param double El nuevo valor de la parte real del n�mero Complejo
    */
   public void setA(double a) {
      this.a = a;
   }

   /**
    * M�todo que permite modificar la parte imaginaria del n�mero Complejo
    * 
    * @param double El nuevo valor de la parte imaginaria del n�mero Complejo
    */
   public void setB(double b) {
      this.b = b;
   }

   /**
    * M�todo que permite efectuar la suma de Complejos en forma bin�mica
    * 
    * @param El segundo n�mero Complejo para efectuar la operaci�n
    * @return El resultado de la suma, en forma bin�mica.
    */
   public Complejo sumar(Complejo c) {
      double r, i;
      r = this.a + c.a;
      i = this.b + c.b;
      return new Complejo(r, i);
   }

   /**
    * M�todo que permite efectuar la resta de Complejos en forma bin�mica
    * 
    * @param El segundo n�mero Complejo para efectuar la operaci�n
    * @return El resultado de la resta, en forma bin�mica.
    */
   public Complejo restar(Complejo c) {
      double r, i;
      r = this.a - c.a;
      i = this.b - c.b;
      return new Complejo(r, i);
   }

   /**
    * M�todo que permite efectuar la multiplicaci�n de Complejos en forma bin�mica
    * 
    * @param El segundo n�mero Complejo para efectuar la operaci�n
    * @return El resultado de la multiplicaci�n, en forma bin�mica.
    */
   public Complejo multiplicar(Complejo c) {
      double r, i;
      r = a * c.a - b * c.b;
      i = a * c.b + b * c.a;
      return new Complejo(r, i);
   }

   /**
    * M�todo que permite efectuar la divisi�n de Complejos en forma bin�mica
    * 
    * @param El segundo n�mero Complejo para efectuar la operaci�n
    * @return El resultado de la divisi�n, en forma bin�mica.
    */
   public Complejo dividir(Complejo c) {
      double r, i;
      r = (a * c.a + b * c.b) / (Math.pow(c.a, 2) + Math.pow(c.b, 2));
      i = (b * c.a - a * c.b) / (Math.pow(c.a, 2) + Math.pow(c.b, 2));
      return new Complejo(r, i);
   }

   /**
    * M�todo que permite obtener el conjugado de un n�mero Complejo en forma
    * bin�mica
    * 
    * @return El Complejo conjugado, en forma bin�mica.
    */
   public Complejo conjugado() {
      return new Complejo(a, -b);
   }

   /**
    * M�todo que permite determinar a partir del criterio de igualdad de Complejos
    * en forma bin�mica, si los dos n�meros son iguales
    * 
    * @param El segundo n�mero Complejo para efectuar la comparaci�n
    * @return boolean true si son iguales, false en caso contrario
    */
   public boolean equals(Complejo c) {
      return a == c.a && b == c.b;
   }

   /**
    * M�todo que permite obtener un n�mero Complejo en su forma bin�mica
    * 
    * @return El n�mero Complejo con el formato a + bi
    */
   public String toString() {
      String cadena = "";
      if (b > 0)
         cadena += a + " + " + b + "i";
      if (b < 0)
         cadena += a + "" + b + "i";
      return cadena;
   }

} // Fin Complejo
