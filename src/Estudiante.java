// Clase derivada que hereda de Persona
// Utilizamos "extends" para aplicar herencia

public class Estudiante extends Persona {

    String carrera;

    public Estudiante(String nombre, int edad, String carrera){
        super(nombre, edad); // llama al constructor de Persona
        this.carrera = carrera;
    }

    public void mostrarCarrera(){
        System.out.println("Carrera: " + carrera);
    }

}
