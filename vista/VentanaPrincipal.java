package vista;

import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    // atributos 
    public PanelDatos miPanelDatos;
    public PanelOperaciones miPanelOperaciones;
    public DialogoLaboratorio miDialogoLaboratorio=null ;


    // metodos 

    // metodo constructor 

    public VentanaPrincipal ()
    {
        // definir contenedor para la ventana
        this.setLayout(null);

        this.setBackground(Color.black);
        //cracion frame PanelStart
        miPanelDatos= new PanelDatos();
        miPanelDatos.setBounds(0,0,810,280);
        this.add(miPanelDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(5,290,800,140);
        this.add(miPanelOperaciones);
        // caracteristicas de la ventana 
        this.setTitle("LABSIS" );
        this.setSize(820,470);
        this.setLocation(100,100);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        
    }
    public void crearDialogoLaboratorio()
    {
        miDialogoLaboratorio = new DialogoLaboratorio();
    }
}