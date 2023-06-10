package vista;
// se importan las clases necesarias
import java.awt.Color;
import javax.swing.JFrame;

//creacion ventana principal
public class VentanaPrincipal extends JFrame
{
    // atributos 
    public PanelDatos miPanelDatos;
    public PanelOperaciones miPanelOperaciones;
    public DialogoLaboratorio miDialogoLaboratorio ;

    // metodo constructor 

    public VentanaPrincipal ()
    {
        // definir contenedor para la ventana
        this.setLayout(null);

        this.setBackground(Color.black);
        //cracion frame PanelStart
        miPanelDatos= new PanelDatos();
        miPanelDatos.setBounds(0,0,820,280);
        this.add(miPanelDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(0,280,820,155);
        this.add(miPanelOperaciones);
        // caracteristicas de la ventana 
        this.setTitle("LABSIS" );
        this.setSize(820,470);
        this.setLocation(100,100);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        
    }
    // metodos
    public void crearDialogoLaboratorio()
    {
        miDialogoLaboratorio = new DialogoLaboratorio(this);
    }
}