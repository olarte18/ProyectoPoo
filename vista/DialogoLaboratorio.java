package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import vista.VentanaPrincipal;

public class DialogoLaboratorio extends JDialog {
    
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbLab, lb1Lab,lb2Lab;
    private VentanaPrincipal venPrin ;
 
    //----------------------
    // Metodos
    //----------------------
    Color customColor = new Color(255, 255, 224);

    public DialogoLaboratorio(VentanaPrincipal ventanaPrincipal)
    {
        String imagen="/vista/imagen.png";
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
        lb1Lab= new JLabel();
        lb1Lab.setBounds(100,80,200,267);
        this.add(lb1Lab);

        lb2Lab= new JLabel();
        lb2Lab.setBounds(350,80,200,267);
        this.add(lb2Lab);
        //Caracteristicas de la ventana
        this.setTitle("Laboratorio");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    public void setIcono(ImageIcon icono) {
        lb1Lab.setIcon(icono);
    }
    public void setIcono1(ImageIcon icono1) {
        lb2Lab.setIcon(icono1);
    }

}

