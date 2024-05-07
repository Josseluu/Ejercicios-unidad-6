import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> listaCadenas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir cadena en una posición");
            System.out.println("2. Eliminar cadena por posición");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la posición donde quieres insertar la cadena: ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Introduce la cadena a insertar: ");
                    String cadena = scanner.nextLine();
                    if (posicion >= 0 && posicion <= listaCadenas.size()) {
                        listaCadenas.add(posicion, cadena);
                        System.out.println("Cadena insertada en la posición " + posicion + ".");
                    } else {
                        System.out.println("Posición no válida. La cadena no fue insertada.");
                    }
                    break;
                case 2:
                    System.out.print("Introduce la posición de la cadena a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    if (posicionEliminar >= 0 && posicionEliminar < listaCadenas.size()) {
                        String cadenaEliminada = listaCadenas.remove(posicionEliminar);
                        System.out.println("Cadena \"" + cadenaEliminada + "\" eliminada de la posición " + posicionEliminar + ".");
                    } else {
                        System.out.println("Posición no válida. No se eliminó ninguna cadena.");
                    }
                    break;
                case 3:
                    mostrarLista(listaCadenas);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void mostrarLista(List<String> lista) {
        System.out.println("Contenido de la lista:");
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Posición " + i + ": " + lista.get(i));
            }
        }
    }
}
