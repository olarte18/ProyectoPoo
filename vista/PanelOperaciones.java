package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btBorrar;
    private JButton btVer;
    private JButton btSalir;


    //----------------------
    // Metodos
    //----------------------
    // creaccion color base
    Color customColor = new Color(255, 255, 255);
    
    //Constructor
    public PanelOperaciones()
    {

        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(customColor);

        //Crear y agregar boton verlaboratorio
        btVer = new JButton("Ver laboratorio");
        btVer.setBounds(80,50,200,40);
        btVer.setActionCommand("ver");
        this.add(btVer);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(450,50,200,40); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        
        btVer.addActionListener(pAL);
        btSalir.addActionListener(pAL);
     
    }


}

