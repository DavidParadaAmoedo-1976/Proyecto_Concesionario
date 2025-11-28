package vista;

import controlador.ValidarDatos;
import modelo.Cliente;

import java.util.List;

public class ConcesionarioVista {

    private final ValidarDatos entrada;

    public ConcesionarioVista(ValidarDatos entrada) {
        this.entrada = entrada;
    }

    public void mostrarMenu() {
        System.out.println("""
                1.- Añadir coches al concesionario.
                2.- Mostar los coches disponibles.
                3.- Buscar coches usando.
                4.- Registrar un nuevo cliente.
                5.- Registrar una venta, indicándole el cliente y el coche involucrados.
                6.- Listar ventas.
                0.- Salir
                """);
    }

    public void mostrarMenuBuscar() {
        System.out.println("""
                1.- Marca.
                2.- Rango de precios.
                3.- Año.
                0.- Menú principal.
                """);
    }

    public int solicitarMenu() {
        return entrada.enteroCorrecto("Elije una opción: ", 0, 7);
    }

    public Cliente obtenerDatosCliente(List<Cliente> clientes) {
        String dni = entrada.leerDni(clientes);
        String nombre = entrada.leerNombre();
        String telefono = entrada.leerTelefono();

        return new Cliente(dni, nombre, telefono);
    }

    public void mostrarSalida() {
        System.out.println("Saliendo...");
    }


    public void mensajeError(String mensaje) {
        System.err.println(mensaje);
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Nombre.- " + cliente.getNombreCompleto() + " DNI: " + cliente.getDni() + " Tlf: " + cliente.getTelefono());
        }
        System.out.println();
    }
}
