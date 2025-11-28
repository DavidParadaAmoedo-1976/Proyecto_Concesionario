package modelo;

import java.time.LocalDate;

public class VentaDTO {
    private static int contador = 0;
    private int idVenta;
    private ClienteDTO clienteDTO;
    private CocheDTO cocheDTO;
    private LocalDate fecha;
    private double precioVenta;

    public VentaDTO(ClienteDTO clienteDTO, CocheDTO cocheDTO, LocalDate fecha, double precioVenta) {
        this.idVenta = contador++;
        this.clienteDTO = clienteDTO;
        this.cocheDTO = cocheDTO;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
    }

    public VentaDTO(int idVenta, ClienteDTO clienteDTO, CocheDTO cocheDTO, LocalDate fecha, double precioVenta) {
        this.idVenta = idVenta;
        this.clienteDTO = clienteDTO;
        this.cocheDTO = cocheDTO;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public ClienteDTO getCliente() {
        return clienteDTO;
    }

    public void setCliente(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public CocheDTO getCoche() {
        return cocheDTO;
    }

    public void setCoche(CocheDTO cocheDTO) {
        this.cocheDTO = cocheDTO;
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
