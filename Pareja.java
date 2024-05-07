public class Pareja<T> {
    private T primero;
    private T segundo;

    public Pareja(T primero, T segundo) {
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
        Pareja<Integer> parejaEnteros = new Pareja<>(10, 20);
        System.out.println("Primer elemento de la pareja: " + parejaEnteros.getPrimero());
        System.out.println("Segundo elemento de la pareja: " + parejaEnteros.getSegundo());

        Pareja<String> parejaStrings = new Pareja<>("Hola", "Mundo");
        System.out.println("Primer elemento de la pareja: " + parejaStrings.getPrimero());
        System.out.println("Segundo elemento de la pareja: " + parejaStrings.getSegundo());
    }
}
