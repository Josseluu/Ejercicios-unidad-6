import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        // Ordenar por apellido
        int comparacionApellido = this.apellido.compareTo(otraPersona.apellido);
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }
        // Si los apellidos son iguales, ordenar por nombre
        return this.nombre.compareTo(otraPersona.nombre);
    }
}

public class Ejercicio9 {
    public static void main(String[] args) {
        Set<Persona> personas = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese pares nombre/apellido de personas (para salir, escriba \"salir\"):");

        String nombre, apellido;
        while (true) {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.print("Apellido: ");
            apellido = scanner.nextLine();

            Persona persona = new Persona(nombre, apellido);
            personas.add(persona);
        }

        System.out.println("\nPersonas ordenadas alfabéticamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombreCompleto());
        }

        scanner.close();
    }
}
