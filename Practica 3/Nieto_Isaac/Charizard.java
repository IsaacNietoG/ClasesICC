public class Charizard {
    protected String tipo = "Fuego";
    public Charizard(String nombre, int speed){
        super(nombre, tipo, speed);
    }

    @Override
    public double calcularDMG(int tipoTarget) {
        switch (tipoTarget) {
            case 0 -> {
                return 1.0;
            }
            case 12 -> {
                return 2.0;
            }
            case 10 -> {
                return 0.5;
            }
            default -> {
                return 1.0;
            }
        }
    }

}
