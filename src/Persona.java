// Clase base o clase padre
// Esta clase contiene atributos y métodos que pueden ser heredados

public class Persona {

    String nombre;
    int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los datos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}