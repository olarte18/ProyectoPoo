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
    private JButton btCostoPlan;
    private JButton btSalir;


    //----------------------
    // Metodos
    //----------------------
    Color customColor = new Color(255, 255, 224);

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(customColor);

        //Crear y agregar boton AgregarVendedor
        btCostoPlan = new JButton("Ver laboratorio");
        btCostoPlan.setBounds(80,50,200,40);
        btCostoPlan.setActionCommand("lab");
        this.add(btCostoPlan);

    
     

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
        
        btCostoPlan.addActionListener(pAL);
        btSalir.addActionListener(pAL);
     
    }


}

