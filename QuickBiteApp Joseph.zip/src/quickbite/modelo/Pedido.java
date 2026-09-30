package quickbite.modelo;

public class Pedido {
    private Cliente cliente;   
    private Plato plato;
    private int cantidad;

    public Pedido(Cliente cliente, Plato plato, int cantidad) {
        this.cliente = cliente;
        this.plato = plato;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return plato.calcularSubtotal(cantidad);
    }

    public void confirmar() {
        if (!plato.hayDisponibilidad(cantidad)) {
            System.out.println("Pedido rechazado: porciones insuficientes.");
            return;
        }
        double total = calcularTotal();
        if (!cliente.puedePagar(total)) {
            System.out.println("Pedido rechazado: saldo insuficiente.");
            return;
        }
        cliente.pagar(total);
        plato.despachar(cantidad);
        System.out.println("Pedido confirmado.");
    }

    public void mostrarResumen() {
        System.out.println(cliente.getNombre() + " solicita " + cantidad
                + " porciones de " + plato.getNombre());
        System.out.printf("Total: $ %.0f%n", calcularTotal());
    }
}