package ejecutable;

import controlador.Controlador;
import modelo.Laboratorio;
import vista.VentanaPrincipal;

public class Test
{

    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Laboratorio miLaboratorio= new Laboratorio();
        Controlador miControlador = new Controlador(miVentana, miLaboratorio);
    }
}