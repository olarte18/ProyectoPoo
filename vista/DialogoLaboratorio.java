package vista;

import java.awt.Color;
import java.lang.invoke.StringConcatFactory;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import vista.VentanaPrincipal;
import modelo.Laboratorio;

public class DialogoLaboratorio extends JDialog {
    
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbLab;
    private JTextField tfCapacidad;
    private JLabel lbHoras;
    private JTextField tfHoras;
    private VentanaPrincipal venPrin;
    private JButton btAgregarSalon; 
    //----------------------
    // Metodos
    //----------------------
    public DialogoLaboratorio()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);
        String hola =venPrin.miPanelDatos.getLaboratorioit();
        //Crear y agregar elementos
        lbLab= new JLabel();
        lbLab.setText(hola);
        lbLab.setBounds(10,30,140,20);
        this.add(lbLab);

        tfCapacidad = new JTextField();
        tfCapacidad.setBounds(100,30,150, 25);
        this.add(tfCapacidad);

        lbHoras = new JLabel("Horas de uso: ");
        lbHoras.setBounds(10,80,140,20);
        this.add(lbHoras);

        tfHoras = new JTextField();
        tfHoras.setBounds(100,80,150, 25);
        this.add(tfHoras);

        //Caracteristicas de la ventana
        this.setTitle("Laboratorio");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}

