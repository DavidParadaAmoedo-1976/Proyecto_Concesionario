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
                3.- Buscar coches.
                4.- Registrar un nuevo cliente.
                5.- Registrar una venta, indicándole el cliente y el coche involucrados.
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


    public void mostrarCoches(List<CocheDTO> cochesDisponibles) {
        logo();
        System.out.print("\t".repeat(10) + " \u250C" + "\u2500".repeat(14) + "\u252C" +  "\u2500".repeat(14) + "\u252C" + "\u2500".repeat(11) + "\u252C" + "\u2500".repeat(6) + "\u2510");
        System.out.printf("\n" + "\t".repeat(10) + " \u2502 %-12s \u2502 %-12s \u2502 %-7s \u2502 %-4s \u2502 ", "   Marca", "   Modelo", "Matricula", "Año");
        System.out.print("\n" + "\t".repeat(10) + " \u251C" + "\u2500".repeat(14) + "\u253C" +  "\u2500".repeat(14) + "\u253C" + "\u2500".repeat(11) + "\u253C" + "\u2500".repeat(6) + "\u2524");

        for(CocheDTO coche : cochesDisponibles){
            System.out.printf("\n" + "\t".repeat(10) + " \u2502 %-12s \u2502 %-12s \u2502  %-7s  \u2502 %-4d \u2502 ", coche.getMarca(), coche.getModelo(), coche.getMatricula(),coche.getAnioMatriculacion());
        }
        System.out.print("\n" + "\t".repeat(10) + " \u2514" + "\u2500".repeat(14) + "\u2534" +  "\u2500".repeat(14) + "\u2534" + "\u2500".repeat(11) + "\u2534" + "\u2500".repeat(6) + "\u2518");

    }

    public void logo(){
        System.out.println("""
                
                  \t\t\t\t\t\t\t\t\t\t\t\t\t\t   \u250C\u2500\u2500\u2500\u252C\u2500\u2500\u2500\u2510
                  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\u250C\u2500\u2500\u2534\u2500\u2500\u2500\u2534\u2500\u2500\u2500\u2534\u2500\u2500\u2500\u2500\u2510
                  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\u2502  AUTOS TEIS   \u2593
                  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\u2567(\u2600)\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500(\u2600)\u2567
                  """);
    };

}
