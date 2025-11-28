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

    public int solicitarMenu() {
        while(true){
            System.out.println("Elije una opción: ");
            int op = sc.nextInt();

            if(entrada.validarOpcionMenu(op, 0, 7)){
                return op;
            }

            System.err.println("Introduce opcion valida");
        }
    }

//    public CocheDTO obtenerDatosCoche() {
//        boolean datoOk= false;
//        while(!datoOk)
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
    }

    public void mostrarClientes(List<ClienteDTO> clienteDTOS) {
        for (ClienteDTO clienteDTO : clienteDTOS) {
            System.out.println("Nombre.- " + clienteDTO.getNombreCompleto() + " DNI: " + clienteDTO.getDni() + " Tlf: " + clienteDTO.getTelefono());
        }
        System.out.println();
    }


}
