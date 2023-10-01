public class Charizard extends Pokemon{
    protected static String nombre = "Charizard";
    protected static String tipo = "Fuego";
    public Charizard(int speed){
        super(nombre, tipo, speed);
    }

    @Override
    public double calcularDMG(int tipoTarget){
        switch(tipoTarget){
        case 0 -> {return 1.0;}
        case 12 -> {return 1.5;}
        case 10 -> {return 0.75;}
        default -> {return 1.0;}
        }
    }
    //Ataques
    public void colmilloIgneo(Pokemon pokemon){
        String nombreAtaque = "Colmillo Igneo";
        int idInternoAtaque = 1;
        double DMG = 24;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }

    public void giroFuego(Pokemon pokemon){
        String nombreAtaque = "Giro Fuego";
        int idInternoAtaque = 2;
        double DMG = 28;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }

    public void calcinacion(Pokemon pokemon){
        String nombreAtaque = "Calcinacion";
        int idInternoAtaque = 3;
        double DMG = 54;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }
    public void patadaIgnea(Pokemon pokemon){
        String nombreAtaque = "Patada Ignea";
        int idInternoAtaque = 4;
        double DMG = 45;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }

}
