
public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona = new Persona("juan", 5000, false);

        System.out.println(" persona " + persona.toString());
        
        persona.setNombre("carlos");
        System.out.println("nuevo nombre persona: " + persona.toString());
    }

}
