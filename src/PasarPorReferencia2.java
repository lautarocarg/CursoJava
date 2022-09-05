class Persona{
    private String nombre;

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Lautaro");

        System.out.println("persona.getNombre() = " + persona.getNombre());

        System.out.println("Inicionamos");
        test(persona);

        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Finaliza main");
    }
    public static void test(Persona persona){
        System.out.println("Inicia test");
        persona.setNombre("Andres");
        System.out.println("Termino test");

    }
}
