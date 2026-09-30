package quickbite.modelo;

public class Cliente {
    private String nombre;
    private String correo;
    private double saldo;

    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
    }

    public void mostrarInformacion() {
        System.out.printf("%-12s | %-16s | Saldo: $ %.0f%n", nombre, correo, saldo);
    }

    public boolean puedePagar(double valor) {
        return saldo >= valor;
    }

    public void pagar(double valor) {
        if (puedePagar(valor)) {
            saldo -= valor;
            System.out.println("Pago realizado.");
        } else {
            System.out.println("Pago rechazado: saldo insuficiente.");
        }
    }

    public String getNombre() {
        return nombre;
    }
}