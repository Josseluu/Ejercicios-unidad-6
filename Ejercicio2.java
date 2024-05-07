import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear una lista utilizando ArrayList
        List<Double> listaArrayList = new ArrayList<>();
        // Crear una lista utilizando LinkedList
        List<Double> listaLinkedList = new LinkedList<>();

        // Introducir 100 valores aleatorios en ambas listas
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            double valor = random.nextDouble() * 100; // Generar valores aleatorios entre 0 y 100
            listaArrayList.add(valor);
            listaLinkedList.add(valor);
        }

        // Mostrar los valores de la lista ArrayList
        System.out.println("Valores en la lista ArrayList:");
        for (double valor : listaArrayList) {
            System.out.println(valor);
        }

        // Mostrar los valores de la lista LinkedList
        System.out.println("\nValores en la lista LinkedList:");
        for (double valor : listaLinkedList) {
            System.out.println(valor);
        }
    }
}
