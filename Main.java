import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> listaArrayList = new ArrayList<>();
        List<Double> listaLinkedList = new LinkedList<>();
        Random random = new Random();


        for (int i = 0; i < 100; i++) {
            double valor = random.nextDouble() * 100;
            listaArrayList.add(valor);
            listaLinkedList.add(valor);
        }


        System.out.println("Valores de la lista ArrayList:");
        for (double valor : listaArrayList) {
            System.out.println(valor);
        }


        System.out.println("\nValores de la lista LinkedList:");
        for (double valor : listaLinkedList) {
            System.out.println(valor);
        }
    }
}
