package QuickBiteApp;

import quickbite.modelo.Cliente;
import quickbite.modelo.Pedido;
import quickbite.modelo.Plato;

public class QuickBiteApp {
    public static void main(String[] args) {

        Plato arroz = new Plato("Arroz con pollo", 18000, 12);
        Plato lechona = new Plato("Lechona tolimense", 25000, 2);
        Plato sancocho = new Plato("Sancocho trifasico", 22000, 6);

        // Dos objetos Cliente
        Cliente camila = new Cliente("Camila Duarte", "camila@correo.com", 80000);
        Cliente andres = new Cliente("Andres Mejia", "andres@correo.com", 10000);

        System.out.println("=== MENU QUICKBITE ===");
        arroz.mostrarInformacion();
        lechona.mostrarInformacion();
        sancocho.mostrarInformacion();

        System.out.println("\n=== CLIENTES ===");
        camila.mostrarInformacion();
        andres.mostrarInformacion();

        System.out.println("\n=== PEDIDO 1 (exitoso) ===");
        Pedido p1 = new Pedido(camila, arroz, 3);
        p1.mostrarResumen();
        p1.confirmar();

        System.out.println("\n=== PEDIDO 2 (saldo insuficiente) ===");
        Pedido p2 = new Pedido(andres, sancocho, 1);
        p2.mostrarResumen();
        p2.confirmar();

        System.out.println("\n=== PEDIDO 3 (sin porciones) ===");
        Pedido p3 = new Pedido(camila, lechona, 4);
        p3.mostrarResumen();
        p3.confirmar();

        System.out.println("\n=== ESTADO FINAL ===");
        arroz.mostrarInformacion();
        lechona.mostrarInformacion();
        sancocho.mostrarInformacion();
        camila.mostrarInformacion();
        andres.mostrarInformacion();
    }
}