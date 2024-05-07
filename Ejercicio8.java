import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Map<Integer, Character> mapaPares = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir par número/letra");
            System.out.println("2. Recuperar letra a partir de número");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Introduce una letra: ");
                    char letra = scanner.nextLine().charAt(0);
                    mapaPares.put(numero, letra);
                    System.out.println("Par número/letra añadido.");
                    break;
                case 2:
                    System.out.print("Introduce un número para recuperar la letra correspondiente: ");
                    int numBuscar = scanner.nextInt();
                    Character letraRecuperada = mapaPares.get(numBuscar);
                    if (letraRecuperada != null) {
                        System.out.println("La letra correspondiente al número " + numBuscar + " es: " + letraRecuperada);
                    } else {
                        System.out.println("No se encontró ninguna letra para el número " + numBuscar);
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
}
