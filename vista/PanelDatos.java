package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDatos extends JPanel
{
    private Label lblab1, lblab;
    private JComboBox cbi,cbi2 ;
    private Label lblab3 ;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    public Color customColor = new Color(255, 255, 224);

    public PanelDatos()
    {
    this.setLayout(null);
   
        //label
    lblab = new Label("Seleccione el Laboratorio", JLabel.CENTER);
    lblab.setBounds(250,45,250,20);
    
    lblab.setFont(new Font("times",Font.BOLD,20));
    this.add(lblab);

    lblab1 = new Label("LABORATORIO: ");
    lblab1.setFont(new Font("times",Font.BOLD,15));
    lblab1.setForeground(new Color(47,79,79));
    lblab1.setBounds(40,105,122,20);
    this.add(lblab1);
        //lista
    cbi= new JComboBox();
    cbi.addItem(" ");
    cbi.addItem("i2 (Mesa de Fuerzas)");
    cbi.addItem("i18(1/2) (medicion de objetos)");
    cbi.addItem("i19 (Ecuaciones Empiricas)");
    cbi.addItem("i20 (MUR)");
    cbi.addItem("i22 (Ley de Hooke)");
    cbi.setBounds(180,105,250,20);

        
    this.add(cbi);


    lblab3 = new Label("¿Que Deseas Consultar?: ");
    lblab3.setFont(new Font("times",Font.BOLD,15));
    lblab3.setForeground(new Color(47,79,79));
    lblab3.setBounds(40,175,200,20);
    this.add(lblab3);
        //lista
    cbi2= new JComboBox();
    cbi2.addItem(" ");
    cbi2.addItem("¿Como Hacerlo?");
    cbi2.addItem("Materiales");
    cbi2.addItem("Ver un Video de prueba");
    cbi2.setBounds(250,175,250,20);
    this.add(cbi2);

    iImagen = new ImageIcon(getClass().getResource("/imgs/diseño.png"));
    lbImagen = new JLabel(iImagen);
    lbImagen.setBounds(0,0,800,280);
    this.add(lbImagen);

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
    public String getFuncionit()
    {
        return (String  ) cbi2.getSelectedItem();
    }
    public void setFuncionid(String emp)
    {
        cbi2.addItem(emp);
    }
}
