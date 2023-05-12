package vista;

import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    // atributos 
    public PanelDatos miPanelDatos;
    public Color ColorRosa;
    

    // metodos 

    // metodo constructor 

    public VentanaPrincipal ()
    {
        // definir contenedor para la ventana
        this.setLayout(null);

        this.setBackground(Color.black);
        //cracion frame PanelStart
        miPanelDatos= new PanelDatos();
        miPanelDatos.setBounds(0,0,500,400);
        this.add(miPanelDatos);
        // caracteristicas de la ventana 
        this.setTitle("Labsis" );
        this.setSize(500,540);
        this.setLocation(100,100);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        
    }
}