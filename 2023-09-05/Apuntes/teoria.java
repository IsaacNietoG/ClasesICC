public class teoria {
    public static void main(String[] args){
        Persona p1 = new Persona("nombre", 22);
        System.out.println(p1);
    }
    
}

public class Persona {

    //Atributos
    String nombre;
    int edad;
    //Metodo constructor
    public void persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodos get
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }

    //Metodos set
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setEdad(int n) {
        edad = n;
    }

    //Metodo comparativo
    public boolean isEdadMayor(Persona p){
        if (this.getEdad()> p.getEdad()){
            return true;
        }else{
            return false;
        }
    }



    //toString
    public String toString(){
        return "La persona se llama: "+nombre+" y tiene: "+edad+" años.";
    }
}
