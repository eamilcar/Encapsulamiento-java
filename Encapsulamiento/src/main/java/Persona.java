
public class Persona {

    //asignamos private para modificador de acceso en encapsulamiento
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;

    }

    //obtener el nombre 
    public String getNombre() {
        return this.nombre;
    }
//no regresa ningun dato por eso es void
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
//para los tipos boolean utiliza is porque es una pregunta
    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    //concatenar los valores de los atributos para simplificar los codigos
    //anotacion que se esta sobrecargando el metodo
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
   
}
