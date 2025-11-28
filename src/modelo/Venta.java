package modelo;

import java.time.LocalDate;

public class Venta {
    private static int contador = 0;
    private int idVenta;
    private Cliente cliente;
    private Coche coche;
    private LocalDate fecha;
    private double precioVenta;

    public Venta(Cliente cliente, Coche coche, LocalDate fecha, double precioVenta) {
        this.idVenta = contador++;
        this.cliente = cliente;
        this.coche = coche;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
    }

    public Venta(int idVenta, Cliente cliente, Coche coche, LocalDate fecha, double precioVenta) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.coche = coche;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
