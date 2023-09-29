public class Torterra extends Pokemon{

    public Torterra(String nombre, String tipo, int speed){
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
    public void HojaAfilada(Pokemon pokemon){
        String nombreAtaque = "Hoja Afilada";
        int idInternoAtaque = 1;
        double DMG = 52;
        boolean confusion = false;
        int noConfundido = 0;
        int energiaSuficiente = 0;

        //Evalua si hay energia para el ataque y la descuenta tambien.
        if(getEnergiaAtaque(idInternoAtaque)==0){
            energiaSuficiente= 0;
        }else{
            setEnergiaAtaque(idInternoAtaque, getEnergiaAtaque(idInternoAtaque)-1);
            energiaSuficiente = 1;
        }

        //Si el pokemon esta confundido, evalua si puede atacar
        if(getConfused()){
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

    public void mordisco(Pokemon pokemon){
        String nombreAtaque = "Mordisco";
        int idInternoAtaque = 2;
        double DMG = 24;
        boolean confusion = false;
        int noConfundido = 0;
        int energiaSuficiente = 0;

        //Evalua si hay energia para el ataque y la descuenta tambien.
        if(getEnergiaAtaque(idInternoAtaque)==0){
            energiaSuficiente= 0;
        }else{
            setEnergiaAtaque(idInternoAtaque, getEnergiaAtaque(idInternoAtaque)-1);
            energiaSuficiente = 1;
        }

        //Si el pokemon esta confundido, evalua si puede atacar
        if(getConfused()){
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

    public void plantaFeroz(Pokemon pokemon){
        String nombreAtaque = "Planta Feroz";
        int idInternoAtaque = 3;
        double DMG = 100;
        boolean confusion = false;
        int noConfundido = 0;
        int energiaSuficiente = 0;

        //Evalua si hay energia para el ataque y la descuenta tambien.
        if(getEnergiaAtaque(idInternoAtaque)==0){
            energiaSuficiente= 0;
        }else{
            setEnergiaAtaque(idInternoAtaque, getEnergiaAtaque(idInternoAtaque)-1);
            energiaSuficiente = 1;
        }

        //Si el pokemon esta confundido, evalua si puede atacar
        if(getConfused()){
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
    public void rocaAfilada(Pokemon pokemon){
        String nombreAtaque = "Roca Afilada";
        int idInternoAtaque = 4;
        double DMG = 100;
        boolean confusion = false;
        int noConfundido = 0;
        int energiaSuficiente = 0;

        //Evalua si hay energia para el ataque y la descuenta tambien.
        if(getEnergiaAtaque(idInternoAtaque)==0){
            energiaSuficiente= 0;
        }else{
            setEnergiaAtaque(idInternoAtaque, getEnergiaAtaque(idInternoAtaque)-1);
            energiaSuficiente = 1;
        }

        //Si el pokemon esta confundido, evalua si puede atacar
        if(getConfused()){
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

}
