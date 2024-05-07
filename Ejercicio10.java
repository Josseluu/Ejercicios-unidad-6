import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Venta implements Comparable<Venta> {
    private String producto;
    private String cliente;
    private double precio;
    private Date fecha;

    public Venta(String producto, String cliente, double precio, Date fecha) {
        this.producto = producto;
        this.cliente = cliente;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public String getCliente() {
        return cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Venta otraVenta) {

        int comparacionFecha = this.fecha.compareTo(otraVenta.fecha);
        if (comparacionFecha != 0) {
            return comparacionFecha;
        }

        int comparacionCliente = this.cliente.compareTo(otraVenta.cliente);
        if (comparacionCliente != 0) {
            return comparacionCliente;
        }

        return Double.compare(this.precio, otraVenta.precio);
    }
}

public class Ejercicio10 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Set<Venta> ventas = new TreeSet<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Ingrese las ventas (nombre_producto, nombre_cliente, precio, fecha) separadas por comas:");
        System.out.println("Ejemplo: " + "producto1, cliente1, 100.50, 01/01/2022");
        System.out.println("Ingrese 'fin' para terminar.");

        while (true) {
            System.out.print("Venta: ");
            String entrada = scanner.nextLine().trim();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            String[] partes = entrada.split(", ");
            if (partes.length != 4) {
                System.out.println("Formato incorrecto. Por favor, ingrese los datos en el formato especificado.");
                continue;
            }

            String producto = partes[0];
            String cliente = partes[1];
            double precio = Double.parseDouble(partes[2]);
            Date fecha = dateFormat.parse(partes[3]);

            ventas.add(new Venta(producto, cliente, precio, fecha));
        }

        System.out.println("\nVentas ordenadas por fecha, nombre del cliente y precio:");
        for (Venta venta : ventas) {
            System.out.println("Producto: " + venta.getProducto() + ", Cliente: " + venta.getCliente() +
                    ", Precio: " + venta.getPrecio() + ", Fecha: " + dateFormat.format(venta.getFecha()));
        }

        scanner.close();
    }
}

