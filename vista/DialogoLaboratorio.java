package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Laboratorio;
import vista.VentanaPrincipal;

public class DialogoLaboratorio extends JDialog {
    
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbLab, lb1Lab,lb2Lab,lbprincipal;
    private VentanaPrincipal venPrin ;
    //----------------------
    // Metodos
    //----------------------
    // contructor
    public DialogoLaboratorio(VentanaPrincipal ventanaPrincipal)
    {
        venPrin = ventanaPrincipal;
        Laboratorio lab=new Laboratorio();
        lab.setFuncion(venPrin.miPanelDatos.getFuncionit());
        lab.setLaboratorio(venPrin.miPanelDatos.getLaboratorioit());
        venPrin=ventanaPrincipal;
        //Definición del layout del Dialogo
        this.setLayout(null);
        //Crear y agregar elementos
 




        lbLab= new JLabel(lab.getLaboratorio());
        lbLab.setBounds(10,30,800,30);
        lbLab.setFont(new Font("times",Font.BOLD,24));
        lbLab.setForeground(new Color(47,79,79));

        this.add(lbLab);

        lbprincipal= new JLabel();
        lbprincipal.setBounds(0,0,800,570);
        this.add(lbprincipal);

        
        lb1Lab= new JLabel();
        lb1Lab.setBounds(100,80,200,267);
        this.add(lb1Lab);

        lb2Lab= new JLabel();
        lb2Lab.setBounds(350,80,200,267);
        this.add(lb2Lab);
        //Caracteristicas de la ventana
        this.setTitle("Laboratorio");
        this.setSize(800,570);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    //----------------------
    // Metodos
    //----------------------
    public void setIcono(ImageIcon icono) {
        lb1Lab.setIcon(icono);
    }
    public void setIcono1(ImageIcon icono1) {
        lb2Lab.setIcon(icono1);
    }
    public void setIcono2(ImageIcon icono2) {
        lbprincipal.setIcon(icono2);
    }

}

