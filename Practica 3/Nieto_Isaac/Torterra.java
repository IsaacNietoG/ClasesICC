public class Torterra extends Pokemon{
    protected String tipo = "Hoja";
    public Torterra(String nombre, int speed){
        super(nombre, tipo, speed);
    }

    @Override
    public double calcularDMG(int tipoTarget){
        switch(tipoTarget){
        case 0 -> {return 1.0;}
        case 12 -> {return 0.5;}
        case 10 -> {return 0.5;}
        default -> {return 1.0;}
        }
    }
    //Ataques
    public void hojaAfilada(Pokemon pokemon){
        String nombreAtaque = "Hoja Afilada";
        int idInternoAtaque = 1;
        double DMG = 52;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }

    public void mordisco(Pokemon pokemon){
        String nombreAtaque = "Mordisco";
        int idInternoAtaque = 2;
        double DMG = 24;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }

    public void plantaFeroz(Pokemon pokemon){
        String nombreAtaque = "Planta Feroz";
        int idInternoAtaque = 3;
        double DMG = 100;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }
    public void rocaAfilada(Pokemon pokemon){
        String nombreAtaque = "Roca Afilada";
        int idInternoAtaque = 4;
        double DMG = 100;
        atacar(nombreAtaque, idInternoAtaque, DMG, pokemon);
    }

}
