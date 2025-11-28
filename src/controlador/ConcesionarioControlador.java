package controlador;

import modelo.ClienteDTO;
import modelo.CocheDTO;
import modelo.VendedorDTO;
import modelo.VentaDTO;
import vista.ConcesionarioVista;

import java.util.ArrayList;
import java.util.List;

public class ConcesionarioControlador {
    private final List<ClienteDTO> clienteDTOS;
    private ConcesionarioVista vista;
    private List<CocheDTO> coches;
    private List<VentaDTO> ventaDTOS;
    private List<VendedorDTO> vendedores;

    public ConcesionarioControlador(ConcesionarioVista vista) {
        this.vista = vista;
        this.clienteDTOS = new ArrayList<>();
        this.coches = new ArrayList<>();
        this.ventaDTOS = new ArrayList<>();
        this.vendedores = new ArrayList<>();
    }

    public ConcesionarioControlador(List<ClienteDTO> clienteDTOS) {
        this.clienteDTOS = clienteDTOS;
    }

    public void ejecuta() {
        int opcion = -1;
        while (opcion != 0) {
            vista.mostrarMenu();
            opcion = vista.solicitarMenu();

            switch (opcion) {
                case 1 -> anadirCoche();
                case 2 -> mostrarCoches(coches);
                case 3 -> buscarCoches(coches);
                case 4 -> anadirCliente(clienteDTOS);
                case 5 -> registrarVenta();
                case 6 -> mostrarVentas(ventaDTOS);
                case 7 -> vista.mostrarClientes(clienteDTOS);
                case 0 -> vista.mostrarSalida();
            }
        }
    }

    private void anadirCoche() {
        CocheDTO nuevoCocheDTO = vista.obtenerDatosCoche();
        coches.add(nuevoCocheDTO);
        vista.mensaje("Añadido " + nuevoCocheDTO.getMarca() + " " + nuevoCocheDTO.getModelo() + " con matricula: " + nuevoCocheDTO.getMatricula());
    }

    private void mostrarCoches(List<CocheDTO> coches) {
    }

    private void buscarCoches(List<CocheDTO> coches) {
    }

    private void anadirCliente(List<ClienteDTO> clienteDTOS) {
        ClienteDTO nuevoClienteDTO = vista.obtenerDatosCliente(clienteDTOS);
        clienteDTOS.add(nuevoClienteDTO);
        vista.mensaje("Cliente " + nuevoClienteDTO.getNombreCompleto() + " añadido correctamente.");
    }

    private void registrarVenta() {
    }

    private void mostrarVentas(List<VentaDTO> ventaDTOS) {
    }

    public void cochesDePrueba() {
        coches.add(new CocheDTO("Toyota", "Corolla", "1234JBC", 9000, 2015, 110000));
        coches.add(new CocheDTO("Honda", "Civic", "5678JKL", 10500, 2015, 98000));
        coches.add(new CocheDTO("Ford", "Focus", "2345KDF", 11500, 2016, 90000));
        coches.add(new CocheDTO("Volkswagen", "Golf", "7890KRT", 12000, 2016, 85000));
        coches.add(new CocheDTO("BMW", "120d", "1123LBG", 13500, 2017, 78000));
        coches.add(new CocheDTO("Mercedes", "A180", "3345LLM", 14000, 2017, 72000));
        coches.add(new CocheDTO("Audi", "A3", "5566MCP", 15000, 2018, 65000));
        coches.add(new CocheDTO("Seat", "Ibiza", "7788MZH", 13000, 2018, 82000));
        coches.add(new CocheDTO("Seat", "León", "9900NDF", 16000, 2019, 54000));
        coches.add(new CocheDTO("Renault", "Clio", "2233NGT", 15000, 2019, 62000));
        coches.add(new CocheDTO("Peugeot", "308", "4412PFK", 18500, 2020, 41000));
        coches.add(new CocheDTO("Toyota", "Yaris", "6634PMN", 17000, 2020, 38000));
        coches.add(new CocheDTO("Hyundai", "i30", "3456LHR", 12500, 2017, 83000));
        coches.add(new CocheDTO("Kia", "Ceed", "8765MTS", 15500, 2018, 60000));
        coches.add(new CocheDTO("Nissan", "Qashqai", "1987NXP", 18000, 2019, 50000));
        coches.add(new CocheDTO("Mazda", "3", "4567KMB", 11000, 2016, 95000));
        coches.add(new CocheDTO("Citroën", "C4", "7654JZR", 8500, 2015, 120000));
        coches.add(new CocheDTO("Opel", "Astra", "5674LDC", 12500, 2017, 88000));
        coches.add(new CocheDTO("Skoda", "Octavia", "6483MFR", 16500, 2018, 56000));
        coches.add(new CocheDTO("Fiat", "Tipo", "7823PKH", 17500, 2020, 42000));

    }

    public void clientesDePrueba() {
        clienteDTOS.add(new ClienteDTO("12345678A", "Carlos Martínez López", "600123456"));
        clienteDTOS.add(new ClienteDTO("23456789B", "María Gómez Ruiz", "611987654"));
        clienteDTOS.add(new ClienteDTO("34567890C", "Javier Ortega Pérez", "622456789"));
        clienteDTOS.add(new ClienteDTO("45678901D", "Lucía Hernández Soto", "633567890"));
        clienteDTOS.add(new ClienteDTO("56789012E", "Elena Torres García", "644678901"));
    }

    public void vendedoresDePrueba() {
        vendedores.add(new VendedorDTO("Pedro Sánchez", "11223344A", new ArrayList<>()));
        vendedores.add(new VendedorDTO("Ana López", "22334455B", new ArrayList<>()));
    }


}

