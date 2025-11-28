package modelo;

import java.util.List;

public class Vendedor {
    private static int contador = 0;
    private int idVendedor;
    private String nombreCompleto;
    private String dni;
    private List<Coche> cochesVendidos;

    public Vendedor(String nombreCompleto, String dni, List<Coche> cochesVendidos) {
        this.idVendedor = contador++;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cochesVendidos = cochesVendidos;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Coche> getCochesVendidos() {
        return cochesVendidos;
    }

    public void setCochesVendidos(List<Coche> cochesVendidos) {
        this.cochesVendidos = cochesVendidos;
    }
}
