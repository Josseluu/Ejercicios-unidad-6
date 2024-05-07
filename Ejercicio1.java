public class Ejercicio1<T> {
    private T dato1;
    private T dato2;

    // Constructor que recibe dos datos de tipo T
    public Ejercicio1(T dato1, T dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    // Método para obtener el primer dato
    public T getDato1() {
        return dato1;
    }

    // Método para obtener el segundo dato
    public T getDato2() {
        return dato2;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Ejercicio1<Integer> parejaEnteros = new Ejercicio1<>(10, 20);
        System.out.println("Primer dato: " + parejaEnteros.getDato1());
        System.out.println("Segundo dato: " + parejaEnteros.getDato2());

        Ejercicio1<String> parejaStrings = new Ejercicio1<>("Hola", "Mundo");
        System.out.println("Primer dato: " + parejaStrings.getDato1());
        System.out.println("Segundo dato: " + parejaStrings.getDato2());
    }
}
