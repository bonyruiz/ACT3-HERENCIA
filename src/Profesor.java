// Clase derivada que también hereda de Persona

public class Profesor extends Persona {

    String materia;

    public Profesor(String nombre, int edad, String materia){
        super(nombre, edad);
        this.materia = materia;
    }

    public void mostrarMateria(){
        System.out.println("Materia: " + materia);
    }

}