package vista;
//importar clases necesarias
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import modelo.Laboratorio;

//creacion de la clase DialogoLaboratorio
public class DialogoLaboratorio extends JDialog {
    
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbLab, lbprincipal;
    private VentanaPrincipal venPrin ;
    private JButton btVolver;

    // constructor
    public DialogoLaboratorio(VentanaPrincipal ventanaPrincipal)
    {

        venPrin = ventanaPrincipal;
        //crear el objeto laboratorio
        Laboratorio lab=new Laboratorio();
        //asignar los valores de los atributos del objeto laboratorio
        lab.setFuncion(venPrin.miPanelDatos.getFuncionit());
        lab.setLaboratorio(venPrin.miPanelDatos.getLaboratorioit());
        //Definición del layout del Dialogo
        this.setLayout(null);
        //Crear y agregar elementos
        lbLab= new JLabel(lab.getLaboratorio());
        lbLab.setBounds(465,490,800,30);
        lbLab.setFont(new Font("times",Font.BOLD,20));
        lbLab.setForeground(Color.black);
        this.add(lbLab);
        //crear label y agregarlo al panel
        lbprincipal= new JLabel();
        lbprincipal.setBounds(0,0,800,570);
        this.add(lbprincipal);
        //crear boton y agregarlo al panel


        
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
    //metodo boton volver
    public void agregarOyentesBotones1(ActionListener pAL)
    {
        btVolver.addActionListener(pAL);
    }
    //metodos para asignar el icono
    public void setIcono2(ImageIcon icono2) {
        lbprincipal.setIcon(icono2);
    }


}

