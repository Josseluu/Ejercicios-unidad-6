import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Ejercicio3<T> {
    private T primero;
    private T segundo;

    public Ejercicio3(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public T getSegundo() {
        return segundo;
    }

    public static void main(String[] args) {
        List<Ejercicio3<Integer>> listaParejas = new ArrayList<>();
        Random random = new Random();

        // Introducir 100 parejas de enteros aleatorios en la lista
        for (int i = 0; i < 100; i++) {
            int entero1 = random.nextInt(100); // Números aleatorios entre 0 y 99
            int entero2 = random.nextInt(100); // Números aleatorios entre 0 y 99
            Ejercicio3<Integer> pareja = new Ejercicio3<>(entero1, entero2);
            listaParejas.add(pareja);
        }

        // Mostrar las parejas de enteros de la lista
        for (int i = 0; i < listaParejas.size(); i++) {
            Ejercicio3<Integer> pareja = listaParejas.get(i);
            System.out.println("Pareja " + (i + 1) + ": (" + pareja.getPrimero() + ", " + pareja.getSegundo() + ")");
        }
    }
}
