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
    private Label lblab3 ;
    private JComboBox cbi2 ;
    Color customColor = new Color(255, 255, 224);

    public PanelDatos()
    {
    this.setLayout(null);
    this.setBackground(customColor);
        //label
    lblab = new Label("SELECCIONA EL LABORATORIO  ");
    lblab.setFont(new Font("Arial",Font.BOLD,15));
    lblab.setForeground(new Color(47,79,79));
    lblab.setBounds(120,45,250,20);
    this.add(lblab);

    lblab = new Label("LABORATORIO: ");
    lblab.setFont(new Font("Arial",Font.BOLD,15));
    lblab.setForeground(new Color(47,79,79));
    lblab.setBounds(40,105,120,20);
    this.add(lblab);
        //lista
    cbi= new JComboBox();
    cbi.addItem(" ");
    cbi.addItem("i18(1/2) (medicion de objetos)");
    cbi.addItem("i18(2/2) (medicion de objetos)");
    cbi.addItem("i19 (MRU)");
    cbi.setBounds(180,105,250,20);
    this.add(cbi);


    lblab3 = new Label("¿Que Deseas Consultar?: ");
    lblab3.setFont(new Font("Arial",Font.BOLD,15));
    lblab3.setForeground(new Color(47,79,79));
    lblab3.setBounds(40,175,200,20);
    this.add(lblab3);
        //lista
    cbi2= new JComboBox();
    cbi2.addItem(" ");
    cbi2.addItem("¿Como Hacerlo?");
    cbi2.addItem("Materiales");
    cbi2.addItem("Ver un Video de prueba");
    cbi2.setBounds(240,175,250,20);
    this.add(cbi2);
    }
    public String getLaboratorioit()
    {
        return (String) cbi.getSelectedItem();
    }
    public int getLaboratorioid()
    {
        return (int) cbi.getSelectedIndex();
    }

    public void setLaboratorioid(String emp )
    {
        cbi.addItem(emp);
    }

    public int getFuncionid()
    {
        return (int ) cbi2.getSelectedIndex();
    }
    public void setFuncionid(String emp)
    {
        cbi2.addItem(emp);
    }
}
