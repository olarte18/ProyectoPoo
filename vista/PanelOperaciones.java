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
    
    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.black);

        //Crear y agregar boton AgregarVendedor
        btVer = new JButton("Ver laboratorio");
        btVer.setBounds(80,50,200,40);
        btVer.setActionCommand("ver");
        this.add(btVer);

    
     

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(450,50,200,40); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);



       //Borde y titulo del panel
       TitledBorder borde = BorderFactory.createTitledBorder("  ");
       borde.setTitleColor(Color.black);
       this.setBorder(borde);



   
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        
        btVer.addActionListener(pAL);
        btSalir.addActionListener(pAL);
     
    }


}

