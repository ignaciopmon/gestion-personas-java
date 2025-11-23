package modelo;
public class Persona {
    private String nombre;
    private int edad;
    private String curso;

    // 2. Constructor actualizado
    public Persona(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}