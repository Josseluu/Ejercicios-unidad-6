import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        TreeSet<String> conjuntoCadenas = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir cadena");
            System.out.println("2. Eliminar cadena");
            System.out.println("3. Mostrar conjunto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una cadena: ");
                    String cadena = scanner.nextLine();
                    conjuntoCadenas.add(cadena);
                    mostrarConjunto(conjuntoCadenas);
                    break;
                case 2:
                    System.out.print("Introduce la cadena a eliminar: ");
                    String cadenaEliminar = scanner.nextLine();
                    if (conjuntoCadenas.remove(cadenaEliminar)) {
                        System.out.println("Cadena \"" + cadenaEliminar + "\" eliminada.");
                        mostrarConjunto(conjuntoCadenas);
                    } else {
                        System.out.println("La cadena \"" + cadenaEliminar + "\" no está en el conjunto.");
                    }
                    break;
                case 3:
                    mostrarConjunto(conjuntoCadenas);
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

    public static void mostrarConjunto(TreeSet<String> conjunto) {
        System.out.println("Contenido del conjunto:");
        if (conjunto.isEmpty()) {
            System.out.println("El conjunto está vacío.");
        } else {
            for (String elemento : conjunto) {
                System.out.println(elemento);
            }
        }
    }
}
