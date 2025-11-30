package controlador;

import modelo.Cliente;
import modelo.Coche;
import modelo.Vendedor;
import modelo.Venta;
import vista.ConcesionarioVista;

import java.util.ArrayList;
import java.util.List;

public class ConcesionarioControlador {
    private final List<Cliente> clientes;
    private ConcesionarioVista vista;
    private List<Coche> coches;
    private List<Venta> ventas;
    private List<Vendedor> vendedores;

    public ConcesionarioControlador(ConcesionarioVista vista) {
        this.vista = vista;
        this.clientes = new ArrayList<>();
        this.coches = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.vendedores = new ArrayList<>();
    }

    public ConcesionarioControlador(List<Cliente> clientes) {
        this.clientes = clientes;
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
                case 4 -> anadirCliente(clientes);
                case 5 -> registrarVenta();
                case 6 -> mostrarVentas(ventas);
                case 7 -> vista.mostrarClientes(clientes);
                case 0 -> vista.mostrarSalida();
            }
        }
    }

    private void anadirCoche() {
    }

    private void mostrarCoches(List<Coche> coches) {
    }

    private void buscarCoches(List<Coche> coches) {
    }

    private void anadirCliente(List<Cliente> clientes) {
        Cliente nuevoCliente = vista.obtenerDatosCliente(clientes);
        clientes.add(nuevoCliente);
        vista.mensaje("Cliente " + nuevoCliente.getNombreCompleto() + " añadido correctamente.");
    }

    private void registrarVenta() {
    }

    private void mostrarVentas(List<Venta> ventas) {
    }

    public void cochesDePrueba() {
        coches.add(new Coche("Toyota", "Corolla", "1234JBC", 9000, 2015, 110000));
        coches.add(new Coche("Honda", "Civic", "5678JKL", 10500, 2015, 98000));
        coches.add(new Coche("Ford", "Focus", "2345KDF", 11500, 2016, 90000));
        coches.add(new Coche("Volkswagen", "Golf", "7890KRT", 12000, 2016, 85000));
        coches.add(new Coche("BMW", "120d", "1123LBG", 13500, 2017, 78000));
        coches.add(new Coche("Mercedes", "A180", "3345LLM", 14000, 2017, 72000));
        coches.add(new Coche("Audi", "A3", "5566MCP", 15000, 2018, 65000));
        coches.add(new Coche("Seat", "Ibiza", "7788MZH", 13000, 2018, 82000));
        coches.add(new Coche("Seat", "León", "9900NDF", 16000, 2019, 54000));
        coches.add(new Coche("Renault", "Clio", "2233NGT", 15000, 2019, 62000));
        coches.add(new Coche("Peugeot", "308", "4412PFK", 18500, 2020, 41000));
        coches.add(new Coche("Toyota", "Yaris", "6634PMN", 17000, 2020, 38000));
        coches.add(new Coche("Hyundai", "i30", "3456LHR", 12500, 2017, 83000));
        coches.add(new Coche("Kia", "Ceed", "8765MTS", 15500, 2018, 60000));
        coches.add(new Coche("Nissan", "Qashqai", "1987NXP", 18000, 2019, 50000));
        coches.add(new Coche("Mazda", "3", "4567KMB", 11000, 2016, 95000));
        coches.add(new Coche("Citroën", "C4", "7654JZR", 8500, 2015, 120000));
        coches.add(new Coche("Opel", "Astra", "5674LDC", 12500, 2017, 88000));
        coches.add(new Coche("Skoda", "Octavia", "6483MFR", 16500, 2018, 56000));
        coches.add(new Coche("Fiat", "Tipo", "7823PKH", 17500, 2020, 42000));

    }

    public void clientesDePrueba() {
        clientes.add(new Cliente("12345678A", "Carlos Martínez López", "600123456"));
        clientes.add(new Cliente("23456789B", "María Gómez Ruiz", "611987654"));
        clientes.add(new Cliente("34567890C", "Javier Ortega Pérez", "622456789"));
        clientes.add(new Cliente("45678901D", "Lucía Hernández Soto", "633567890"));
        clientes.add(new Cliente("56789012E", "Elena Torres García", "644678901"));
    }

    public void vendedoresDePrueba() {
        vendedores.add(new Vendedor("Pedro Sánchez", "11223344A", new ArrayList<>()));
        vendedores.add(new Vendedor("Ana López", "22334455B", new ArrayList<>()));
    }


}

