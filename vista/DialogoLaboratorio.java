package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import vista.VentanaPrincipal;

public class DialogoLaboratorio extends JDialog {
    
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbLab;
    private VentanaPrincipal venPrin ;
 
    //----------------------
    // Metodos
    //----------------------
    public DialogoLaboratorio(VentanaPrincipal ventanaPrincipal)
    {
        venPrin=ventanaPrincipal;
        //Definición del layout del Dialogo
        this.setLayout(null);
        //Crear y agregar elementos
        lbLab= new JLabel("Laboratorio "+venPrin.miPanelDatos.getLaboratorioit());
        lbLab.setBounds(10,30,300,30);
        this.add(lbLab);


        //Caracteristicas de la ventana
        this.setTitle("Laboratorio");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
}

