import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir cadena");
            System.out.println("2. Eliminar última cadena");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una cadena: ");
                    String cadena = scanner.nextLine();
                    listaCadenas.add(cadena);
                    mostrarLista(listaCadenas);
                    break;
                case 2:
                    if (!listaCadenas.isEmpty()) {
                        listaCadenas.remove(listaCadenas.size() - 1);
                        mostrarLista(listaCadenas);
                    } else {
                        System.out.println("La lista está vacía. No se puede eliminar ningún elemento.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void mostrarLista(List<String> lista) {
        System.out.println("Contenido de la lista:");
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (String elemento : lista) {
                System.out.println(elemento);
            }
        }
    }
}
