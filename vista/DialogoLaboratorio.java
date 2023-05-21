package vista;

import java.awt.Color;
import java.awt.Font;

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
    Color customColor = new Color(255, 255, 224);

    public DialogoLaboratorio(VentanaPrincipal ventanaPrincipal)
    {
        venPrin=ventanaPrincipal;
        //Definición del layout del Dialogo
        this.setLayout(null);
        //color de fondo del dialogo
        getContentPane().setBackground(customColor);

        //Crear y agregar elementos
        lbLab= new JLabel("Laboratorio "+venPrin.miPanelDatos.getLaboratorioit(), JLabel.CENTER);
        lbLab.setBounds(10,30,800,30);
        lbLab.setFont(new Font("times",Font.BOLD,24));
        lbLab.setForeground(new Color(47,79,79));

        this.add(lbLab);


        //Caracteristicas de la ventana
        this.setTitle("Laboratorio");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
}

