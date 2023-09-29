public class Cilindro extends Circulo{

    protected double altura;

    public Cilindro(){
        SetAltura(0.0);
    }
    public Cilindro(double altura, double r, int a, int b){
        super(r, a, b);
        SetAltura(altura);
    }

    public double GetAltura(){
        return altura;
    }
    public void SetAltura(double altura){
        this.altura = (altura > 0.0 ? altura : 0.0);
    }

    public String toString(){
        return "Altura = "+altura +"Centro = " + "[" + x + ", " + y + "]" +
                "; Radio = " + radio;
    }
}
