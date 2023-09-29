import java.util.Random;
public class Mochila {
    protected int oranBerry;
    protected int elixir;
    protected int monedas;
    protected Random random = new Random();

    public Mochila(){
        this.elixir = 1;
        this.oranBerry = 1;
        this.monedas = random.nextInt(399) + 1;
    }

    //Metodos set
    public int getOranBerry(){
        return this.oranBerry;
    }
    public int getElixir(){
        return this.elixir;
    }
    public int getMonedas(){
        return this.monedas;
    }

    //Metodos get
    public void setOranBerry(int oranBerry){
        this.oranBerry = oranBerry;
    }
    public void setElixir(int elixir){
        this.elixir = elixir;
    }
    public void setMonedas(int monedas){
        this.monedas = monedas;
    }
}
