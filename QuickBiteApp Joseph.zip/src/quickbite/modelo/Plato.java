package quickbite.modelo;

public class Plato {
    private String nombre;
    private double precio;
    private int porcionesDisponibles;


    public Plato(String nombre, double precio, int porcionesDisponibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.porcionesDisponibles = porcionesDisponibles;
    }

    public void mostrarInformacion() {
        System.out.printf("%-20s | $ %.0f | Porciones: %d%n", nombre, precio, porcionesDisponibles);
    }


    public double calcularSubtotal(int cantidad) {
        return precio * cantidad;
    }

    public boolean hayDisponibilidad(int cantidad) {
        return cantidad <= porcionesDisponibles;
    }

    
    public void despachar(int cantidad) {
        if (hayDisponibilidad(cantidad)) {
            porcionesDisponibles -= cantidad;
        } else {
            System.out.println("Advertencia: no hay porciones suficientes de " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPorcionesDisponibles() {
        return porcionesDisponibles;
    }
}