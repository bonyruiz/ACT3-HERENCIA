// Clase principal donde se prueban las clases y la herencia

public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Ebony", 19, "Ingenieria");
        e1.mostrarDatos();
        e1.mostrarCarrera();

        System.out.println();

        Profesor p1 = new Profesor("Carlos", 40, "Programacion");
        p1.mostrarDatos();
        p1.mostrarMateria();

    }

}