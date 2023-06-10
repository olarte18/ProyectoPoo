package ejecutable;
// se importan las clases necesarias
import controlador.Controlador;
import modelo.Laboratorio;
import vista.VentanaPrincipal;
//clase Test
public class Test
{
//metodo main
    public static void main(String[] args) 
    {
        //se crean los objetos necesarios
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Laboratorio miLaboratorio= new Laboratorio();
        Controlador miControlador = new Controlador(miVentana, miLaboratorio);
    }
}