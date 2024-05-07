import java.io.File;
import java.util.*;

public class Ejercicio12 {
    private static Map<String, String> archivos = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indexando archivos...");
        indexarArchivos(new File("/ruta/al/directorio"));

        System.out.println("¡Indexación completada!");

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Buscar ruta de un archivo");
            System.out.println("2. Listar archivos ordenados alfabéticamente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del archivo: ");
                    String nombreArchivo = scanner.nextLine();
                    buscarRuta(nombreArchivo);
                    break;
                case 2:
                    listarArchivosOrdenados();
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

    public static void indexarArchivos(File directorio) {
        if (directorio.isDirectory()) {
            for (File archivo : Objects.requireNonNull(directorio.listFiles())) {
                if (archivo.isDirectory()) {
                    indexarArchivos(archivo);
                } else {
                    archivos.put(archivo.getName(), archivo.getAbsolutePath());
                }
            }
        }
    }

    public static void buscarRuta(String nombreArchivo) {
        String ruta = archivos.get(nombreArchivo);
        if (ruta != null) {
            System.out.println("La ruta del archivo '" + nombreArchivo + "' es: " + ruta);
        } else {
            System.out.println("No se encontró ninguna ruta para el archivo '" + nombreArchivo + "'.");
        }
    }

    public static void listarArchivosOrdenados() {
        List<String> nombresOrdenados = new ArrayList<>(archivos.keySet());
        Collections.sort(nombresOrdenados);
        for (String nombre : nombresOrdenados) {
            System.out.println("Archivo: " + nombre + ", Ruta: " + archivos.get(nombre));
        }
    }
}
