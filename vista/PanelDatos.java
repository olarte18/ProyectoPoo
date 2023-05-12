package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelDatos extends JPanel
{
    private Label lblab ;
    private JComboBox cbi ;
    Color customColor = new Color(255, 255, 224);

    public PanelDatos()
    {
    this.setLayout(null);
    this.setBackground(customColor);
        //label
    lblab = new Label("Seleccione un Laboratorio: ",Label.RIGHT);
    lblab.setFont(new Font("Arial",Font.BOLD,15));
    lblab.setForeground(new Color(47,79,79));
    lblab.setBounds(20,175,240,20);
    this.add(lblab);
        //lista
    cbi= new JComboBox();
    cbi.addItem(" ");
    cbi.addItem("i18(1/2) (medicion de objetos)");
    cbi.addItem("i18(2/2) (medicion de objetos)");
    cbi.addItem("i19 (MRU)");
    cbi.setBounds(260,175,240,20);
    this.add(cbi);
    }
}
