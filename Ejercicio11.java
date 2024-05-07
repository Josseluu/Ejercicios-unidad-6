import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio11 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";


        List<String> lineas = leerArchivo(inputFile);


        Collections.sort(lineas);


        escribirArchivo(outputFile, lineas);

        System.out.println("El contenido del archivo ha sido ordenado y guardado en '" + outputFile + "'.");
    }

    public static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }

    public static void escribirArchivo(String nombreArchivo, List<String> lineas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
