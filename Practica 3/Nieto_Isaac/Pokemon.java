import java.util.Random;
/* Plantilla de Pokemon
   De aqui formamos al resto de clases utilizadas para formar Pokemons de distintas "razas"
   Todos estos metodos son los necesarios para la batalla y los requerimentos.
   Para crear una nueva "raza de pokemon":
   - Overrideamos calcularDMG con su respectiva tabla de daños del pokemon dependiendo de su naturaleza, utilizo la ultima tabla disponible pero esta la tuve que nerfear un poco para que una pelea sea mas divertida.
   - Creamos los metodos especificos de sus ataques, puedes utilizar el molde de ataqueGenerico.
   -El constructor recibe una static string del tipo del pokemon y otra de su nombre, la velocidad la aleatorizo en la pelea para que cada partida sea distinta.
 */
public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected double eVital;
    protected int turnosConfundido = 0;
    protected boolean confused;
    protected Mochila backpack = new Mochila();
    protected int speed;
    protected int energiaAtaque0;
    protected int energiaAtaque1;
    protected int energiaAtaque2;
    protected int energiaAtaque3;
    protected int energiaAtaque4;
    protected static Random random = new Random();

    public Pokemon(String nombre, String tipo, int speed){
        this.nombre = nombre;
        this.tipo = tipo;
        this.eVital = 500;
        this.confused = false;
        this.speed = speed;
        this.energiaAtaque0 = 7;
        this.energiaAtaque1 = 7;
        this.energiaAtaque2 = 7;
        this.energiaAtaque3 = 7;
        this.energiaAtaque4 = 7;
    }

    //Metodos get
    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
    public double getEvital(){
        if(this.eVital>500){
            eVital = 500;
        }
        return this.eVital;
    }
    public boolean getConfused(){
        if(turnosConfundido >0){
            turnosConfundido -= 1;
        }else{
            this.confused = false;
        }
        return this.confused;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getTipoInt(){
        switch (getTipo()){
        case "Normal" -> {return 0;}
        case "Hoja" -> {return 12;}
        case "Fuego" -> {return 10;}
        default -> {return 0;}
        }
    }
    public int getEnergiaAtaque(int ataque){
        switch(ataque){
            case 0 -> {return this.energiaAtaque0;}
            case 1 -> {return this.energiaAtaque1;}
            case 2 -> {return this.energiaAtaque2;}
            case 3 -> {return this.energiaAtaque3;}
            case 4 -> {return this.energiaAtaque4;}
            default -> {return 0;}
        }
    }

    //Metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEvital(double eVital) {
        this.eVital = eVital;
    }

    public void setConfused(boolean confused) {
        this.turnosConfundido = 2;
        this.confused = confused;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setEnergiaAtaque(int ataque, int energia){
        switch(ataque){
        case 0:
            this.energiaAtaque0 = energia;
            break;
        case 1:
            this.energiaAtaque1 = energia;
            break;
        case 2:
            this.energiaAtaque2 = energia;
            break;
        case 3:
            this.energiaAtaque3 = energia;
            break;
        case 4:
            this.energiaAtaque4 = energia;
            break;
        default:
            break;
        }
    }
    //Metodos genericos
    public String consumir(int item){
        /* 1. Oran Berry
           2. Elixir
         */
        switch (item){
        case 1:
            if(backpack.getOranBerry()>0){
                backpack.setOranBerry(backpack.getOranBerry()-1);
                this.eVital += 200;
                return "Tu "+nombre+" ha consumido Oran Berry y restaura su salud";
            }else{
                return "No tienes Oran Berrys!";
            }
        case 2:
            if(backpack.getElixir()>0){
                backpack.setElixir(backpack.getElixir()-1);
                for (int i = 1; i <= 4;i++){
                    setEnergiaAtaque(i, 7);
                }
                return "Tu "+nombre+" ha consumido Elixir y restaura todos sus ataques";
            }
            else{
                return "No tienes Elixir!";
            }
        default:
            return "Item invalido";
        }
    }

    //Metodos ofensivos
    public static boolean rollConfusion(int probabilidad){
        if(random.nextInt(100) <=probabilidad){
            return true;
        }else{
            return false;
        }
    }
    public double calcularDMG(int tipoTarget){
        switch(tipoTarget){
        case 0 -> {return 1.0;}
        case 12 -> {return 1.0;}
        case 10 -> {return 1.0;}
        default -> {return 1.0;}
        }
    }
    //Ataques
    public void atacar(String nombreAtaque, int idInternoAtaque, double DMG, Pokemon pokemon){
        boolean confusion = false;
        int noConfundido = 1;
        int energiaSuficiente = 1;

        //Evalua si hay energia para el ataque y la descuenta tambien.
        if(getEnergiaAtaque(idInternoAtaque)==0){
            energiaSuficiente= 0;
        }else{
            this.setEnergiaAtaque(idInternoAtaque, getEnergiaAtaque(idInternoAtaque)-1);
            energiaSuficiente = 1;
        }

        //Si el pokemon esta confundido, evalua si puede atacar
        if(this.getConfused()){
            if(rollConfusion(60)){
                noConfundido = 0;
            }else{
                noConfundido = 1;
            }
        }

        //Calculo daño
        double DMGefectuado = calcularDMG(pokemon.getTipoInt())*DMG*noConfundido*energiaSuficiente;

        //Roll de confusion
        if (DMGefectuado>=40){
            confusion = rollConfusion(80);
        }

        //Efectuado
        pokemon.setEvital(pokemon.getEvital()-DMGefectuado);
        System.out.println("El pokemon "+ this.nombre + " usa " + nombreAtaque + " en " + pokemon.getNombre());
        if(noConfundido==0){
            System.out.println(this.nombre+ " esta confundido! Su ataque falló");
        }else if(energiaSuficiente==0){
            System.out.println("Tu pokemon ya no tiene energia para este ataque! Su oportunidad pasó");
        }else{
            System.out.println("El ataque fue exitoso! Daño: "+DMGefectuado);
        }
        if (confusion) {
            pokemon.setConfused(confusion);
            System.out.println("El ataque fue muy fuerte! " + pokemon.getNombre() + " esta confundido!");
        }
    }
    //El ataque generico es la plantilla que luego usare para construir los otros ataques
    public void ataqueGenerico(Pokemon pokemon){
        String nombreAtaque = "ATAQUE GENERICO";
        int idInternoAtaque = 0;
        double DMG = 1;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }

    //Metodo toString
    @Override
    public String toString(){
        return nombre + " de tipo " + tipo + " con EV de: " + eVital + " y velocidad de: " + speed;
    }
}
