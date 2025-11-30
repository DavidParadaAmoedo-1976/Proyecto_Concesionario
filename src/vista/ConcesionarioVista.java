package vista;

import controlador.ValidarDatos;
import modelo.ClienteDTO;
import modelo.CocheDTO;

import java.util.List;
import java.util.Scanner;

public class ConcesionarioVista {

    private final Scanner sc = new Scanner(System.in);
    private final ValidarDatos entrada;

    public ConcesionarioVista(ValidarDatos entrada) {
        this.entrada = entrada;
    }

    public void mostrarMenu() {
        System.out.println("""
                1.- Añadir coches al concesionario.
                2.- Mostar los coches disponibles.
                3.- Buscar coches usando.
                4.- Registrar un nuevo clienteDTO.
                5.- Registrar una venta, indicándole el clienteDTO y el cocheDTO involucrados.
                6.- Listar ventaDTOS.
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

    public String solicitarEntrada(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }


//    public CocheDTO obtenerDatosCoche() {
//
//        System.out.print("Introduce la maraca del coche: ");
//        String marca = sc.nextLine();
//        System.out.print("Introduce el modelo del coche: ");
//        String modelo = sc.nextLine();
//        System.out.print("Introduce la matricula del coche");
//        String matricula = sc.nextLine();
//        while (true) {
//            System.out.print("Introduce el precio del coche: ");
//            try {
//                String input = sc.nextLine();
//                double precio = Double.parseDouble(input);
//            } catch (NumberFormatException e) {
//                System.err.print("Introduce un valor válido: ");
//            }
//        }
//
//
//    }

    public ClienteDTO obtenerDatosCliente(List<ClienteDTO> clienteDTOS) {
        String dni = entrada.leerDni(clienteDTOS);
        String nombre = entrada.leerNombre();
        String telefono = entrada.leerTelefono();

        return new ClienteDTO(dni, nombre, telefono);
    }

    public void mostrarSalida() {
        System.out.println("Saliendo...");
    }


    public void mensajeError(String mensaje) {
        System.err.println(mensaje);
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
        System.out.println();
    }

    public void mostrarClientes(List<ClienteDTO> clienteDTOS) {
        for (ClienteDTO clienteDTO : clienteDTOS) {
            System.out.println("Nombre.- " + clienteDTO.getNombreCompleto() + " DNI: " + clienteDTO.getDni() + " Tlf: " + clienteDTO.getTelefono());
        }
        System.out.println();
    }


    public CocheDTO obtenerDatosCoche() {
        CocheDTO nuevoCoche = null;
        return nuevoCoche;
    }


}
