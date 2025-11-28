import controlador.ConcesionarioControlador;
import controlador.ValidarDatos;
import vista.ConcesionarioVista;

public class Program {
    static void main(String[] args) {
        ValidarDatos entrada = new ValidarDatos();
        ConcesionarioVista vista = new ConcesionarioVista(entrada);
        ConcesionarioControlador controlador = new ConcesionarioControlador(vista);

        controlador.cochesDePrueba();
        controlador.clientesDePrueba();
        controlador.vendedoresDePrueba();
        controlador.ejecuta();
    }


}
